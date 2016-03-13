// Symbol.java

import org.antlr.v4.runtime.*;

public class Symbol { // A generic programming language symbol

    enum Kind { Unknown, Variable, Function, Formal, Field,
    			Constant, TypeName, Package, Label }   // CHANGED
    
    static public boolean tracing = false;

    String name;
    Kind kind;
    Type type;
    Scope scope;      // the scope containing the definition
    int line;		  // line number where declared

    public Symbol(String name) {
        this.name = name;
        kind = Kind.Unknown;
        type = Type.unknownType;
        scope = null;
        line = 0;
    }

    public Symbol(String name, Kind kind, Type type, Scope scope) {
        this.name = name;
        this.kind = kind;
        this.type = type;
        this.scope = scope;
        line = 0;
    }

	// Use only when id is an instance of an Identifier terminal symbol
    public Symbol(Token id, Kind kind, Type type, Scope scope) {
        this.name = id.getText();
        this.kind = kind;
        this.type = type;
        this.scope = scope;
        line = id.getLine();
    }

	public Symbol() { }

    public String getName() { return name; }
    public void setName(String n) { name = n; }

	public Type getType() { return type; }
	public void setType(Type t) { type = t; }

    public Kind getKind() { return kind; }
    public void setkind(Kind k) { kind = k; }
    
    public Scope getScope() { return scope; }
    public void setScope(Scope s) { scope = s; }
    
    public int getLineNumber() { return line; }
    public void setLineNumber(int ln) { line = ln; }

    public String toString() {
        if (type!=null)
            return kind+" "+getName()+":"+type.toString();
        return getName();
    }
}
