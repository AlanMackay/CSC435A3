// SymTabVisitor1.java
//
// This visitor class constructs a symbol table which includes the top level
// names in a Goo program, including the formal parameters of functions and
// the fields inside structs, but does not include local variables declared
// inside function bodies.

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;

public class SymTabVisitor1 extends GooBaseVisitor<Type> {
	ParseTreeProperty<Scope> scopes = new ParseTreeProperty<Scope>();
	ParseTreeProperty<Type> types = new ParseTreeProperty<Type>();
	BlockScope globals;
	Scope currentScope;
	LinkedList<Type> currentSignatureParams = new LinkedList<Type>();
	LinkedList<Type> currentSignatureResult = new LinkedList<Type>();
	boolean dumpSymTab = false;
	boolean dumpPredefineds = false;
	
	// constructor
	//  t is the -dtsy command line flag
	//  d is the -dsym command line flag
	//  p is the -dpre command line flag
	public SymTabVisitor1( boolean t, boolean d, boolean p ) {
		Symbol.tracing = t;
		dumpSymTab = d;
		dumpPredefineds = p;
	}

	// default constructor
	public SymTabVisitor1() {
		Symbol.tracing = false;
		dumpSymTab = false;
		dumpPredefineds = false;
	}

	// ************ methods for accessing scope/type info for nodes

	// associate scope s with parse tree node ctx
	void saveScope(ParserRuleContext ctx, Scope s) {
		scopes.put(ctx, s);
	}

	public ParseTreeProperty<Scope> getScopes() {
		return scopes;
	}

	// associate type t with parse tree node ctx
	Type saveType(ParserRuleContext ctx, Type t) {
		types.put(ctx, t);
		return t;
	}

	public ParseTreeProperty<Type> getTypes() {
		return types;
	}

    // utility functions
    
    static public String normalizeString( String raw, ParserRuleContext ctx ) {
        StringBuilder sb = new StringBuilder();
        if (raw.charAt(0) == '\"') {
            for( int i=1; ; i++ ) {
                int n;
                char c = raw.charAt(i);
                if (c=='\"') break;     // end of string
                if (c=='\\') {
                    c = raw.charAt(++i);
                    switch(c) {
                        case 'n':   c = '\n';  break;
                        case 't':   c = '\t';  break;
                        case 'r':   c = '\r';  break;
                        case 'b':   c = '\b';  break;
                        case '\\':  break;
                        case '\"':  break;
                        case 'x':
                            n = unhex(raw.charAt(++i))*16;
                            n += unhex(raw.charAt(++i));
                            c = (char)n;
                            break;
                        default:
                            ReportError.error(ctx, "unsupported escape code in strings: \\"+c);
                            return "";
                    }
                }
                sb.append(c);
            }
        }
        return sb.toString();
    }
    
    static public int unhex( char c ) {
        if (c>='0' && c<='9') return c-'0';
        if (c>='a' && c<='f') return c-'a'+10;
        if (c>='A' && c<='F') return c-'A'+10;
        return Integer.MAX_VALUE;  // cause a crash somewhere!
    }

	// *********** Visit methods follow *******************

    @Override
	public Type visitSourceFile(GooParser.SourceFileContext ctx) {
		globals = new BlockScope(null);
		globals.setScopeName("predefined names");
		Predefined.AddPredefinedNames(globals);
		currentScope = new BlockScope(globals);
		currentScope.setScopeName("package level names");
		saveScope(ctx, currentScope);
	    if (dumpSymTab || Symbol.tracing)
	        System.out.println("\n=== Pass 1 Output ===\n");
        visitChildren(ctx);
		if (dumpSymTab)
			currentScope.dumpScope();
		currentScope = currentScope.getEnclosingScope();
		if (dumpPredefineds)
			currentScope.dumpScope();
		return null;
	}

    @Override
    public Type visitTypeName(GooParser.TypeNameContext ctx) {
		String name = ctx.getText();
		Symbol sy = currentScope.resolve(name);
		if (sy == null)     // forward reference to a type?

		    return Type.unknownType;
		if (sy.getKind() != Symbol.Kind.TypeName) {
			ReportError.error(ctx, name+" is not a type");
			return Type.unknownType;
		}
		return saveType(ctx,sy.getType());
    }

    @Override
	public Type visitArrayType(GooParser.ArrayTypeContext ctx) {
		Type t = visit(ctx.elementType());
		return saveType(ctx,Type.newArrayType(t));
	}


    @Override
	public Type visitSliceType(GooParser.SliceTypeContext ctx) {
		Type t = visit(ctx.elementType());
		return saveType(ctx,Type.newSliceType(t));
	}

    @Override
	public Type visitStructType(GooParser.StructTypeContext ctx) {
	    Type t = Type.newStructType(currentScope);
		currentScope = (Scope)t;
	    visitChildren(ctx);
		currentScope = currentScope.getEnclosingScope();
		return saveType(ctx,t);
	}

