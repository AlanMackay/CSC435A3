// BlockScope.java
//
// Implements
//       1. one scope in a tree-structured symbol table, or
//       2. the table of field names in a struct (in which case
//          the enclosingScope field is always null)
//
import java.util.*;

public class BlockScope implements Scope {
	static boolean tracing = false;
	Scope enclosingScope; // null if global (outermost) scope
	String scopeName = "scope block";
	Map<String, Symbol> symbols = new LinkedHashMap<String, Symbol>();

    public BlockScope(Scope enclosingScope) {
    	this.enclosingScope = enclosingScope;
    	tracing = Symbol.tracing;
    }

	public Symbol resolveInCurrent(String name) {
		return symbols.get(name);
	}

    public Symbol resolve(String name) {
		Symbol s = symbols.get(name);
        if (s!=null) return s;
		// if not here, check any enclosing scope
		return enclosingScope == null? null : enclosingScope.resolve(name);
	}

	public void define(Symbol sym) {
		if (resolveInCurrent(sym.name) != null) {
			ReportError.error(sym.getLineNumber(), 0,
					"Duplication declaration of "+sym.name);
			return;
		}
		symbols.put(sym.name, sym);
		sym.scope = this; // track the scope in each symbol
		if (tracing) System.out.println("SY: Defined symbol: "+sym.name);
	}

    public Scope getEnclosingScope() { return enclosingScope; }

	public String getScopeName() { return scopeName; }
	public void setScopeName(String name) { scopeName = name; }

	public String toString() {
	    return "{ "+symbols.keySet().toString()+" }";
	}
	
	public void dumpScope() {
		Collection<Symbol> items = symbols.values();
		if (items.size() != 0) {
			System.out.println(scopeName + " {");
			for( Symbol sy : items ) {
				System.out.println("   "+sy.getLineNumber()+": "+sy.toString());
			}
			System.out.println("}\n");
		}
	}
}
