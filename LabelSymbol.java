// LabelSymbol.java

import org.antlr.v4.runtime.*;

public class LabelSymbol extends Symbol { // a label used in goto statements
    int location = -1;

    public LabelSymbol(String name) {
        this.name = name;
        kind = Kind.Unknown;
        type = Type.unknownType;
        scope = null;
        line = 0;
    }

    public LabelSymbol(String name, Scope scope) {
        this.name = name;
        this.kind = Kind.Label;
        this.type = Type.labelType;
        this.scope = scope;
        line = 0;
    }

	// Use only when id is an instance of an Identifier terminal symbol
    public LabelSymbol(Token id, Scope scope) {
        this.name = id.getText();
        this.kind = Kind.Label;
        this.type = Type.labelType;
        this.scope = scope;
        line = id.getLine();
    }
    
    public int getLocation() { return location; }
    public void setLocation(int loc) { location = loc; }

    public String toString() {
        if (location >= 0)
            return "Label "+getName()+" (loc="+location+")";
        else
            return "Label "+getName();
    }
}
