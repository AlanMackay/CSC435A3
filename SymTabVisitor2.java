// SymTabVisitor2.java
//

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;

public class SymTabVisitor2 extends GooBaseVisitor<Type> {
	ParseTreeProperty<Scope> scopes;
	ParseTreeProperty<Type> types;
	BlockScope globals;
	Scope currentScope;
	LinkedList<Type> currentSignatureParams = new LinkedList<Type>();
	LinkedList<Type> currentSignatureResult = new LinkedList<Type>();
	int arraySize = 0;
	boolean dumpSymTab = false;
	
	// ************** constructors ******************

	// constructor
	//  trace is the -dtsy command line flag
	//  dump  is the -dsym command line flag
	public SymTabVisitor2( boolean trace, boolean dump, boolean p ) {
		Symbol.tracing = trace;
		dumpSymTab = dump;
	}

	// default constructor
	public SymTabVisitor2() {
		Symbol.tracing = false;
		dumpSymTab = false;
	}

	// ******methods for associating data with tree nodes *********

	// associate scope s with parse tree node ctx
	void saveScope(ParserRuleContext ctx, Scope s) {
		scopes.put(ctx, s);
	}

	// obtain current scope previously associated with node ctx
	void lookupScope(ParserRuleContext ctx) {
		currentScope = scopes.get(ctx);
	}

	public void setScopes(ParseTreeProperty<Scope> scopes) {
		this.scopes = scopes;
	}

	public ParseTreeProperty<Scope> getScopes() {
		return scopes;
	}

	// access or set type information associated with a node

	public void setTypes(ParseTreeProperty<Type> types) {
		this.types = types;
	}

	public ParseTreeProperty<Type> getTypes() {
		return types;
	}

	// attaches a type to a parse tree node; the type is returned as
	// the method result because allows visit methods to use succinct
	// code like this when returning from a visit to node ctx:
	//        return associateType(ctx,typ);
	// instead of two statements like this:
	//        associateType(ctx,typ); return typ;
	public Type associateType(ParserRuleContext ctx, Type typ) {
		types.put(ctx, typ);
		return typ;
	}

	public Type lookupType(ParserRuleContext ctx) {
		return types.get(ctx);
	}

    // Updates the type in a symbol table entry;
    // the entry is created if it does not exist in current scope
    public void updateOrDefine(Token tok, Symbol.Kind k, Type typ) {
        Symbol sy = currentScope.resolveInCurrent(tok.getText());
        if (sy != null) {
            sy.setType(typ);
        } else {
            sy = new Symbol(tok, k, typ, currentScope);
            currentScope.define(sy);
        }
	}

    public Type identType( Token tok, ParserRuleContext ctx) {
        Symbol sy = currentScope.resolve(tok.getText());
        if (sy == null) {
            sy = new Symbol(tok, Symbol.Kind.Unknown, Type.unknownType, currentScope);
            currentScope.define(sy);
            ReportError.error(ctx, "undeclared identifier: "+tok.getText());
        }
        return sy.getType();
    }

	// *************** Visit methods *******************
	
	/* Note: 
		Tthese visit methods are in exactly the same order as
	   	the corresponding grammar rules in Goo.g4.
	   	If a visitor method is not needed for a group of rules with
	    the same LHS, a comment listing the rule(s) appears instead.
	   	This helps ensure that no rule has been missed.
	*/ 

	@Override
	public Type visitType(GooParser.TypeContext ctx) {
	    if (ctx.type() != null)
	        return associateType(ctx, visit(ctx.type()));
	    return associateType(ctx, visitChildren(ctx));
	}

    @Override
    public Type visitTypeName(GooParser.TypeNameContext ctx) {
		String name = ctx.getText();
		Symbol sy = currentScope.resolve(name);
		if (sy == null || sy.getKind() != Symbol.Kind.TypeName) {
			ReportError.error(ctx, name+" is not a type");
			return Type.unknownType;
		}
		return associateType(ctx, sy.getType());
    }

	// typeLit:   arrayType | structType | pointerType | sliceType ;

