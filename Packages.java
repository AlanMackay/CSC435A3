// Packages.java
//
// Information about the Go packages which are supported in the Goo subset

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;

public class Packages {
    // An import declaration uses a file name, this table tells us the
    // name of the package in that file.
    static Map<String,String> fileToPackage = new HashMap<String,String>() {{
    	put("lib/math","math"); put("fmt", "fmt");
    }};
	static Packages INSTANCE = new Packages();

	private Packages() { }

    static void handleImport( String filename, Scope scope, ParserRuleContext obj ) {
    	String pkgName = fileToPackage.get(filename);
    	if (pkgName == null) {
    		ReportError.error(obj, "unknown/unsupported package: "+filename);
    		return;
    	}
    	PackageSymbol pkg = INSTANCE.new PackageSymbol(pkgName);
    	scope.define(pkg);
    	if (pkgName.equals("fmt")) {
    		LinkedList<Type> parms = new LinkedList<Type>();
    		LinkedList<Type> results = new LinkedList<Type>();
    		parms.add(Type.variadicAnyType);
    		results.add(Predefined.intType);  results.add(Predefined.stringType);
    		Type sig = Type.newFunctionSignature(parms,results);
    		pkg.addMember(new Symbol("Println",Symbol.Kind.Function,sig,scope));
    		pkg.addMember(new Symbol("Print",Symbol.Kind.Function,sig,scope));
    		parms.clear();
    		parms.add(Predefined.stringType); parms.add(Type.variadicAnyType);
    		sig = Type.newFunctionSignature(parms,results);
    		pkg.addMember(new Symbol("Printf",Symbol.Kind.Function,sig,scope));
    	}
    }

	public class PackageSymbol extends Symbol {
		Map<String, Symbol> members = new HashMap<String, Symbol>();

		public PackageSymbol(String name) {
			this.name = name;
		}

		private PackageSymbol() { }

		void addMember(Symbol s) {
			String nm = s.getName();
			members.put(nm,s);
		}
		
		public Symbol getMember( String name ) {
			return members.get(name);
		}
		
		@Override
		public String toString() {
			return "package "+name+" {"+members.keySet()+"}";
		}
	}

}