// Predefined.java
//
// Adds definitions for predefined symbols to the global scope

public class Predefined {
	// these three predefined types must sometimes be accessed without going
	// via symbol table lookup (when library packages are imported)
	public static Type intType;
	public static Type stringType;
	public static Type boolType;
	public static Type floatType;  // float64 type
	public static Type runeType;

	private static void addTypeName( Type t, Scope globals ) {
		addTypeName(t.getName(), t, globals);
	}

	private static void addTypeName( String name, Type t, Scope globals ) {
		Symbol sy = new Symbol(name, Symbol.Kind.TypeName, t, globals);
		globals.define(sy);
	}

    private static void addFuncName( String name, Type sig, Scope globals) {
        Symbol sy = new Symbol(name, Symbol.Kind.Function, sig, globals);
		globals.define(sy);
    }

    private static void addTypeNames(Scope globals) {
		Type t = Type.newNumericType('i',32);
		addTypeName(t, globals);
		addTypeName("rune", t, globals);  // rune is a synonym for int32
		t = Type.newNumericType('i',32);
		runeType = t;
		t.setName("int");
		addTypeName(t, globals); // int is not same type as int32
		intType = t;
		addTypeName(Type.newNumericType('u',32), globals);
		t = Type.newNumericType('u',32);
		t.setName("uint");
		addTypeName(t, globals); // uint is not same type as uint32
		addTypeName(Type.newNumericType('i',64), globals);
		addTypeName(Type.newNumericType('u',64), globals);
		addTypeName(Type.newNumericType('f',32), globals);
		t = Type.newNumericType('f',64);
		addTypeName(t, globals);
		floatType = t;
		addTypeName(Type.stringType, globals);
		stringType = Type.stringType;
		addTypeName(Type.boolType, globals);
		boolType = Type.boolType;
    }

    private static Type newSig( Type formal1, Type result ) {
        Type[] formals = new Type[1];
        formals[0] = formal1;
        if (result==null)
            return Type.newFunctionSignature(formals);
        else
            return Type.newFunctionSignature(formals, result);
    }

    private static Type newSig( Type formal1, Type formal2, Type result ) {
        Type[] formals = new Type[2];
        formals[0] = formal1; formals[1] = formal2;
        if (result==null)
            return Type.newFunctionSignature(formals);
        else
            return Type.newFunctionSignature(formals, result);
    }

    private static void addFunctionNames(Scope globals) {
		Type sig;
		Type st = Type.newSliceType(Type.anyType); // slice with any element type
		Type pt = Type.newPointerType(Type.anyType); // pointer to any type
		sig = newSig(Type.apsType, intType);
		addFuncName("cap", sig, globals);
		sig = newSig(st, st, intType);
		addFuncName("copy", sig, globals);
		sig = newSig(Type.apsType, intType);
		addFuncName("len", sig, globals);
		sig = newSig(st, intType, st);
		addFuncName("make", sig, globals);
		sig = newSig(Type.anyType, pt);
		addFuncName("new", sig, globals);
		sig = newSig(Type.variadicAnyType, null);
		addFuncName("print", sig, globals);
		addFuncName("println", sig, globals);
		// and add nil here, since we have pt already set up
		Symbol nil = new Symbol("nil", Symbol.Kind.Variable, pt, globals);
		globals.define(nil);
    }

	public static void AddPredefinedNames( Scope globals ) {
        addTypeNames(globals);  // this call must be first
        addFunctionNames(globals);
        Symbol tr = new Symbol("true", Symbol.Kind.Constant, boolType, globals);
        globals.define(tr);
        Symbol fl = new Symbol("false", Symbol.Kind.Constant, boolType, globals);
        globals.define(fl);
        Symbol nil = new Symbol("nil", Symbol.Kind.Constant, Type.nilType, globals);
	}


}