    @Override
	public Type visitArrayType(GooParser.ArrayTypeContext ctx) {
		Type typ = lookupType(ctx);
		visit(ctx.arrayLength());
		Type et = visit(ctx.elementType());
		if (typ == null)
			typ = Type.newArrayType(et);
		else
			((Type.Array)typ).setElementType(et);
		((Type.Array)typ).setSize(arraySize);
		return associateType(ctx,typ);
	}

    @Override
	public Type visitArrayLength(GooParser.ArrayLengthContext ctx) {
		Type typ = visit(ctx.expression());
		arraySize = getIntValue(ctx.expression());
		TypeChecking.checkAssignability(Predefined.intType, typ, ctx);
		return associateType(ctx,typ);
	}

	// elementType:   type ;

    @Override
	public Type visitSliceType(GooParser.SliceTypeContext ctx) {
		Type typ = lookupType(ctx);
		if (typ != null && typ.isComplete()) return typ;
		Type et = visit(ctx.elementType());
		if (typ == null)
			typ = Type.newSliceType(et);
		else
			((Type.Slice)typ).setElementType(et);
		return associateType(ctx,typ);
	}

    @Override
	public Type visitStructType(GooParser.StructTypeContext ctx) {
		Type typ = lookupType(ctx);
		if (typ != null && typ.isComplete()) return typ;
	    Type newt = Type.newStructType(currentScope);
		currentScope = (Scope)newt;
	    visitChildren(ctx);
		currentScope = currentScope.getEnclosingScope();
	    if (typ != null) {
	    	// copy over the hopefully fully complete fields of the struct
	    	Map<String, Symbol> dest = ((Type.Struct)typ).getFields();
	    	dest.clear();
	    	dest.putAll(((Type.Struct)newt).getFields());
	    	newt = typ;
	    }
		return associateType(ctx,newt);
	}

	// fieldDeclList:  /* empty */ |  (fieldDecl ';')* fieldDecl optSemi ;
	
    @Override
	public Type visitFieldDecl(GooParser.FieldDeclContext ctx) {
		List<Token> ids = ctx.identifierList().idl;
		Type typ = visit(ctx.type());
		if (ids != null) {
		    for( Token tok : ids ) {
		        updateOrDefine(tok, Symbol.Kind.Field, typ);
		    }
		}
		return associateType(ctx,typ);
	}

    @Override
	public Type visitPointerType(GooParser.PointerTypeContext ctx) {
		Type typ = lookupType(ctx);
		if (typ != null && typ.isComplete()) return typ;
		Type bt = visit(ctx.baseType());
		if (typ == null)
			typ = Type.newPointerType(bt);
		else
			((Type.Pointer)typ).setBaseType(bt);
		return associateType(ctx,typ);
	}

	// baseType:   type ;
	
    @Override
	public Type visitSignature(GooParser.SignatureContext ctx) {
		Type typ = lookupType(ctx);
		if (typ != null && typ.isComplete()) return typ;
		// currentSignatureParams should contain all the input parameters
		// Just have to grab the result type, if there is one
		visit(ctx.parameters());
		Type rt = null;
		if (ctx.result() != null)
		    rt = visit(ctx.result());
		if (rt != null)
			currentSignatureResult.add(typ);
		if (typ == null)
			typ = Type.newFunctionSignature(currentSignatureParams,currentSignatureResult);
		else {
			((Type.Function)typ).setParameters(currentSignatureParams);
			((Type.Function)typ).setResults(currentSignatureResult);
		}
		return associateType(ctx,typ);
	}

	// result:   type ;

	// parameters:   '(' ( parameterList ','? )? ')' ;

	// parameterList:   parameterDecl (',' parameterDecl)*  ;

    @Override
	public Type visitParameterDecl(GooParser.ParameterDeclContext ctx) {
		Type typ = lookupType(ctx);
		if (typ != null && typ.isComplete()) return typ;
        visitChildren(ctx);
		List<Token> ids = ctx.identifierList().idl;
		typ = visit(ctx.type());
		if (ids != null) {
		    for( Token tok : ids ) {
		        updateOrDefine(tok, Symbol.Kind.Formal, typ);
		        currentSignatureParams.add(typ);
		    }
		}
		return associateType(ctx,typ);
	}

