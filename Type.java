// Type.java
//
// Instances are used to describe the types of symbols and expressions
// in the Goo subset of Go.
//
// One instance of this class is used for the unknown type -- used when
// we have not yet determined what the type should be.
// There are other instances for the string and bool types.
//
// Some special types are anyType, variadicAnyType, apsType.
// They are needed for checking calls to some library functions. For example,
// fmt.Print has the following signature:
//      func Print(arg ...interface{}) (n int, err error)
// meaning that it can accept any number of arguments of any type. In this
// compiler, the type of that arg parameter is described by variadicAnyType.
// Note: unknownType is not the same as anyType. The latter is used for
// checking library function calls where any type is accepted. The former
// is used for a variable or typename where we haven't yet determined what
// the type is, but will do so later.
//
// All other types are described by instances of nested subclasses of Type.
//

import java.util.*;

public class Type implements Cloneable {
    public static final Type unknownType = new Type("???", false);
    public static final Type stringType = new Type("string", true);
    public static final Type boolType = new Type("bool", true);
    public static final Type labelType = new Type("(label)");
    public static final Type voidType = new Type("(void)", true);

    public static final Type anyType = new Type("(any)", true);
    public static final Type variadicAnyType = new Type("...(any)", true);
    public static final Type apsType = new Type("array/*array/slice/string", true);

    public static final Type nilType = newPointerType(anyType);

	// instance fields
    String name;
    boolean complete = false;	// false => some component is unknown
    boolean namedType = false;

	// Constructors -- they are PRIVATE
    private Type() { name = "???"; }

    private Type(String name) { this.name = name; }

    private Type(String name, boolean complete) {
    	this.name = name; setComplete(complete);
    }

	// methods shared by Type and all subtypes
    public String getName() { return name; }
    public void setName(String n) { name = n; }

	public boolean isComplete() { return complete; }
	public void setComplete(boolean b) { complete = b; }

	public boolean isNamedType() { return namedType; }
	public void setNamedType(boolean b) { namedType = b; }

	public Type makeNamedCopy(String name) {
		Type r = this;
		// each named type has to be a distinct type which
		// compares as incompatible with the underlying type
		// ==> make new copy if underlying type is already named
		if (namedType && !name.equals(getName()))
			r = (Type)this.clone();
		r.setName(name);
		r.setNamedType(true);
		return r;
	}

	// clone here and in the subclasses makes a shallow copy
	protected Object clone() {
		return new Type(this.name, this.complete);
	}

	@Override
    public String toString() { return name; }
	
	// convenience method for creating int, uint and float types
	public static Type newNumericType(char w, int size) {
		Type result = null;
		if (w == 'i')
			result = unknownType.new Int(size);
		else if (w == 'u')
			result = unknownType.new Uint(size);
		else if (w == 'f')
			result = unknownType.new Flt(size);
		else {
			System.out.println("Internal error: bad w value for newNumericType");
			System.exit(1);
		}
		return result;
	}

	static HashMap<String,Type.UntypedNumber> unTypNumCache =
						new HashMap<String,Type.UntypedNumber>();

	// s is the text of the numeric constant (int or float)
	public static Type.UntypedNumber newUntypedNumber(String s) {
		Type.UntypedNumber entry = unTypNumCache.get(s);
		if (entry != null) return entry;  // reuse existing instance
		return unknownType.new UntypedNumber(s);
	}

	public static Type.Array newArrayType(Type elemType) {
		return unknownType.new Array(elemType);
	}
 
 	public static Type.Slice newSliceType(Type elemType) {
		return unknownType.new Slice(elemType);
	}

 	public static Type.Pointer newPointerType(Type baseType) {
		return unknownType.new Pointer(baseType);
	}

 	public static Type.Struct newStructType(Scope s) {
		return unknownType.new Struct(s);  // not complete by default
	}

	public static Type.Function newFunctionSignature(
				LinkedList<Type> params, LinkedList<Type> results) {
		return unknownType.new Function(params,results);
	}

    // This method handles the case when a function has any number of results
    // but Goo limits functions to have 0 or 1 result.
	public static Type.Function newFunctionSignature(Type[] params, Type[] results) {
		return unknownType.new Function(params,results);
	}

    // For use when function has 0 results (i.e. a void function)
	public static Type.Function newFunctionSignature(Type[] params) {
	    Type[] results = new Type[0];
		return unknownType.new Function(params,results);
	}

    // For use when function has 1 result
	public static Type.Function newFunctionSignature(Type[] params, Type result) {
	    Type[] results = new Type[1];
	    results[0] = result;
		return unknownType.new Function(params,results);
	}

