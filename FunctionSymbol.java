// FunctionSymbol.java
//
// An instance of this class is used for two purposes:
//   1. to define the symbol used as the name of a function
//   2. to implement a scope (symbol table) which can be used to look up
//      the formal parameters of the function and, by following chains,
//      any symbol defined in an enclosing scope.
//
import java.util.LinkedHashMap;
import java.util.Map;

public class FunctionSymbol extends Symbol implements Scope {
	Map<String, Symbol> parameters = new LinkedHashMap<String, Symbol>();

	// used when function signature is available
    public FunctionSymbol(String name, Type signature, Scope enclosingScope) {
        super(name, Kind.Function, signature, enclosingScope);
    }

	// otherwise function signature needs to be added later
    public FunctionSymbol(String name, Scope enclosingScope) {
        super(name, Kind.Function, null, enclosingScope);
    }

	// look up a formal parameter only
	public Symbol resolveInCurrent(String name) {
		return parameters.get(name);
	}

    // look up an identifier, starting with the formals
    public Symbol resolve(String name) {
		Symbol s = parameters.get(name);
        if (s!=null) return s;
		// if not here, check any enclosing scope
		if (getEnclosingScope() != null) {
			return getEnclosingScope().resolve(name);
		}
		return null; // not found
	}

    // define a formal parameter
	public void define(Symbol sym) {
		parameters.put(sym.name, sym);
		sym.setScope(this); // track the scope in each symbol
		if (tracing) System.out.println("SY: Defined formal: "+sym.name);
	}

	public Scope getEnclosingScope() {
	    return scope;
	}

	public String getScopeName() { return getName(); }
	public void setScopeName(String name) { /* ignored */ }

    public String toString() {
        return "Function " + getName() + getType().toString();
    }

	public void dumpScope() {
		System.out.println(getLineNumber() + ": " + toString());
	}
}