	@Override
	public Type visitMethodName(GooParser.MethodNameContext ctx) {
	    return associateType(ctx, identType(ctx.Identifier().getSymbol(), ctx));
	}

	@Override
	public Type visitBlock(GooParser.BlockContext ctx) {
		currentScope = new BlockScope(currentScope);
		visit(ctx.statementList());
		if (dumpSymTab)
		    currentScope.dumpScope();
		currentScope = currentScope.getEnclosingScope();
		return Type.voidType;
	}

	// statementList :	/* empty */ | (statement ';')* statement optSemi ;

	// declaration:   constDecl | typeDecl | varDecl ;

	// topLevelDeclList:    /* empty */ | (topLevelDecl ';')* topLevelDecl optSemi ;

	// topLevelDecl:   declaration | functionDecl ;

	// constDecl:   CONST constSpec | CONST '(' constSpecList ')' ;

	// constSpecList:   /* empty */ | (constSpec ';')* constSpec optSemi ;

    @Override
	public Type visitConstSpec(GooParser.ConstSpecContext ctx) {
		List<Token> ids = ctx.identifierList().idl;
		GooParser.ConstSpecRemContext csrx = ctx.constSpecRem();
		Type typ = Type.unknownType;  // use this if type is missing
		if (csrx.type() != null)
			typ = visit(csrx.type());
		return matchNamesToTypes(typ, ids, Symbol.Kind.Constant);
	}

	@Override
	public Type visitConstSpecRem(GooParser.ConstSpecRemContext ctx) {
		Type typ = Type.unknownType;
		GooParser.TypeContext tcxt = ctx.type();
		if (tcxt != null)
			typ = visit(tcxt);
		Type.TypeList typeList = (Type.TypeList)visit(ctx.expressionList());
		if (typ == Type.unknownType)
			return typeList;
		// otherwise have to check that the expressions are compatible
		for( Type et : typeList.getTypes() ) {
			TypeChecking.checkAssignability(typ, et, ctx);
		}
		return typ;
	}

	// identifierList:   idl+=Identifier (',' idl+=Identifier)*  ;

	// expressionList:   exl+=expression (',' exl+=expression)*  ;
	@Override
	public Type visitExpressionList(GooParser.ExpressionListContext ctx) {
	    List<GooParser.ExpressionContext> exps = ctx.exl;
	    LinkedList<Type> types = new LinkedList<Type>();
	    for(GooParser.ExpressionContext exp : exps) {
	        Type typ = visit(exp);
	        types.add(typ);
	    }
	    return Type.newTypeList(types);
	}

	// typeDecl:   TYPE typeSpec | TYPE '(' typeSpecList ')' ;

	// typeSpecList:   /* empty */ | (typeSpec ';')* typeSpec optSemi ;

    @Override
	public Type visitTypeSpec(GooParser.TypeSpecContext ctx) {
		Type typ = lookupType(ctx);
		if (typ != null && typ.isComplete()) return typ;
		Token id = ctx.Identifier().getSymbol();
		typ = visit(ctx.type());
		updateOrDefine(id, Symbol.Kind.TypeName, typ);
		return associateType(ctx,typ);
	}

	// varDecl:   VAR varSpec | VAR '(' varSpecList ')' ;

	// varSpecList:   /* empty */ | (varSpec ';')* varSpec optSemi ;

    @Override
	public Type visitVarSpec(GooParser.VarSpecContext ctx) {
		Type typ = visit(ctx.varSpecRem());
		List<Token> ids = ctx.identifierList().idl;
		return matchNamesToTypes(typ, ids, Symbol.Kind.Variable);
	}