	public static Type.TypeList newTypeList(LinkedList<Type> types) {
		return unknownType.new TypeList(types);
	}

	public static Type.TypeList newTypeList(Type[] types) {
		return unknownType.new TypeList(types);
	}

	/**************  subclasses follow ********************/

    public class Int extends Type {
        private int size;
        
        public Int( int size ) {
            this.size = size;
            name = "int"+size;
            setComplete(true);
        }
        
        public int getSize() { return size; }

        @Override
        protected Object clone() {
        	return newNumericType('i', size);
        }
    }

    public class Uint extends Type {
        private int size;
        
        public Uint( int size ) {
            this.size = size;
            name = "uint"+size;
            setComplete(true);
        }

        public int getSize() { return size; }

        @Override
        protected Object clone() {
        	return newNumericType('u', size);
        }
    }

	public class UntypedNumber extends Type {
		private String text;
		private long iValue;
		private double dValue;
		private boolean isInt;
        private boolean isPossibleDouble; // If original text was an int or was actually a double
		
		public UntypedNumber( String num ) {
			text = num;  name = "("+num+")";
			checkForm();
		}

		public boolean isInteger() { return isInt; }

        // Was the incoming text "2.0" or "2"
        public boolean isPossibleDouble() { return isPossibleDouble; }

		public long getIntValue() {
			assert isInt; return iValue;
		}

		public double getDoubleValue() {
			assert !isInt; return dValue;
		}

		private void checkForm() {
			Double dval;
			try {
				dval = new Double(text);
				iValue = dval.longValue();
				isInt = (iValue*1.0 == dval);
                isPossibleDouble = text.contains(".");
                if (!isInt) dValue = dval;
			} catch(NumberFormatException e) {
				ReportError.error("bad number: "+text);
				iValue = 0;
				text = "0";
				isInt = true;
			}
		}

        @Override
        protected Object clone() {
        	return this;  // should never actually clone this type!
        }
	}

    public class Flt extends Type {
        private int size;
        
        public Flt( int size ) {
            this.size = size;
            name = "float"+size;
            setComplete(true);
        }
        
        public int getSize() { return size; }

        @Override
        protected Object clone() {
        	return newNumericType('f', size);
        }
    }

    public class Array extends Type {
        private Type elementType;
        private int size;
    	boolean recursionStop = false; // prevent infinite loops in toString()
        
        public Array( Type elementType ) {
            this.elementType = elementType;
            name = "[..]"; size = -1;
            setComplete(elementType.isComplete());
        }

        public Type getElementType() { return elementType; }
        public void setElementType(Type et) { elementType = et; }

        public int getSize() { return size; }
        public void setSize(int sz) { size = sz; }

        @Override
        public String toString() {
        	if (recursionStop) return getName();
        	recursionStop = true;
            String r = elementType.toString()+"["+size+"]";
            recursionStop = false;
            return r;
        }

        @Override
        protected Object clone() {
        	Type.Array r = newArrayType(elementType);
        	r.setSize(size);
        	return r;
        }
    }

    public class Slice extends Type {
        private Type elementType;
    	boolean recursionStop = false; // prevent infinite loops in toString()
        
        public Slice( Type elementType ) {
            this.elementType = elementType;
            name = "[]";
            setComplete(elementType.isComplete());
        }
        
        public Type getElementType() { return elementType; }
        public void setElementType(Type et) { elementType = et; }
        
        @Override
        public String toString() {
        	if (recursionStop) return getName();
        	recursionStop = true;
            String r = elementType.toString()+"[]";
            recursionStop = false;
            return r;
        }

        @Override
        protected Object clone() {
        	return newSliceType(elementType);
        }
    }

    public class Pointer extends Type {
        private Type baseType;
    	boolean recursionStop = false; // prevent infinite loops in toString()
        
        public Pointer( Type baseType ) {
            this.baseType = baseType;
            name = "*";
            setComplete(baseType.isComplete());
        }
        
        public Type getBaseType() { return baseType; }
        public void setBaseType(Type bt) { baseType = bt; }
        
        @Override
        public String toString() {
        	if (recursionStop) return getName();
        	recursionStop = true;
            String r = "*"+baseType.toString();
            recursionStop = false;
            return r;
        }

        @Override
        protected Object clone() {
        	return newSliceType(baseType);
        }
    }

	// An instance of this class represents a list of types
	// and can be used to denote the type of a list of expressions.
	// E.g., the types of the arguments passed in a function call.
	public class TypeList extends Type {
		private Type[] types;
		
		public TypeList( LinkedList<Type> types ) {
			this.types = types.toArray(new Type[0]);
			setComplete();
		}
	