    @Override
	public Type visitFieldDecl(GooParser.FieldDeclContext ctx) {
		List<Token> ids = ctx.identifierList().idl;
		Type typ = visit(ctx.type());
		if (ids != null) {
		    for( Token t : ids ) {
		        Symbol sy = new Symbol(t, Symbol.Kind.Field, typ, currentScope);
		        currentScope.define(sy);
		    }
		}
		return saveType(ctx,typ);
	}

    @Override
	public Type visitPointerType(GooParser.PointerTypeContext ctx) {
		Type t = visit(ctx.baseType());
		return saveType(ctx,Type.newPointerType(t));
	}

    @Override
	public Type visitSignature(GooParser.SignatureContext ctx) {
        Type rt = null;
		// currentSignatureParams should contain all the input parameters
		// Just have to grab the result type, if there is one
		visit(ctx.parameters());
		if (ctx.result() != null)
		    rt = visit(ctx.result());
		if (rt != null)
			currentSignatureResult.add(rt);
		return saveType(ctx,Type.newFunctionSignature(currentSignatureParams,currentSignatureResult));
	}

    @Override
	public Type visitParameterDecl(GooParser.ParameterDeclContext ctx) {
        visitChildren(ctx);
		List<Token> ids = ctx.identifierList().idl;
		Type typ = visit(ctx.type());
		if (ids != null) {
		    for( Token t : ids ) {
		        Symbol sy = new Symbol(t, Symbol.Kind.Formal, typ, currentScope);
		        currentScope.define(sy);
		        currentSignatureParams.add(typ);
		    }
		}
		return saveType(ctx,typ);
	}

    @Override
	public Type visitConstSpec(GooParser.ConstSpecContext ctx) {
		List<Token> ids = ctx.identifierList().idl;
		GooParser.ConstSpecRemContext csrx = ctx.constSpecRem();
		Type typ = Type.unknownType;  // use this if type is missing
		if (csrx != null)
			typ = visit(csrx.type());
		for( Token t : ids ) {
			String name = t.getText();
			Symbol sy = new Symbol(t, Symbol.Kind.Constant, typ, currentScope);
			currentScope.define(sy);
		}
		return saveType(ctx,typ);
	}

    @Override
	public Type visitTypeSpec(GooParser.TypeSpecContext ctx) {
		Token id = ctx.Identifier().getSymbol();
		Type t = visit(ctx.type());
		Type namedType = t.makeNamedCopy(id.getText());
		Symbol sy = new Symbol(id, Symbol.Kind.TypeName, namedType, currentScope);
		currentScope.define(sy);
		return saveType(ctx,namedType);
	}

    @Override
	public Type visitVarSpec(GooParser.VarSpecContext ctx) {
		Type typ = visit(ctx.varSpecRem());
		List<Token> ids = ctx.identifierList().idl;
		if (ids != null) {
		    for( Token tt : ids ) {
		        Symbol sy = new Symbol(tt, Symbol.Kind.Variable, typ, currentScope);
		        currentScope.define(sy);
		        
		    }
		}
        return saveType(ctx,typ);
	}

    @Override
	public Type visitVarSpecRem(GooParser.VarSpecRemContext ctx) {
        if (ctx.type() != null)
            return saveType(ctx,visit(ctx.type()));
		return Type.unknownType; // use this if type is missing from the declaration
	}

    @Override
	public Type visitFunctionDecl(GooParser.FunctionDeclContext ctx) {
		Token funcId = ctx.functionName().Identifier().getSymbol();
		String funcName = funcId.getText();
		FunctionSymbol function = new FunctionSymbol(funcName, currentScope);
		function.setLineNumber(funcId.getLine());
		currentScope.define(function);	// add function defn to current scope
		currentScope = function;		// enter this new scope
		saveScope(ctx, currentScope);	// remember scope for this parse tree node
		currentSignatureParams.clear(); // prepare to build the signature: param types
		currentSignatureResult.clear();	// prepare to build the signature: result types
		Type signature = Type.unknownType;
		if (ctx.signature() != null) {
			signature = visit(ctx.signature());
		} else if (ctx.function() != null)
			signature = visit(ctx.function());
		function.setType(signature);
		currentScope = currentScope.getEnclosingScope();  // exit scope
		return saveType(ctx,signature);
	}

    @Override
    public Type visitFunction(GooParser.FunctionContext ctx) {
        return saveType(ctx,visit(ctx.signature()));
    }

	// importPath:   StringLit ;
	@Override
	public Type visitImportPath(GooParser.ImportPathContext ctx) {
	    // System.out.println("importing: "+ctx.StringLit().getText());
	    String path = normalizeString(ctx.StringLit().getText(), ctx);
	    Packages.handleImport(path, currentScope, ctx);
	    return null;
	}

}