    @Override
	public Type visitVarSpecRem(GooParser.VarSpecRemContext ctx) {
		Type typ = lookupType(ctx);
		if (typ != null && typ.isComplete()) return typ;
		GooParser.TypeContext tct = ctx.type();
        if (tct != null)
            typ = visit(tct);
        GooParser.ExpressionListContext exctx = ctx.expressionList();
        Type.TypeList extyp = null;
        if (exctx != null)
        	extyp = (Type.TypeList)visit(exctx);
        if (typ != null && extyp != null) {
        	for( Type et : extyp.getTypes() ) {
        		TypeChecking.checkAssignability(typ, et, ctx);
        	}
        	return associateType(ctx,typ);
        }
        if (extyp != null)
        	return associateType(ctx, extyp);
        if (typ != null)
        	return associateType(ctx, typ);
        if (typ != Type.unknownType)
            ReportError.error(ctx, "could not determine types of variable(s)");
		return Type.unknownType;
	}

	@Override
	public Type visitShortVarDecl(GooParser.ShortVarDeclContext ctx) {
		Type typ = lookupType(ctx);
		if (typ != null && typ.isComplete()) return typ;
		List<Token> ids = ctx.identifierList().idl;
		typ = visit(ctx.expressionList());
		return associateType(ctx, matchNamesToTypes(typ, ids, Symbol.Kind.Variable));
	}

    @Override
	public Type visitFunctionDecl(GooParser.FunctionDeclContext ctx) {
		Token funcId = ctx.functionName().Identifier().getSymbol();
		String funcName = funcId.getText();
		// the function is a package level name and is already in the symbol table
		FunctionSymbol function = (FunctionSymbol)currentScope.resolveInCurrent(funcName);
		currentScope = function;		// enter the new scope
		currentSignatureParams.clear(); // prepare to rebuild the signature: param types
		currentSignatureResult.clear();	// prepare to rebuild the signature: result types
		Type signature = Type.unknownType;
		if (ctx.signature() != null) {
			signature = visit(ctx.signature());
			function.setType(signature);
		} else if (ctx.function() != null)
			signature = visit(ctx.function());
		currentScope = currentScope.getEnclosingScope();  // exit scope
		return associateType(ctx,signature);
	}

	// functionName:   Identifier ;

    @Override
    public Type visitFunction(GooParser.FunctionContext ctx) {
        Type signature = visit(ctx.signature());
        ((Symbol)currentScope).setType(signature);
        visit(ctx.functionBody());
        return associateType(ctx,signature);
    }

	// functionBody:   block ;

	// operand:   literal | operandName | '(' expression ')' ;
	@Override
	public Type visitOperand(GooParser.OperandContext ctx) {
	    if (ctx.expression() != null)
	        return associateType(ctx,visit(ctx.expression()));
	    return associateType(ctx,visitChildren(ctx));
	}

	// literal:   basicLit | compositeLit ;

	@Override
	public Type visitBasicLit(GooParser.BasicLitContext ctx) {
	    Type typ;
		if (ctx.IntLit() != null || ctx.FloatLit() != null)
			typ = Type.newUntypedNumber(ctx.getText());
		else if (ctx.StringLit() != null)
			typ = Predefined.stringType;
		else
			typ = Predefined.runeType;
		return associateType(ctx,typ);
	}

    @Override
    public Type visitOperandName(GooParser.OperandNameContext ctx) {
        if (ctx.qualifiedIdent() != null)
            return associateType(ctx,visit(ctx.qualifiedIdent()));
        return associateType(ctx,identType(ctx.Identifier().getSymbol(), ctx));
    }

	@Override
	public Type visitQualifiedIdent(GooParser.QualifiedIdentContext ctx) {
		String pkgName = ctx.packageName().getText();
		String memberName = ctx.Identifier().getText();
		Symbol pkg = currentScope.resolve(pkgName);
		if (pkg != null && pkg.getKind() == Symbol.Kind.Package) {
			Symbol member = ((Packages.PackageSymbol)pkg).getMember(memberName);
			if (member != null)
				return associateType(ctx,member.getType()); 
			ReportError.error(ctx, pkgName + "." + memberName + " not found");
		} else
			ReportError.error(ctx, "package " + pkgName + " not found");
		return Type.unknownType;
	}