		public TypeList( Type[] types ) {
			this.types = (Type[])types.clone();
			setComplete();
		}

		public Type[] getTypes() { return types; }

		private void setComplete() {
			for( Type t : types ) {
			    assert t != null;
				if (!t.isComplete()) return;
			}
			this.setComplete(true);
		}

		@Override
		public String toString() {
			if (types.length==0) return "[]";
			StringBuilder sb = new StringBuilder();
			char sep = '[';
			for( Type t : types ) {
				sb.append(sep);
				sb.append(t.toString());
				sep = ',';
			}
			sb.append(']');
			return sb.toString();
		}

        @Override
        protected Object clone() {
        	return newTypeList(types);
        }
	}

	// An instance of this class represents a function signature
	public class Function extends Type {
		private Type[] parameters;
		private Type[] results;

		public Function( LinkedList<Type> parameters, LinkedList<Type> results ) {
			this.parameters = parameters.toArray(new Type[0]);   // These stupid API calls are a consequence of
			this.results = results.toArray(new Type[0]);  // a brain-damaged implementation of generics in Java
			setComplete();
		}

		public Function( Type[] parameters, Type[] results ) {
			this.parameters = (Type[])parameters.clone();
			this.results = (Type[])results.clone();
			setComplete();
		}

		public Type[] getParameters() { return parameters; }

		public void setParameters(LinkedList<Type> pt) {
			parameters = pt.toArray(new Type[0]);
		}
		
		public Type[] getResults() { return results; }

		public void setResults(LinkedList<Type> rt) {
			results = rt.toArray(new Type[0]);
		}

		private void setComplete() {
			for( Type t : parameters )
				if (!t.isComplete()) return;
			for( Type t : results )
				if (!t.isComplete()) return;
			this.setComplete(true);
		}

		@Override
		public String toString() {
		    StringBuilder sb = new StringBuilder();
		    if (parameters.length > 0) {
    		    char c = '(';
    		    for(Type t : parameters) {
    		        sb.append(c);
    		        c = ',';
    		        sb.append(t.toString());
    		    }
    		    sb.append(')');
		    } else
		        sb.append("()");
		    // Assuming functions return 0 or 1 result only
		    if (results.length>0) {
		        sb.append(':');
		        sb.append(results[0].toString());
		    }
			return sb.toString();
		}

        @Override
        protected Object clone() {
        	return newFunctionSignature(parameters, results);
        }
	}

	public class Struct extends Type implements Scope {
		LinkedHashMap<String, Symbol> fields = new LinkedHashMap<String, Symbol>();
		Scope containingScope;
    	boolean recursionStop = false; // prevent infinite loops in toString()

		public Struct(Scope s) {
			name = "struct";
			containingScope = s;
		}

		@Override
		public String toString() {
			if (recursionStop)
				return getName();
			recursionStop = true;
			String result = "struct{ "+fields.values()+" }";
			recursionStop = false;
			return result;
		}

	    public String getScopeName() {  return getName(); }
	    public void setScopeName(String name) { /* ignored */ }

		// enclosing scope == scope in which the struct is declared
	    public Scope getEnclosingScope() { return containingScope;  }

		public LinkedHashMap<String, Symbol> getFields() { return fields; }
		public void setFields(LinkedHashMap<String, Symbol> f) { fields = f; }

	    public void define(Symbol sym) {
	    	if (resolveInCurrent(sym.name) != null) {
	    		ReportError.error(sym.getLineNumber(), 0,
	    				"Duplicate declaration of  "+sym.name);
	    		return;
	    	}
			fields.put(sym.name, sym);
			sym.setScope(this); // track the scope in each symbol
			// if (tracing) System.out.println("SY: Defined field: "+sym.name);
	    }

		public Symbol resolveInCurrent(String name) {
			return fields.get(name);
		}

		// USE WITH CAUTION: lookups continue into the enclosing scope
		// Use the resolveInCurrent method if it is a field to be resolved.
	    public Symbol resolve(String name) {
			Symbol s = fields.get(name);
	        if (s!=null) return s;
			if (getEnclosingScope() != null) {
				return getEnclosingScope().resolve(name);
			}
			return null; // not found
	    }

	    public void dumpScope() {
			System.out.println(getScopeName() + " {");
			for( Symbol sy : fields.values() ) {
				System.out.println("   "+sy.toString());
			}
			System.out.println("}\n");
	    }

	    @Override
	    protected Object clone() {
	    	Type.Struct r = newStructType(containingScope);
	    	r.setFields(fields);
	    	return r;
	    }
	}

}