	@Override
	public Type visitCompositeLit(GooParser.CompositeLitContext ctx) {
		Type typ = visit(ctx.literalType());
		Type extyp = visit(ctx.literalValue());
		TypeChecking.checkAssignability(typ, extyp, ctx);
		return associateType(ctx,typ);
	}

	@Override
	public Type visitLiteralType(GooParser.LiteralTypeContext ctx) {
		if (ctx.elementType() != null)
			return associateType(ctx,Type.newSliceType(visit(ctx.elementType())));
		else
			return associateType(ctx,super.visitLiteralType(ctx));
	}

	@Override
	public Type visitLiteralValue(GooParser.LiteralValueContext ctx) {
		GooParser.ElementListContext expList = ctx.elementList();
		if (expList == null || expList.exl.size() == 0)
			return associateType(ctx,Type.newTypeList(new Type[0]));
		Type[] extypes = new Type[expList.exl.size()];
		int k = 0;
		for( GooParser.ElementContext xctx : expList.exl )
			extypes[k++] = visit(xctx);
		return associateType(ctx,Type.newTypeList(extypes));
	}

	// elementList:   exl+=element (',' exl+=element)*  ;

	// element:   value ;

	// value:   expression | literalValue ;

	@Override
	public Type visitPrimaryExpr(GooParser.PrimaryExprContext ctx) {
		if (ctx.operand() != null)
			return associateType(ctx,visit(ctx.operand()));
		if (ctx.conversion() != null)
			return associateType(ctx,visit(ctx.conversion()));
		Type typ = visit(ctx.primaryExpr());
		if (ctx.selector() != null) {
			// it parses as selecting a field from a struct or a
			// method from an imported package
			String fieldName = ctx.selector().Identifier().getText();
			if (typ instanceof Type.Struct) {
				Symbol s = ((Type.Struct)typ).resolveInCurrent(fieldName);
				if (s != null)
					return associateType(ctx,s.getType());
				ReportError.error(ctx, "field "+fieldName+" not found");
			} else if (typ instanceof Type.Pointer) {
			    Type.Pointer ptyp = (Type.Pointer)typ;
			    if (ptyp.getBaseType() instanceof Type.Struct) {
			        Type.Struct styp = (Type.Struct)ptyp.getBaseType();
			        Symbol s = styp.resolveInCurrent(fieldName);
    				if (s != null)
    					return associateType(ctx,s.getType());
    				ReportError.error(ctx, "field "+fieldName+" not found");
			    } else if (ptyp.getBaseType() != Type.unknownType)
			        ReportError.error(ctx, "dot operator applied to non-struct value");
			} else if (typ != Type.unknownType) {
			    // maybe it was a package name on the left of the dot
			    String lhs = ctx.primaryExpr().getText();
			    Symbol sy = currentScope.resolve(lhs);
			    if (sy != null && sy instanceof Packages.PackageSymbol) {
			        Packages.PackageSymbol pkg = (Packages.PackageSymbol)sy;
			        Symbol mem = pkg.getMember(fieldName);
			        if (mem != null)
			            return associateType(ctx, mem.getType());
			        ReportError.error(ctx, "package "+lhs+", unimplemented member: "+fieldName);
			    } else
				    ReportError.error(ctx, "dot operator applied to non-struct value");
			}
		}
		if (ctx.index() != null) {
			// it parses as array or slice indexing
			visit(ctx.index());
			if (typ instanceof Type.Array)
				return associateType(ctx,((Type.Array)typ).getElementType());
			if (typ instanceof Type.Slice)
				return associateType(ctx,((Type.Slice)typ).getElementType());
			if (typ != Type.unknownType)
			    ReportError.error(ctx, "only an array or slice can be indexed");
		}
		if (ctx.slice() != null) {
			// it parses as taking a slice
			visit(ctx.slice());
			if (typ instanceof Type.Slice)
				return associateType(ctx,typ);
			// NOT HANDLED -- taking a slice of an array or a string or
			// a pointer to an array; see
			//   https://golang.org/ref/spec#Slice_expressions
			if( typ instanceof Type.Array)
				return associateType(ctx, ((Type.Array)typ).getElementType());
			if(typ == Type.stringType)
				return associateType(ctx, typ);
			if(typ instanceof Type.Pointer)
				return associateType(ctx, ((Type.Pointer)typ).getBaseType());
			if (typ != Type.unknownType)
			    ReportError.error(ctx, "slice/array/string type required");
		}
		if (ctx.arguments() != null) {
			// it parses as a function call
			Type args = visit(ctx.arguments());
			if (typ instanceof Type.Function) {
				return associateType(ctx,TypeChecking.checkFunctionCall((Type.Function)typ,
				    ((Type.TypeList)args).getTypes(), ctx));
			}
			String fnpart = ctx.primaryExpr().getText();
			Symbol fn = currentScope.resolve(fnpart);
			if (fn != null && fn.getKind() == Symbol.Kind.TypeName) {
				// handle the grammar ambiguity
			    if (((Type.TypeList)args).getTypes().length != 1)
			        ReportError.error(ctx, "type conversion requires one argument");
			    return associateType(ctx,typ);  // check for valid conversion will be in pass 3
			}
			if (typ != Type.unknownType)
			    ReportError.error(ctx, "arguments can be passed only to a function");
		}
		return Type.unknownType;
	}

	// selector:   '.' Identifier ;

	@Override
	public Type visitIndex(GooParser.IndexContext ctx) {
	    Type ixtyp = visit(ctx.expression());
		TypeChecking.checkAssignability(Predefined.intType, ixtyp, ctx);	// index must be an int
		return associateType(ctx,ixtyp);
	}

	@Override
	public Type visitSlice(GooParser.SliceContext ctx) {
		List<GooParser.ExpressionContext> positions = ctx.expression();
		for( GooParser.ExpressionContext pos : positions )
			TypeChecking.checkAssignability(Predefined.intType, visit(pos), pos);
		return Type.unknownType;
	}

	@Override
	public Type visitArguments(GooParser.ArgumentsContext ctx) {
		if (ctx.expressionList() == null)
			return associateType(ctx,Type.newTypeList(new Type[0]));
		LinkedList<Type> list = new LinkedList<Type>();
		for( GooParser.ExpressionContext exp : ctx.expressionList().exl ) {
		    Type typ = visit(exp);
		    assert typ != null;
			list.add(typ);
		}
		return associateType(ctx,Type.newTypeList(list));
	}

	// expression:   unaryExpr # UnExp ;
	@Override
	public Type visitUnExp(GooParser.UnExpContext ctx){
		return associateType(ctx, visit(ctx.unaryExpr()));
	}

	@Override
	public Type visitNumExp(GooParser.NumExpContext ctx) {
		Type lhs = visit(ctx.expression(0));
		Type rhs = visit(ctx.expression(1));
		if (ctx.mulOp() != null)
			return associateType(ctx,TypeChecking.checkBinOp(lhs, rhs, ctx.mulOp().getText(), ctx));
		return associateType(ctx,TypeChecking.checkBinOp(lhs, rhs, ctx.addOp().getText(), ctx));
	}

	@Override
	public Type visitRelExp(GooParser.RelExpContext ctx) {
		Type lhs = visit(ctx.expression(0));
		Type rhs = visit(ctx.expression(1));
		return associateType(ctx,TypeChecking.checkBinOp(lhs, rhs, ctx.relOp().getText(), ctx));
	}
	
	@Override
	public Type visitBoolExp(GooParser.BoolExpContext ctx) {
		Type lhs = visit(ctx.expression(0));
		Type rhs = visit(ctx.expression(1));
		TypeChecking.checkAssignability(Type.boolType,lhs,ctx);
		TypeChecking.checkAssignability(Type.boolType,rhs,ctx);
		return associateType(ctx,Type.boolType);
	}

	@Override
	public Type visitUnaryExpr(GooParser.UnaryExprContext ctx) {
		if (ctx.unaryOp() != null) {
			Type opnd = visit(ctx.unaryExpr());
			return associateType(ctx,TypeChecking.checkUnaryOp(opnd, ctx.unaryOp().getText(), ctx));
		}
		return associateType(ctx,visit(ctx.primaryExpr()));
	}

	// relOp:     '==' | '!=' | '<' | '<=' | '>' | '>=' ;
	// addOp:     '+' | '-' | '|' | '^' ;
	// mulOp:     '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' ;
	// unaryOp:   '+' | '-' | '!' | '^' | '*' | '&' ;

    // Careful, conversions can have the same syntax as function calls
	@Override
	public Type visitConversion(GooParser.ConversionContext ctx) {
	    Type typ = visit(ctx.type());
	    Type arg = visit(ctx.expression());
	    if (typ.isNamedType())
	        return associateType(ctx,typ); // we will check the legality of the conversion in pass 3
	    // is it a function call, the ambiguity??
	    if (typ instanceof Type.Function)
	        return associateType(ctx,TypeChecking.checkFunctionCall((Type.Function)typ, new Type[]{arg}, ctx));
	    if (typ == Type.unknownType)
	    	return typ;
	    // if the typ part is an identifier, we have an error because that identifier
	    // is not a type name nor a function name
	    String possibleId = ctx.type().getText();
	    Symbol possibleSym = currentScope.resolve(possibleId);
	    if (possibleSym != null) {
	        ReportError.error(ctx, "unknown function or typename: "+possibleId);
			return Type.unknownType;
		}
		// otherwise must be OK (a type but not a type name)
		return associateType(ctx,typ);
	}

	// statement:   declaration | labeledStmt | simpleStmt
	//          |   returnStmt | breakStmt | continueStmt
	//          |   gotoStmt | block | ifStmt | forStmt ;

	// simpleStmt:   emptyStmt | expressionStmt
	//          |   incDecStmt | assignment | shortVarDecl ;

	// emptyStmt: ;

	@Override
	public Type visitLabeledStmt(GooParser.LabeledStmtContext ctx) {
		Token tok = ctx.label().Identifier().getSymbol();
		Symbol lab = new LabelSymbol(tok, currentScope);
		currentScope.define(lab);
		return associateType(ctx,visit(ctx.statement()));
	}

	// label:   Identifier ;

	// expressionStmt:   expression ;

	@Override
	public Type visitIncDecStmt(GooParser.IncDecStmtContext ctx) {
		Type opnd = visit(ctx.expression());
		return TypeChecking.checkUnaryOp(opnd, "++", ctx);	// check for being an L-value left for pass 3
	}

	@Override
	public Type visitAssignment(GooParser.AssignmentContext ctx) {
		List<GooParser.ExpressionContext> left  = ctx.expressionList(0).exl;
		List<GooParser.ExpressionContext> right = ctx.expressionList(1).exl;
		int len = left.size();
		if (len != right.size()) {
			ReportError.error(ctx, "assignment requires equal numbers of terms on left and right");
			if (len > right.size()) len = right.size();
		}
		for( int k=0; k<len; k++ ) {
			Type ltyp = visit(left.get(k));
			Type rtyp = visit(right.get(k));
			TypeChecking.checkAssignability(ltyp, rtyp, ctx);
		}
		return Type.voidType;
	}

	// assignOp:   '=' | addOp '=' | mulOp '=' ;

	@Override
	public Type visitIfStmt(GooParser.IfStmtContext ctx) {
		if (ctx.simpleStmt() != null) visit(ctx.simpleStmt());
		Type typ = visit(ctx.expression());
		TypeChecking.checkAssignability(Type.boolType, typ, ctx);
		visit(ctx.block());
		return visit(ctx.elsePart());
	}

	@Override
	public Type visitElsePart(GooParser.ElsePartContext ctx) {
		if (ctx.ifStmt() != null) visit(ctx.ifStmt());
		if (ctx.block() != null) visit(ctx.block());
		return Type.voidType;
	}

	// forStmt:   FOR condition block | FOR forClause block ;

	@Override
	public Type visitCondition(GooParser.ConditionContext ctx) {
		Type typ = visit(ctx.expression());
		TypeChecking.checkAssignability(Predefined.boolType, typ, ctx);
		return associateType(ctx,Type.boolType);
	}

	// forClause:   initStmt ';' condition? ';' postStmt ;

	// initStmt:   simpleStmt ;

	// postStmt:   simpleStmt ;

	@Override
	public Type visitReturnStmt(GooParser.ReturnStmtContext ctx) {
		FunctionSymbol fsy = currentFunction();
		if (ctx.expressionList() != null) {
			Type.TypeList typ = (Type.TypeList)visit(ctx.expressionList());
			Type[] retTypes = typ.getTypes();
			Type[] resultTypes = ((Type.Function)(fsy.getType())).getResults();
			if (retTypes.length > resultTypes.length)
				ReportError.error(ctx, "too many results returned from function");
			for( int k=0; k<resultTypes.length; k++ )
				TypeChecking.checkAssignability(resultTypes[k], retTypes[k], ctx);
		}
		return Type.voidType;
	}

	// breakStmt:   BREAK | BREAK label ;

	// continueStmt:   CONTINUE | CONTINUE label ;

	// gotoStmt:   GOTO label ;

    @Override
	public Type visitSourceFile(GooParser.SourceFileContext ctx) {
	    if (dumpSymTab || Symbol.tracing)
	        System.out.println("\n=== Pass 2 Output ===\n");
		lookupScope(ctx);
        visitChildren(ctx);
		if (dumpSymTab)
			currentScope.dumpScope();
		currentScope = currentScope.getEnclosingScope();
		return null;
	}

	// packageClause:   PACKAGE packageName ;
	
	// packageName:   Identifier ;

	// importDeclList:   (importDecl ';')*  ;

	// importDecl:   IMPORT importSpec | IMPORT '(' importSpecList ')' ;

	// importSpecList:  /* empty */ | (importSpec ';')* importSpec optSemi ;

	// importSpec:   importPath ;

	// importPath:   StringLit ;


// ********************** utility methods ********************************

	private Type matchNamesToTypes( Type typ, List<Token> ids, Symbol.Kind kind ) {
		Type[] typeList = null;
		if (typ == null)
			typ = Type.unknownType;
		if (typ instanceof Type.TypeList) {
			typeList = ((Type.TypeList)typ).getTypes();
			if (typeList.length != ids.size()) {
				ReportError.error("number of initializers does not match number of identifiers");
				typeList = null;
				typ = Type.unknownType;
			}
		}
		int k = 0;
		if (ids != null) {
		    for( Token tt : ids ) {
				Type theType;
				if (typeList != null)
					theType = typeList[k++];
				else
					theType = typ;				
				updateOrDefine(tt, kind, theType);
		    }
		}
		return typ;
	}

	// scans up enclosing scopes to find current function
	// CRASHES IF CALLED WHEN CURRENT SCOPE IS PACKAGE LEVEL !! 
	private FunctionSymbol currentFunction() {
		Scope scope = currentScope;
		while( !(scope instanceof FunctionSymbol) )
			scope = scope.getEnclosingScope();
		return (FunctionSymbol)scope;
	}

	// This function returns the value of an expression used where
	// an integer constant is needed -- i.e. an array size.
	// It requires type checking to have previously been performed
	// on the expression.
	// Only explicit constants and named constants with known integer
	// values are supported as the expressions. (Go allows expressions
	// with constant values.)
	private int getIntValue(ParserRuleContext ctx) {
		Type typ = lookupType(ctx);
		if (typ != null && typ instanceof Type.UntypedNumber) {
			Type.UntypedNumber utyp = (Type.UntypedNumber)typ;
			if (utyp.isInteger()) {
				long v = utyp.getIntValue();
				if (v < 0 || v > Integer.MAX_VALUE) {
					ReportError.error(ctx, "invalid array size: "+v);
					return -1;
				}
				return (int)v;
			}
			ReportError.error(ctx, "array size is not an integer");
			return -1;
		}
		if (typ != null && typ != Type.unknownType)
			ReportError.error(ctx, "unimplemented feature: expressions as array sizes");
		return -1;
	}
}
