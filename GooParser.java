// Generated from Goo.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GooParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, BREAK=30, CASE=31, CHAN=32, 
		CONST=33, CONTINUE=34, DEFAULT=35, DEFER=36, ELSE=37, FALLTHROUGH=38, 
		FOR=39, FUNC=40, GO=41, GOTO=42, IF=43, IMPORT=44, INTERFACE=45, MAP=46, 
		PACKAGE=47, RANGE=48, RETURN=49, SELECT=50, STRUCT=51, SWITCH=52, TYPE=53, 
		VAR=54, Identifier=55, ImaginaryLit=56, IntLit=57, FloatLit=58, StringLit=59, 
		RuneLit=60, PLUSPLUS=61, MINUSMINUS=62, RPAREN=63, RSQ=64, RBRACE=65, 
		SEMI=66, Whitespace=67, LineComment=68, NL=69, BlockComment=70, BlockNLComment=71;
	public static final int
		RULE_type = 0, RULE_typeName = 1, RULE_typeLit = 2, RULE_arrayType = 3, 
		RULE_arrayLength = 4, RULE_elementType = 5, RULE_sliceType = 6, RULE_structType = 7, 
		RULE_fieldDeclList = 8, RULE_fieldDecl = 9, RULE_pointerType = 10, RULE_baseType = 11, 
		RULE_signature = 12, RULE_result = 13, RULE_parameters = 14, RULE_parameterList = 15, 
		RULE_parameterDecl = 16, RULE_methodName = 17, RULE_block = 18, RULE_statementList = 19, 
		RULE_declaration = 20, RULE_topLevelDeclList = 21, RULE_topLevelDecl = 22, 
		RULE_constDecl = 23, RULE_constSpecList = 24, RULE_constSpec = 25, RULE_constSpecRem = 26, 
		RULE_identifierList = 27, RULE_expressionList = 28, RULE_typeDecl = 29, 
		RULE_typeSpecList = 30, RULE_typeSpec = 31, RULE_varDecl = 32, RULE_varSpecList = 33, 
		RULE_varSpec = 34, RULE_varSpecRem = 35, RULE_shortVarDecl = 36, RULE_functionDecl = 37, 
		RULE_functionName = 38, RULE_function = 39, RULE_functionBody = 40, RULE_operand = 41, 
		RULE_literal = 42, RULE_basicLit = 43, RULE_operandName = 44, RULE_qualifiedIdent = 45, 
		RULE_compositeLit = 46, RULE_literalType = 47, RULE_literalValue = 48, 
		RULE_elementList = 49, RULE_element = 50, RULE_value = 51, RULE_primaryExpr = 52, 
		RULE_selector = 53, RULE_index = 54, RULE_slice = 55, RULE_arguments = 56, 
		RULE_expression = 57, RULE_unaryExpr = 58, RULE_relOp = 59, RULE_addOp = 60, 
		RULE_mulOp = 61, RULE_unaryOp = 62, RULE_conversion = 63, RULE_statement = 64, 
		RULE_simpleStmt = 65, RULE_emptyStmt = 66, RULE_labeledStmt = 67, RULE_label = 68, 
		RULE_expressionStmt = 69, RULE_incDecStmt = 70, RULE_assignment = 71, 
		RULE_assignOp = 72, RULE_ifStmt = 73, RULE_elsePart = 74, RULE_forStmt = 75, 
		RULE_condition = 76, RULE_forClause = 77, RULE_initStmt = 78, RULE_postStmt = 79, 
		RULE_returnStmt = 80, RULE_breakStmt = 81, RULE_continueStmt = 82, RULE_gotoStmt = 83, 
		RULE_sourceFile = 84, RULE_packageClause = 85, RULE_packageName = 86, 
		RULE_importDeclList = 87, RULE_importDecl = 88, RULE_importSpecList = 89, 
		RULE_importSpec = 90, RULE_importPath = 91, RULE_optSemi = 92;
	public static final String[] ruleNames = {
		"type", "typeName", "typeLit", "arrayType", "arrayLength", "elementType", 
		"sliceType", "structType", "fieldDeclList", "fieldDecl", "pointerType", 
		"baseType", "signature", "result", "parameters", "parameterList", "parameterDecl", 
		"methodName", "block", "statementList", "declaration", "topLevelDeclList", 
		"topLevelDecl", "constDecl", "constSpecList", "constSpec", "constSpecRem", 
		"identifierList", "expressionList", "typeDecl", "typeSpecList", "typeSpec", 
		"varDecl", "varSpecList", "varSpec", "varSpecRem", "shortVarDecl", "functionDecl", 
		"functionName", "function", "functionBody", "operand", "literal", "basicLit", 
		"operandName", "qualifiedIdent", "compositeLit", "literalType", "literalValue", 
		"elementList", "element", "value", "primaryExpr", "selector", "index", 
		"slice", "arguments", "expression", "unaryExpr", "relOp", "addOp", "mulOp", 
		"unaryOp", "conversion", "statement", "simpleStmt", "emptyStmt", "labeledStmt", 
		"label", "expressionStmt", "incDecStmt", "assignment", "assignOp", "ifStmt", 
		"elsePart", "forStmt", "condition", "forClause", "initStmt", "postStmt", 
		"returnStmt", "breakStmt", "continueStmt", "gotoStmt", "sourceFile", "packageClause", 
		"packageName", "importDeclList", "importDecl", "importSpecList", "importSpec", 
		"importPath", "optSemi"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "'['", "'{'", "'*'", "','", "'='", "':='", "'.'", "'...'", 
		"':'", "'&&'", "'||'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'+'", 
		"'-'", "'|'", "'^'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'&^'", "'!'", 
		"'break'", "'case'", "'chan'", "'const'", "'continue'", "'default'", "'defer'", 
		"'else'", "'fallthrough'", "'for'", "'func'", "'go'", "'goto'", "'if'", 
		"'import'", "'interface'", "'map'", "'package'", "'range'", "'return'", 
		"'select'", "'struct'", "'switch'", "'type'", "'var'", null, null, null, 
		null, null, null, "'++'", "'--'", "')'", "']'", "'}'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "BREAK", "CASE", "CHAN", "CONST", 
		"CONTINUE", "DEFAULT", "DEFER", "ELSE", "FALLTHROUGH", "FOR", "FUNC", 
		"GO", "GOTO", "IF", "IMPORT", "INTERFACE", "MAP", "PACKAGE", "RANGE", 
		"RETURN", "SELECT", "STRUCT", "SWITCH", "TYPE", "VAR", "Identifier", "ImaginaryLit", 
		"IntLit", "FloatLit", "StringLit", "RuneLit", "PLUSPLUS", "MINUSMINUS", 
		"RPAREN", "RSQ", "RBRACE", "SEMI", "Whitespace", "LineComment", "NL", 
		"BlockComment", "BlockNLComment"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Goo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GooParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TypeContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TypeLitContext typeLit() {
			return getRuleContext(TypeLitContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_type);
		try {
			setState(192);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				typeName();
				}
				break;
			case T__1:
			case T__3:
			case STRUCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				typeLit();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				match(T__0);
				setState(189);
				type();
				setState(190);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(GooParser.Identifier, 0); }
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeLitContext extends ParserRuleContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public StructTypeContext structType() {
			return getRuleContext(StructTypeContext.class,0);
		}
		public PointerTypeContext pointerType() {
			return getRuleContext(PointerTypeContext.class,0);
		}
		public SliceTypeContext sliceType() {
			return getRuleContext(SliceTypeContext.class,0);
		}
		public TypeLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeLit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitTypeLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeLitContext typeLit() throws RecognitionException {
		TypeLitContext _localctx = new TypeLitContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_typeLit);
		try {
			setState(200);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				arrayType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				structType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				pointerType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(199);
				sliceType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayTypeContext extends ParserRuleContext {
		public ArrayLengthContext arrayLength() {
			return getRuleContext(ArrayLengthContext.class,0);
		}
		public ElementTypeContext elementType() {
			return getRuleContext(ElementTypeContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(T__1);
			setState(203);
			arrayLength();
			setState(204);
			match(RSQ);
			setState(205);
			elementType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayLengthContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLength; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitArrayLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLengthContext arrayLength() throws RecognitionException {
		ArrayLengthContext _localctx = new ArrayLengthContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arrayLength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ElementTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitElementType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementTypeContext elementType() throws RecognitionException {
		ElementTypeContext _localctx = new ElementTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elementType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SliceTypeContext extends ParserRuleContext {
		public ElementTypeContext elementType() {
			return getRuleContext(ElementTypeContext.class,0);
		}
		public SliceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sliceType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitSliceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SliceTypeContext sliceType() throws RecognitionException {
		SliceTypeContext _localctx = new SliceTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sliceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(T__1);
			setState(212);
			match(RSQ);
			setState(213);
			elementType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructTypeContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(GooParser.STRUCT, 0); }
		public FieldDeclListContext fieldDeclList() {
			return getRuleContext(FieldDeclListContext.class,0);
		}
		public StructTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitStructType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructTypeContext structType() throws RecognitionException {
		StructTypeContext _localctx = new StructTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_structType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(STRUCT);
			setState(216);
			match(T__2);
			setState(217);
			fieldDeclList();
			setState(218);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclListContext extends ParserRuleContext {
		public List<FieldDeclContext> fieldDecl() {
			return getRuleContexts(FieldDeclContext.class);
		}
		public FieldDeclContext fieldDecl(int i) {
			return getRuleContext(FieldDeclContext.class,i);
		}
		public OptSemiContext optSemi() {
			return getRuleContext(OptSemiContext.class,0);
		}
		public FieldDeclListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitFieldDeclList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclListContext fieldDeclList() throws RecognitionException {
		FieldDeclListContext _localctx = new FieldDeclListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fieldDeclList);
		try {
			int _alt;
			setState(232);
			switch (_input.LA(1)) {
			case RBRACE:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(221);
						fieldDecl();
						setState(222);
						match(SEMI);
						}
						} 
					}
					setState(228);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(229);
				fieldDecl();
				setState(230);
				optSemi();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FieldDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitFieldDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclContext fieldDecl() throws RecognitionException {
		FieldDeclContext _localctx = new FieldDeclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fieldDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			identifierList();
			setState(235);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PointerTypeContext extends ParserRuleContext {
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
		public PointerTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitPointerType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerTypeContext pointerType() throws RecognitionException {
		PointerTypeContext _localctx = new PointerTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_pointerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(T__3);
			setState(238);
			baseType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BaseTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public BaseTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitBaseType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseTypeContext baseType() throws RecognitionException {
		BaseTypeContext _localctx = new BaseTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_baseType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignatureContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public SignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signature; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignatureContext signature() throws RecognitionException {
		SignatureContext _localctx = new SignatureContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_signature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			parameters();
			setState(244);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(243);
				result();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResultContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitResult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(T__0);
			setState(253);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << STRUCT) | (1L << Identifier))) != 0)) {
				{
				setState(249);
				parameterList();
				setState(251);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(250);
					match(T__4);
					}
				}

				}
			}

			setState(255);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterDeclContext> parameterDecl() {
			return getRuleContexts(ParameterDeclContext.class);
		}
		public ParameterDeclContext parameterDecl(int i) {
			return getRuleContext(ParameterDeclContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_parameterList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			parameterDecl();
			setState(262);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(258);
					match(T__4);
					setState(259);
					parameterDecl();
					}
					} 
				}
				setState(264);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public ParameterDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitParameterDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclContext parameterDecl() throws RecognitionException {
		ParameterDeclContext _localctx = new ParameterDeclContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_parameterDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(265);
				identifierList();
				}
				break;
			}
			setState(268);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(GooParser.Identifier, 0); }
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitMethodName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(T__2);
			setState(273);
			statementList();
			setState(274);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementListContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public OptSemiContext optSemi() {
			return getRuleContext(OptSemiContext.class,0);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_statementList);
		try {
			int _alt;
			setState(288);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(277);
						statement();
						setState(278);
						match(SEMI);
						}
						} 
					}
					setState(284);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(285);
				statement();
				setState(286);
				optSemi();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public ConstDeclContext constDecl() {
			return getRuleContext(ConstDeclContext.class,0);
		}
		public TypeDeclContext typeDecl() {
			return getRuleContext(TypeDeclContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_declaration);
		try {
			setState(293);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				constDecl();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				typeDecl();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(292);
				varDecl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TopLevelDeclListContext extends ParserRuleContext {
		public List<TopLevelDeclContext> topLevelDecl() {
			return getRuleContexts(TopLevelDeclContext.class);
		}
		public TopLevelDeclContext topLevelDecl(int i) {
			return getRuleContext(TopLevelDeclContext.class,i);
		}
		public OptSemiContext optSemi() {
			return getRuleContext(OptSemiContext.class,0);
		}
		public TopLevelDeclListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevelDeclList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitTopLevelDeclList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopLevelDeclListContext topLevelDeclList() throws RecognitionException {
		TopLevelDeclListContext _localctx = new TopLevelDeclListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_topLevelDeclList);
		try {
			int _alt;
			setState(307);
			switch (_input.LA(1)) {
			case EOF:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case CONST:
			case FUNC:
			case TYPE:
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(296);
						topLevelDecl();
						setState(297);
						match(SEMI);
						}
						} 
					}
					setState(303);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(304);
				topLevelDecl();
				setState(305);
				optSemi();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TopLevelDeclContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public FunctionDeclContext functionDecl() {
			return getRuleContext(FunctionDeclContext.class,0);
		}
		public TopLevelDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevelDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitTopLevelDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopLevelDeclContext topLevelDecl() throws RecognitionException {
		TopLevelDeclContext _localctx = new TopLevelDeclContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_topLevelDecl);
		try {
			setState(311);
			switch (_input.LA(1)) {
			case CONST:
			case TYPE:
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				declaration();
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				functionDecl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstDeclContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(GooParser.CONST, 0); }
		public ConstSpecContext constSpec() {
			return getRuleContext(ConstSpecContext.class,0);
		}
		public ConstSpecListContext constSpecList() {
			return getRuleContext(ConstSpecListContext.class,0);
		}
		public ConstDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitConstDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclContext constDecl() throws RecognitionException {
		ConstDeclContext _localctx = new ConstDeclContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_constDecl);
		try {
			setState(320);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				match(CONST);
				setState(314);
				constSpec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				match(CONST);
				setState(316);
				match(T__0);
				setState(317);
				constSpecList();
				setState(318);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstSpecListContext extends ParserRuleContext {
		public List<ConstSpecContext> constSpec() {
			return getRuleContexts(ConstSpecContext.class);
		}
		public ConstSpecContext constSpec(int i) {
			return getRuleContext(ConstSpecContext.class,i);
		}
		public OptSemiContext optSemi() {
			return getRuleContext(OptSemiContext.class,0);
		}
		public ConstSpecListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constSpecList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitConstSpecList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstSpecListContext constSpecList() throws RecognitionException {
		ConstSpecListContext _localctx = new ConstSpecListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_constSpecList);
		try {
			int _alt;
			setState(334);
			switch (_input.LA(1)) {
			case RPAREN:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(323);
						constSpec();
						setState(324);
						match(SEMI);
						}
						} 
					}
					setState(330);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(331);
				constSpec();
				setState(332);
				optSemi();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstSpecContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public ConstSpecRemContext constSpecRem() {
			return getRuleContext(ConstSpecRemContext.class,0);
		}
		public ConstSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constSpec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitConstSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstSpecContext constSpec() throws RecognitionException {
		ConstSpecContext _localctx = new ConstSpecContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_constSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			identifierList();
			setState(338);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(337);
				constSpecRem();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstSpecRemContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ConstSpecRemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constSpecRem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitConstSpecRem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstSpecRemContext constSpecRem() throws RecognitionException {
		ConstSpecRemContext _localctx = new ConstSpecRemContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_constSpecRem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << STRUCT) | (1L << Identifier))) != 0)) {
				{
				setState(340);
				type();
				}
			}

			setState(343);
			match(T__5);
			setState(344);
			expressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public Token Identifier;
		public List<Token> idl = new ArrayList<Token>();
		public List<TerminalNode> Identifier() { return getTokens(GooParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(GooParser.Identifier, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_identifierList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			((IdentifierListContext)_localctx).Identifier = match(Identifier);
			((IdentifierListContext)_localctx).idl.add(((IdentifierListContext)_localctx).Identifier);
			setState(351);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(347);
					match(T__4);
					setState(348);
					((IdentifierListContext)_localctx).Identifier = match(Identifier);
					((IdentifierListContext)_localctx).idl.add(((IdentifierListContext)_localctx).Identifier);
					}
					} 
				}
				setState(353);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> exl = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expressionList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			((ExpressionListContext)_localctx).expression = expression(0);
			((ExpressionListContext)_localctx).exl.add(((ExpressionListContext)_localctx).expression);
			setState(359);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(355);
					match(T__4);
					setState(356);
					((ExpressionListContext)_localctx).expression = expression(0);
					((ExpressionListContext)_localctx).exl.add(((ExpressionListContext)_localctx).expression);
					}
					} 
				}
				setState(361);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(GooParser.TYPE, 0); }
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public TypeSpecListContext typeSpecList() {
			return getRuleContext(TypeSpecListContext.class,0);
		}
		public TypeDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitTypeDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclContext typeDecl() throws RecognitionException {
		TypeDeclContext _localctx = new TypeDeclContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_typeDecl);
		try {
			setState(369);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				match(TYPE);
				setState(363);
				typeSpec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
				match(TYPE);
				setState(365);
				match(T__0);
				setState(366);
				typeSpecList();
				setState(367);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSpecListContext extends ParserRuleContext {
		public List<TypeSpecContext> typeSpec() {
			return getRuleContexts(TypeSpecContext.class);
		}
		public TypeSpecContext typeSpec(int i) {
			return getRuleContext(TypeSpecContext.class,i);
		}
		public OptSemiContext optSemi() {
			return getRuleContext(OptSemiContext.class,0);
		}
		public TypeSpecListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitTypeSpecList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSpecListContext typeSpecList() throws RecognitionException {
		TypeSpecListContext _localctx = new TypeSpecListContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_typeSpecList);
		try {
			int _alt;
			setState(383);
			switch (_input.LA(1)) {
			case RPAREN:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(372);
						typeSpec();
						setState(373);
						match(SEMI);
						}
						} 
					}
					setState(379);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				setState(380);
				typeSpec();
				setState(381);
				optSemi();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSpecContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(GooParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitTypeSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSpecContext typeSpec() throws RecognitionException {
		TypeSpecContext _localctx = new TypeSpecContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_typeSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(Identifier);
			setState(386);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(GooParser.VAR, 0); }
		public VarSpecContext varSpec() {
			return getRuleContext(VarSpecContext.class,0);
		}
		public VarSpecListContext varSpecList() {
			return getRuleContext(VarSpecListContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_varDecl);
		try {
			setState(395);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				match(VAR);
				setState(389);
				varSpec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				match(VAR);
				setState(391);
				match(T__0);
				setState(392);
				varSpecList();
				setState(393);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarSpecListContext extends ParserRuleContext {
		public List<VarSpecContext> varSpec() {
			return getRuleContexts(VarSpecContext.class);
		}
		public VarSpecContext varSpec(int i) {
			return getRuleContext(VarSpecContext.class,i);
		}
		public OptSemiContext optSemi() {
			return getRuleContext(OptSemiContext.class,0);
		}
		public VarSpecListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varSpecList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitVarSpecList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarSpecListContext varSpecList() throws RecognitionException {
		VarSpecListContext _localctx = new VarSpecListContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_varSpecList);
		try {
			int _alt;
			setState(409);
			switch (_input.LA(1)) {
			case RPAREN:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(403);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(398);
						varSpec();
						setState(399);
						match(SEMI);
						}
						} 
					}
					setState(405);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
				setState(406);
				varSpec();
				setState(407);
				optSemi();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarSpecContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public VarSpecRemContext varSpecRem() {
			return getRuleContext(VarSpecRemContext.class,0);
		}
		public VarSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varSpec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitVarSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarSpecContext varSpec() throws RecognitionException {
		VarSpecContext _localctx = new VarSpecContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_varSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			identifierList();
			setState(412);
			varSpecRem();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarSpecRemContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public VarSpecRemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varSpecRem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitVarSpecRem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarSpecRemContext varSpecRem() throws RecognitionException {
		VarSpecRemContext _localctx = new VarSpecRemContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_varSpecRem);
		try {
			setState(421);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(415);
				type();
				setState(416);
				match(T__5);
				setState(417);
				expressionList();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(419);
				match(T__5);
				setState(420);
				expressionList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShortVarDeclContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ShortVarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortVarDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitShortVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortVarDeclContext shortVarDecl() throws RecognitionException {
		ShortVarDeclContext _localctx = new ShortVarDeclContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_shortVarDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			identifierList();
			setState(424);
			match(T__6);
			setState(425);
			expressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(GooParser.FUNC, 0); }
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_functionDecl);
		try {
			setState(435);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				match(FUNC);
				setState(428);
				functionName();
				setState(429);
				function();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				match(FUNC);
				setState(432);
				functionName();
				setState(433);
				signature();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(GooParser.Identifier, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			signature();
			setState(440);
			functionBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperandContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public OperandNameContext operandName() {
			return getRuleContext(OperandNameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_operand);
		try {
			setState(450);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(444);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(445);
				operandName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(446);
				match(T__0);
				setState(447);
				expression(0);
				setState(448);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public BasicLitContext basicLit() {
			return getRuleContext(BasicLitContext.class,0);
		}
		public CompositeLitContext compositeLit() {
			return getRuleContext(CompositeLitContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_literal);
		try {
			setState(454);
			switch (_input.LA(1)) {
			case IntLit:
			case FloatLit:
			case StringLit:
			case RuneLit:
				enterOuterAlt(_localctx, 1);
				{
				setState(452);
				basicLit();
				}
				break;
			case T__1:
			case STRUCT:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(453);
				compositeLit();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicLitContext extends ParserRuleContext {
		public TerminalNode IntLit() { return getToken(GooParser.IntLit, 0); }
		public TerminalNode FloatLit() { return getToken(GooParser.FloatLit, 0); }
		public TerminalNode RuneLit() { return getToken(GooParser.RuneLit, 0); }
		public TerminalNode StringLit() { return getToken(GooParser.StringLit, 0); }
		public BasicLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicLit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitBasicLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicLitContext basicLit() throws RecognitionException {
		BasicLitContext _localctx = new BasicLitContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_basicLit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntLit) | (1L << FloatLit) | (1L << StringLit) | (1L << RuneLit))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperandNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(GooParser.Identifier, 0); }
		public QualifiedIdentContext qualifiedIdent() {
			return getRuleContext(QualifiedIdentContext.class,0);
		}
		public OperandNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operandName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitOperandName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandNameContext operandName() throws RecognitionException {
		OperandNameContext _localctx = new OperandNameContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_operandName);
		try {
			setState(460);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(459);
				qualifiedIdent();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedIdentContext extends ParserRuleContext {
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(GooParser.Identifier, 0); }
		public QualifiedIdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedIdent; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitQualifiedIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedIdentContext qualifiedIdent() throws RecognitionException {
		QualifiedIdentContext _localctx = new QualifiedIdentContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_qualifiedIdent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			packageName();
			setState(463);
			match(T__7);
			setState(464);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompositeLitContext extends ParserRuleContext {
		public LiteralTypeContext literalType() {
			return getRuleContext(LiteralTypeContext.class,0);
		}
		public LiteralValueContext literalValue() {
			return getRuleContext(LiteralValueContext.class,0);
		}
		public CompositeLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compositeLit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitCompositeLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompositeLitContext compositeLit() throws RecognitionException {
		CompositeLitContext _localctx = new CompositeLitContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_compositeLit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			literalType();
			setState(467);
			literalValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralTypeContext extends ParserRuleContext {
		public StructTypeContext structType() {
			return getRuleContext(StructTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ElementTypeContext elementType() {
			return getRuleContext(ElementTypeContext.class,0);
		}
		public SliceTypeContext sliceType() {
			return getRuleContext(SliceTypeContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public LiteralTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitLiteralType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralTypeContext literalType() throws RecognitionException {
		LiteralTypeContext _localctx = new LiteralTypeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_literalType);
		try {
			setState(477);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(469);
				structType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(470);
				arrayType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(471);
				match(T__1);
				setState(472);
				match(T__8);
				setState(473);
				match(RSQ);
				setState(474);
				elementType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(475);
				sliceType();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(476);
				typeName();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralValueContext extends ParserRuleContext {
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public LiteralValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitLiteralValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralValueContext literalValue() throws RecognitionException {
		LiteralValueContext _localctx = new LiteralValueContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_literalValue);
		int _la;
		try {
			setState(488);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(479);
				match(T__2);
				setState(480);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(481);
				match(T__2);
				setState(482);
				elementList();
				setState(484);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(483);
					match(T__4);
					}
				}

				setState(486);
				match(RBRACE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementListContext extends ParserRuleContext {
		public ElementContext element;
		public List<ElementContext> exl = new ArrayList<ElementContext>();
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public ElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitElementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementListContext elementList() throws RecognitionException {
		ElementListContext _localctx = new ElementListContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_elementList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			((ElementListContext)_localctx).element = element();
			((ElementListContext)_localctx).exl.add(((ElementListContext)_localctx).element);
			setState(495);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(491);
					match(T__4);
					setState(492);
					((ElementListContext)_localctx).element = element();
					((ElementListContext)_localctx).exl.add(((ElementListContext)_localctx).element);
					}
					} 
				}
				setState(497);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LiteralValueContext literalValue() {
			return getRuleContext(LiteralValueContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_value);
		try {
			setState(502);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__3:
			case T__18:
			case T__19:
			case T__21:
			case T__26:
			case T__28:
			case STRUCT:
			case Identifier:
			case IntLit:
			case FloatLit:
			case StringLit:
			case RuneLit:
				enterOuterAlt(_localctx, 1);
				{
				setState(500);
				expression(0);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(501);
				literalValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryExprContext extends ParserRuleContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public ConversionContext conversion() {
			return getRuleContext(ConversionContext.class,0);
		}
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public SliceContext slice() {
			return getRuleContext(SliceContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public PrimaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitPrimaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		return primaryExpr(0);
	}

	private PrimaryExprContext primaryExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, _parentState);
		PrimaryExprContext _prevctx = _localctx;
		int _startState = 104;
		enterRecursionRule(_localctx, 104, RULE_primaryExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(505);
				operand();
				}
				break;
			case 2:
				{
				setState(506);
				conversion();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(519);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(517);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						_localctx = new PrimaryExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpr);
						setState(509);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(510);
						selector();
						}
						break;
					case 2:
						{
						_localctx = new PrimaryExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpr);
						setState(511);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(512);
						index();
						}
						break;
					case 3:
						{
						_localctx = new PrimaryExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpr);
						setState(513);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(514);
						slice();
						}
						break;
					case 4:
						{
						_localctx = new PrimaryExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpr);
						setState(515);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(516);
						arguments();
						}
						break;
					}
					} 
				}
				setState(521);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SelectorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(GooParser.Identifier, 0); }
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_selector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(T__7);
			setState(523);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(T__1);
			setState(526);
			expression(0);
			setState(527);
			match(RSQ);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SliceContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SliceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slice; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitSlice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SliceContext slice() throws RecognitionException {
		SliceContext _localctx = new SliceContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_slice);
		int _la;
		try {
			setState(548);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(529);
				match(T__1);
				setState(531);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__26) | (1L << T__28) | (1L << STRUCT) | (1L << Identifier) | (1L << IntLit) | (1L << FloatLit) | (1L << StringLit) | (1L << RuneLit))) != 0)) {
					{
					setState(530);
					expression(0);
					}
				}

				setState(533);
				match(T__9);
				setState(535);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__26) | (1L << T__28) | (1L << STRUCT) | (1L << Identifier) | (1L << IntLit) | (1L << FloatLit) | (1L << StringLit) | (1L << RuneLit))) != 0)) {
					{
					setState(534);
					expression(0);
					}
				}

				setState(537);
				match(RSQ);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(538);
				match(T__1);
				setState(540);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__26) | (1L << T__28) | (1L << STRUCT) | (1L << Identifier) | (1L << IntLit) | (1L << FloatLit) | (1L << StringLit) | (1L << RuneLit))) != 0)) {
					{
					setState(539);
					expression(0);
					}
				}

				setState(542);
				match(T__9);
				setState(543);
				expression(0);
				setState(544);
				match(T__9);
				setState(545);
				expression(0);
				setState(546);
				match(RSQ);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_arguments);
		int _la;
		try {
			setState(559);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(550);
				match(T__0);
				setState(551);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(552);
				match(T__0);
				setState(553);
				expressionList();
				setState(555);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(554);
					match(T__4);
					}
				}

				setState(557);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolExpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BoolExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitBoolExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnExpContext extends ExpressionContext {
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public UnExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitUnExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumExpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MulOpContext mulOp() {
			return getRuleContext(MulOpContext.class,0);
		}
		public AddOpContext addOp() {
			return getRuleContext(AddOpContext.class,0);
		}
		public NumExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitNumExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelExpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RelOpContext relOp() {
			return getRuleContext(RelOpContext.class,0);
		}
		public RelExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitRelExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 114;
		enterRecursionRule(_localctx, 114, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new UnExpContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(562);
			unaryExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(584);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(582);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						_localctx = new NumExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(564);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(565);
						mulOp();
						setState(566);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new NumExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(568);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(569);
						addOp();
						setState(570);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new RelExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(572);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(573);
						relOp();
						setState(574);
						expression(4);
						}
						break;
					case 4:
						{
						_localctx = new BoolExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(576);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(577);
						match(T__10);
						setState(578);
						expression(3);
						}
						break;
					case 5:
						{
						_localctx = new BoolExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(579);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(580);
						match(T__11);
						setState(581);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(586);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExprContext extends ParserRuleContext {
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public UnaryOpContext unaryOp() {
			return getRuleContext(UnaryOpContext.class,0);
		}
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_unaryExpr);
		try {
			setState(591);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(587);
				primaryExpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(588);
				unaryOp();
				setState(589);
				unaryExpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelOpContext extends ParserRuleContext {
		public RelOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitRelOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelOpContext relOp() throws RecognitionException {
		RelOpContext _localctx = new RelOpContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_relOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddOpContext extends ParserRuleContext {
		public AddOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitAddOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddOpContext addOp() throws RecognitionException {
		AddOpContext _localctx = new AddOpContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_addOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MulOpContext extends ParserRuleContext {
		public MulOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitMulOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulOpContext mulOp() throws RecognitionException {
		MulOpContext _localctx = new MulOpContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_mulOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryOpContext extends ParserRuleContext {
		public UnaryOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitUnaryOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOpContext unaryOp() throws RecognitionException {
		UnaryOpContext _localctx = new UnaryOpContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_unaryOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__26) | (1L << T__28))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConversionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConversionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitConversion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConversionContext conversion() throws RecognitionException {
		ConversionContext _localctx = new ConversionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_conversion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			type();
			setState(602);
			match(T__0);
			setState(603);
			expression(0);
			setState(605);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(604);
				match(T__4);
				}
			}

			setState(607);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public LabeledStmtContext labeledStmt() {
			return getRuleContext(LabeledStmtContext.class,0);
		}
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public BreakStmtContext breakStmt() {
			return getRuleContext(BreakStmtContext.class,0);
		}
		public ContinueStmtContext continueStmt() {
			return getRuleContext(ContinueStmtContext.class,0);
		}
		public GotoStmtContext gotoStmt() {
			return getRuleContext(GotoStmtContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_statement);
		try {
			setState(619);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(609);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(610);
				labeledStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(611);
				simpleStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(612);
				returnStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(613);
				breakStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(614);
				continueStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(615);
				gotoStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(616);
				block();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(617);
				ifStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(618);
				forStmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleStmtContext extends ParserRuleContext {
		public EmptyStmtContext emptyStmt() {
			return getRuleContext(EmptyStmtContext.class,0);
		}
		public ExpressionStmtContext expressionStmt() {
			return getRuleContext(ExpressionStmtContext.class,0);
		}
		public IncDecStmtContext incDecStmt() {
			return getRuleContext(IncDecStmtContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ShortVarDeclContext shortVarDecl() {
			return getRuleContext(ShortVarDeclContext.class,0);
		}
		public SimpleStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitSimpleStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleStmtContext simpleStmt() throws RecognitionException {
		SimpleStmtContext _localctx = new SimpleStmtContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_simpleStmt);
		try {
			setState(626);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(621);
				emptyStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(622);
				expressionStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(623);
				incDecStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(624);
				assignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(625);
				shortVarDecl();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyStmtContext extends ParserRuleContext {
		public EmptyStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitEmptyStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStmtContext emptyStmt() throws RecognitionException {
		EmptyStmtContext _localctx = new EmptyStmtContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_emptyStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStmtContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabeledStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitLabeledStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledStmtContext labeledStmt() throws RecognitionException {
		LabeledStmtContext _localctx = new LabeledStmtContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_labeledStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			label();
			setState(631);
			match(T__9);
			setState(632);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(GooParser.Identifier, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitExpressionStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStmtContext expressionStmt() throws RecognitionException {
		ExpressionStmtContext _localctx = new ExpressionStmtContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_expressionStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncDecStmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IncDecStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incDecStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitIncDecStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncDecStmtContext incDecStmt() throws RecognitionException {
		IncDecStmtContext _localctx = new IncDecStmtContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_incDecStmt);
		try {
			setState(644);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(638);
				expression(0);
				setState(639);
				match(PLUSPLUS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(641);
				expression(0);
				setState(642);
				match(MINUSMINUS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public List<ExpressionListContext> expressionList() {
			return getRuleContexts(ExpressionListContext.class);
		}
		public ExpressionListContext expressionList(int i) {
			return getRuleContext(ExpressionListContext.class,i);
		}
		public AssignOpContext assignOp() {
			return getRuleContext(AssignOpContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			expressionList();
			setState(647);
			assignOp();
			setState(648);
			expressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignOpContext extends ParserRuleContext {
		public AddOpContext addOp() {
			return getRuleContext(AddOpContext.class,0);
		}
		public MulOpContext mulOp() {
			return getRuleContext(MulOpContext.class,0);
		}
		public AssignOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitAssignOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignOpContext assignOp() throws RecognitionException {
		AssignOpContext _localctx = new AssignOpContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_assignOp);
		try {
			setState(657);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(650);
				match(T__5);
				}
				break;
			case T__18:
			case T__19:
			case T__20:
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(651);
				addOp();
				setState(652);
				match(T__5);
				}
				break;
			case T__3:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
				enterOuterAlt(_localctx, 3);
				{
				setState(654);
				mulOp();
				setState(655);
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(GooParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElsePartContext elsePart() {
			return getRuleContext(ElsePartContext.class,0);
		}
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_ifStmt);
		try {
			setState(671);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(659);
				match(IF);
				setState(660);
				expression(0);
				setState(661);
				block();
				setState(662);
				elsePart();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(664);
				match(IF);
				setState(665);
				simpleStmt();
				setState(666);
				match(SEMI);
				setState(667);
				expression(0);
				setState(668);
				block();
				setState(669);
				elsePart();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElsePartContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(GooParser.ELSE, 0); }
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElsePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsePart; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitElsePart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsePartContext elsePart() throws RecognitionException {
		ElsePartContext _localctx = new ElsePartContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_elsePart);
		try {
			setState(678);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(674);
				match(ELSE);
				setState(675);
				ifStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(676);
				match(ELSE);
				setState(677);
				block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(GooParser.FOR, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForClauseContext forClause() {
			return getRuleContext(ForClauseContext.class,0);
		}
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_forStmt);
		try {
			setState(688);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(680);
				match(FOR);
				setState(681);
				condition();
				setState(682);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(684);
				match(FOR);
				setState(685);
				forClause();
				setState(686);
				block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForClauseContext extends ParserRuleContext {
		public InitStmtContext initStmt() {
			return getRuleContext(InitStmtContext.class,0);
		}
		public PostStmtContext postStmt() {
			return getRuleContext(PostStmtContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ForClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitForClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForClauseContext forClause() throws RecognitionException {
		ForClauseContext _localctx = new ForClauseContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			initStmt();
			setState(693);
			match(SEMI);
			setState(695);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__26) | (1L << T__28) | (1L << STRUCT) | (1L << Identifier) | (1L << IntLit) | (1L << FloatLit) | (1L << StringLit) | (1L << RuneLit))) != 0)) {
				{
				setState(694);
				condition();
				}
			}

			setState(697);
			match(SEMI);
			setState(698);
			postStmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitStmtContext extends ParserRuleContext {
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
		}
		public InitStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitInitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitStmtContext initStmt() throws RecognitionException {
		InitStmtContext _localctx = new InitStmtContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_initStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			simpleStmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostStmtContext extends ParserRuleContext {
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
		}
		public PostStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitPostStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostStmtContext postStmt() throws RecognitionException {
		PostStmtContext _localctx = new PostStmtContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_postStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			simpleStmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(GooParser.RETURN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_returnStmt);
		try {
			setState(707);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(704);
				match(RETURN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(705);
				match(RETURN);
				setState(706);
				expressionList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStmtContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(GooParser.BREAK, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public BreakStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitBreakStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStmtContext breakStmt() throws RecognitionException {
		BreakStmtContext _localctx = new BreakStmtContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_breakStmt);
		try {
			setState(712);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(709);
				match(BREAK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(710);
				match(BREAK);
				setState(711);
				label();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStmtContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(GooParser.CONTINUE, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public ContinueStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitContinueStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStmtContext continueStmt() throws RecognitionException {
		ContinueStmtContext _localctx = new ContinueStmtContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_continueStmt);
		try {
			setState(717);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(714);
				match(CONTINUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(715);
				match(CONTINUE);
				setState(716);
				label();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GotoStmtContext extends ParserRuleContext {
		public TerminalNode GOTO() { return getToken(GooParser.GOTO, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public GotoStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gotoStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitGotoStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GotoStmtContext gotoStmt() throws RecognitionException {
		GotoStmtContext _localctx = new GotoStmtContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_gotoStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			match(GOTO);
			setState(720);
			label();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SourceFileContext extends ParserRuleContext {
		public PackageClauseContext packageClause() {
			return getRuleContext(PackageClauseContext.class,0);
		}
		public ImportDeclListContext importDeclList() {
			return getRuleContext(ImportDeclListContext.class,0);
		}
		public TopLevelDeclListContext topLevelDeclList() {
			return getRuleContext(TopLevelDeclListContext.class,0);
		}
		public SourceFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceFile; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitSourceFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceFileContext sourceFile() throws RecognitionException {
		SourceFileContext _localctx = new SourceFileContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_sourceFile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			packageClause();
			setState(723);
			match(SEMI);
			setState(724);
			importDeclList();
			setState(725);
			topLevelDeclList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageClauseContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(GooParser.PACKAGE, 0); }
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public PackageClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitPackageClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageClauseContext packageClause() throws RecognitionException {
		PackageClauseContext _localctx = new PackageClauseContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_packageClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
			match(PACKAGE);
			setState(728);
			packageName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(GooParser.Identifier, 0); }
		public PackageNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitPackageName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageNameContext packageName() throws RecognitionException {
		PackageNameContext _localctx = new PackageNameContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_packageName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclListContext extends ParserRuleContext {
		public List<ImportDeclContext> importDecl() {
			return getRuleContexts(ImportDeclContext.class);
		}
		public ImportDeclContext importDecl(int i) {
			return getRuleContext(ImportDeclContext.class,i);
		}
		public ImportDeclListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitImportDeclList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclListContext importDeclList() throws RecognitionException {
		ImportDeclListContext _localctx = new ImportDeclListContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_importDeclList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(732);
				importDecl();
				setState(733);
				match(SEMI);
				}
				}
				setState(739);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(GooParser.IMPORT, 0); }
		public ImportSpecContext importSpec() {
			return getRuleContext(ImportSpecContext.class,0);
		}
		public ImportSpecListContext importSpecList() {
			return getRuleContext(ImportSpecListContext.class,0);
		}
		public ImportDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitImportDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclContext importDecl() throws RecognitionException {
		ImportDeclContext _localctx = new ImportDeclContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_importDecl);
		try {
			setState(747);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(740);
				match(IMPORT);
				setState(741);
				importSpec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(742);
				match(IMPORT);
				setState(743);
				match(T__0);
				setState(744);
				importSpecList();
				setState(745);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportSpecListContext extends ParserRuleContext {
		public List<ImportSpecContext> importSpec() {
			return getRuleContexts(ImportSpecContext.class);
		}
		public ImportSpecContext importSpec(int i) {
			return getRuleContext(ImportSpecContext.class,i);
		}
		public OptSemiContext optSemi() {
			return getRuleContext(OptSemiContext.class,0);
		}
		public ImportSpecListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importSpecList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitImportSpecList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportSpecListContext importSpecList() throws RecognitionException {
		ImportSpecListContext _localctx = new ImportSpecListContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_importSpecList);
		try {
			int _alt;
			setState(761);
			switch (_input.LA(1)) {
			case RPAREN:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case StringLit:
				enterOuterAlt(_localctx, 2);
				{
				setState(755);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(750);
						importSpec();
						setState(751);
						match(SEMI);
						}
						} 
					}
					setState(757);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				}
				setState(758);
				importSpec();
				setState(759);
				optSemi();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportSpecContext extends ParserRuleContext {
		public ImportPathContext importPath() {
			return getRuleContext(ImportPathContext.class,0);
		}
		public ImportSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importSpec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitImportSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportSpecContext importSpec() throws RecognitionException {
		ImportSpecContext _localctx = new ImportSpecContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_importSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			importPath();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportPathContext extends ParserRuleContext {
		public TerminalNode StringLit() { return getToken(GooParser.StringLit, 0); }
		public ImportPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importPath; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitImportPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportPathContext importPath() throws RecognitionException {
		ImportPathContext _localctx = new ImportPathContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_importPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			match(StringLit);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptSemiContext extends ParserRuleContext {
		public OptSemiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optSemi; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GooVisitor ) return ((GooVisitor<? extends T>)visitor).visitOptSemi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptSemiContext optSemi() throws RecognitionException {
		OptSemiContext _localctx = new OptSemiContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_optSemi);
		try {
			setState(769);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(767);
				if (!(_input.LT(1).getText().equals("}") || _input.LT(1).getText().equals(")"))) throw new FailedPredicateException(this, "_input.LT(1).getText().equals(\"}\") || _input.LT(1).getText().equals(\")\")");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(768);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 52:
			return primaryExpr_sempred((PrimaryExprContext)_localctx, predIndex);
		case 57:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 92:
			return optSemi_sempred((OptSemiContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean primaryExpr_sempred(PrimaryExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean optSemi_sempred(OptSemiContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return _input.LT(1).getText().equals("}") || _input.LT(1).getText().equals(")");
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3I\u0306\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\5\2\u00c3\n\2\3\3\3\3\3\4\3\4\3\4\3\4\5\4\u00cb\n\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\7\n\u00e3\n\n\f\n\16\n\u00e6\13\n\3\n\3\n\3\n\5\n\u00eb"+
		"\n\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\5\16\u00f7\n\16\3\17"+
		"\3\17\3\20\3\20\3\20\5\20\u00fe\n\20\5\20\u0100\n\20\3\20\3\20\3\21\3"+
		"\21\3\21\7\21\u0107\n\21\f\21\16\21\u010a\13\21\3\22\5\22\u010d\n\22\3"+
		"\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u011b"+
		"\n\25\f\25\16\25\u011e\13\25\3\25\3\25\3\25\5\25\u0123\n\25\3\26\3\26"+
		"\3\26\5\26\u0128\n\26\3\27\3\27\3\27\3\27\7\27\u012e\n\27\f\27\16\27\u0131"+
		"\13\27\3\27\3\27\3\27\5\27\u0136\n\27\3\30\3\30\5\30\u013a\n\30\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\5\31\u0143\n\31\3\32\3\32\3\32\3\32\7\32"+
		"\u0149\n\32\f\32\16\32\u014c\13\32\3\32\3\32\3\32\5\32\u0151\n\32\3\33"+
		"\3\33\5\33\u0155\n\33\3\34\5\34\u0158\n\34\3\34\3\34\3\34\3\35\3\35\3"+
		"\35\7\35\u0160\n\35\f\35\16\35\u0163\13\35\3\36\3\36\3\36\7\36\u0168\n"+
		"\36\f\36\16\36\u016b\13\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0174"+
		"\n\37\3 \3 \3 \3 \7 \u017a\n \f \16 \u017d\13 \3 \3 \3 \5 \u0182\n \3"+
		"!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u018e\n\"\3#\3#\3#\3#\7#\u0194"+
		"\n#\f#\16#\u0197\13#\3#\3#\3#\5#\u019c\n#\3$\3$\3$\3%\3%\3%\3%\3%\3%\3"+
		"%\5%\u01a8\n%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01b6\n"+
		"\'\3(\3(\3)\3)\3)\3*\3*\3+\3+\3+\3+\3+\3+\5+\u01c5\n+\3,\3,\5,\u01c9\n"+
		",\3-\3-\3.\3.\5.\u01cf\n.\3/\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\5\61\u01e0\n\61\3\62\3\62\3\62\3\62\3\62\5\62"+
		"\u01e7\n\62\3\62\3\62\5\62\u01eb\n\62\3\63\3\63\3\63\7\63\u01f0\n\63\f"+
		"\63\16\63\u01f3\13\63\3\64\3\64\3\65\3\65\5\65\u01f9\n\65\3\66\3\66\3"+
		"\66\5\66\u01fe\n\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\7\66\u0208"+
		"\n\66\f\66\16\66\u020b\13\66\3\67\3\67\3\67\38\38\38\38\39\39\59\u0216"+
		"\n9\39\39\59\u021a\n9\39\39\39\59\u021f\n9\39\39\39\39\39\39\59\u0227"+
		"\n9\3:\3:\3:\3:\3:\5:\u022e\n:\3:\3:\5:\u0232\n:\3;\3;\3;\3;\3;\3;\3;"+
		"\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\7;\u0249\n;\f;\16;\u024c\13"+
		";\3<\3<\3<\3<\5<\u0252\n<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3A\3A\5A\u0260"+
		"\nA\3A\3A\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\5B\u026e\nB\3C\3C\3C\3C\3C\5C"+
		"\u0275\nC\3D\3D\3E\3E\3E\3E\3F\3F\3G\3G\3H\3H\3H\3H\3H\3H\5H\u0287\nH"+
		"\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3J\5J\u0294\nJ\3K\3K\3K\3K\3K\3K\3K\3K"+
		"\3K\3K\3K\3K\5K\u02a2\nK\3L\3L\3L\3L\3L\5L\u02a9\nL\3M\3M\3M\3M\3M\3M"+
		"\3M\3M\5M\u02b3\nM\3N\3N\3O\3O\3O\5O\u02ba\nO\3O\3O\3O\3P\3P\3Q\3Q\3R"+
		"\3R\3R\5R\u02c6\nR\3S\3S\3S\5S\u02cb\nS\3T\3T\3T\5T\u02d0\nT\3U\3U\3U"+
		"\3V\3V\3V\3V\3V\3W\3W\3W\3X\3X\3Y\3Y\3Y\7Y\u02e2\nY\fY\16Y\u02e5\13Y\3"+
		"Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u02ee\nZ\3[\3[\3[\3[\7[\u02f4\n[\f[\16[\u02f7\13"+
		"[\3[\3[\3[\5[\u02fc\n[\3\\\3\\\3]\3]\3^\3^\5^\u0304\n^\3^\2\4jt_\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT"+
		"VXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\2\7\3\2;"+
		">\3\2\17\24\3\2\25\30\4\2\6\6\31\36\7\2\6\6\25\26\30\30\35\35\37\37\u0306"+
		"\2\u00c2\3\2\2\2\4\u00c4\3\2\2\2\6\u00ca\3\2\2\2\b\u00cc\3\2\2\2\n\u00d1"+
		"\3\2\2\2\f\u00d3\3\2\2\2\16\u00d5\3\2\2\2\20\u00d9\3\2\2\2\22\u00ea\3"+
		"\2\2\2\24\u00ec\3\2\2\2\26\u00ef\3\2\2\2\30\u00f2\3\2\2\2\32\u00f4\3\2"+
		"\2\2\34\u00f8\3\2\2\2\36\u00fa\3\2\2\2 \u0103\3\2\2\2\"\u010c\3\2\2\2"+
		"$\u0110\3\2\2\2&\u0112\3\2\2\2(\u0122\3\2\2\2*\u0127\3\2\2\2,\u0135\3"+
		"\2\2\2.\u0139\3\2\2\2\60\u0142\3\2\2\2\62\u0150\3\2\2\2\64\u0152\3\2\2"+
		"\2\66\u0157\3\2\2\28\u015c\3\2\2\2:\u0164\3\2\2\2<\u0173\3\2\2\2>\u0181"+
		"\3\2\2\2@\u0183\3\2\2\2B\u018d\3\2\2\2D\u019b\3\2\2\2F\u019d\3\2\2\2H"+
		"\u01a7\3\2\2\2J\u01a9\3\2\2\2L\u01b5\3\2\2\2N\u01b7\3\2\2\2P\u01b9\3\2"+
		"\2\2R\u01bc\3\2\2\2T\u01c4\3\2\2\2V\u01c8\3\2\2\2X\u01ca\3\2\2\2Z\u01ce"+
		"\3\2\2\2\\\u01d0\3\2\2\2^\u01d4\3\2\2\2`\u01df\3\2\2\2b\u01ea\3\2\2\2"+
		"d\u01ec\3\2\2\2f\u01f4\3\2\2\2h\u01f8\3\2\2\2j\u01fd\3\2\2\2l\u020c\3"+
		"\2\2\2n\u020f\3\2\2\2p\u0226\3\2\2\2r\u0231\3\2\2\2t\u0233\3\2\2\2v\u0251"+
		"\3\2\2\2x\u0253\3\2\2\2z\u0255\3\2\2\2|\u0257\3\2\2\2~\u0259\3\2\2\2\u0080"+
		"\u025b\3\2\2\2\u0082\u026d\3\2\2\2\u0084\u0274\3\2\2\2\u0086\u0276\3\2"+
		"\2\2\u0088\u0278\3\2\2\2\u008a\u027c\3\2\2\2\u008c\u027e\3\2\2\2\u008e"+
		"\u0286\3\2\2\2\u0090\u0288\3\2\2\2\u0092\u0293\3\2\2\2\u0094\u02a1\3\2"+
		"\2\2\u0096\u02a8\3\2\2\2\u0098\u02b2\3\2\2\2\u009a\u02b4\3\2\2\2\u009c"+
		"\u02b6\3\2\2\2\u009e\u02be\3\2\2\2\u00a0\u02c0\3\2\2\2\u00a2\u02c5\3\2"+
		"\2\2\u00a4\u02ca\3\2\2\2\u00a6\u02cf\3\2\2\2\u00a8\u02d1\3\2\2\2\u00aa"+
		"\u02d4\3\2\2\2\u00ac\u02d9\3\2\2\2\u00ae\u02dc\3\2\2\2\u00b0\u02e3\3\2"+
		"\2\2\u00b2\u02ed\3\2\2\2\u00b4\u02fb\3\2\2\2\u00b6\u02fd\3\2\2\2\u00b8"+
		"\u02ff\3\2\2\2\u00ba\u0303\3\2\2\2\u00bc\u00c3\5\4\3\2\u00bd\u00c3\5\6"+
		"\4\2\u00be\u00bf\7\3\2\2\u00bf\u00c0\5\2\2\2\u00c0\u00c1\7A\2\2\u00c1"+
		"\u00c3\3\2\2\2\u00c2\u00bc\3\2\2\2\u00c2\u00bd\3\2\2\2\u00c2\u00be\3\2"+
		"\2\2\u00c3\3\3\2\2\2\u00c4\u00c5\79\2\2\u00c5\5\3\2\2\2\u00c6\u00cb\5"+
		"\b\5\2\u00c7\u00cb\5\20\t\2\u00c8\u00cb\5\26\f\2\u00c9\u00cb\5\16\b\2"+
		"\u00ca\u00c6\3\2\2\2\u00ca\u00c7\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00c9"+
		"\3\2\2\2\u00cb\7\3\2\2\2\u00cc\u00cd\7\4\2\2\u00cd\u00ce\5\n\6\2\u00ce"+
		"\u00cf\7B\2\2\u00cf\u00d0\5\f\7\2\u00d0\t\3\2\2\2\u00d1\u00d2\5t;\2\u00d2"+
		"\13\3\2\2\2\u00d3\u00d4\5\2\2\2\u00d4\r\3\2\2\2\u00d5\u00d6\7\4\2\2\u00d6"+
		"\u00d7\7B\2\2\u00d7\u00d8\5\f\7\2\u00d8\17\3\2\2\2\u00d9\u00da\7\65\2"+
		"\2\u00da\u00db\7\5\2\2\u00db\u00dc\5\22\n\2\u00dc\u00dd\7C\2\2\u00dd\21"+
		"\3\2\2\2\u00de\u00eb\3\2\2\2\u00df\u00e0\5\24\13\2\u00e0\u00e1\7D\2\2"+
		"\u00e1\u00e3\3\2\2\2\u00e2\u00df\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2"+
		"\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7"+
		"\u00e8\5\24\13\2\u00e8\u00e9\5\u00ba^\2\u00e9\u00eb\3\2\2\2\u00ea\u00de"+
		"\3\2\2\2\u00ea\u00e4\3\2\2\2\u00eb\23\3\2\2\2\u00ec\u00ed\58\35\2\u00ed"+
		"\u00ee\5\2\2\2\u00ee\25\3\2\2\2\u00ef\u00f0\7\6\2\2\u00f0\u00f1\5\30\r"+
		"\2\u00f1\27\3\2\2\2\u00f2\u00f3\5\2\2\2\u00f3\31\3\2\2\2\u00f4\u00f6\5"+
		"\36\20\2\u00f5\u00f7\5\34\17\2\u00f6\u00f5\3\2\2\2\u00f6\u00f7\3\2\2\2"+
		"\u00f7\33\3\2\2\2\u00f8\u00f9\5\2\2\2\u00f9\35\3\2\2\2\u00fa\u00ff\7\3"+
		"\2\2\u00fb\u00fd\5 \21\2\u00fc\u00fe\7\7\2\2\u00fd\u00fc\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00fb\3\2\2\2\u00ff\u0100\3\2"+
		"\2\2\u0100\u0101\3\2\2\2\u0101\u0102\7A\2\2\u0102\37\3\2\2\2\u0103\u0108"+
		"\5\"\22\2\u0104\u0105\7\7\2\2\u0105\u0107\5\"\22\2\u0106\u0104\3\2\2\2"+
		"\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109!\3"+
		"\2\2\2\u010a\u0108\3\2\2\2\u010b\u010d\58\35\2\u010c\u010b\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\5\2\2\2\u010f#\3\2\2\2"+
		"\u0110\u0111\79\2\2\u0111%\3\2\2\2\u0112\u0113\7\5\2\2\u0113\u0114\5("+
		"\25\2\u0114\u0115\7C\2\2\u0115\'\3\2\2\2\u0116\u0123\3\2\2\2\u0117\u0118"+
		"\5\u0082B\2\u0118\u0119\7D\2\2\u0119\u011b\3\2\2\2\u011a\u0117\3\2\2\2"+
		"\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011f"+
		"\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0120\5\u0082B\2\u0120\u0121\5\u00ba"+
		"^\2\u0121\u0123\3\2\2\2\u0122\u0116\3\2\2\2\u0122\u011c\3\2\2\2\u0123"+
		")\3\2\2\2\u0124\u0128\5\60\31\2\u0125\u0128\5<\37\2\u0126\u0128\5B\"\2"+
		"\u0127\u0124\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0126\3\2\2\2\u0128+\3"+
		"\2\2\2\u0129\u0136\3\2\2\2\u012a\u012b\5.\30\2\u012b\u012c\7D\2\2\u012c"+
		"\u012e\3\2\2\2\u012d\u012a\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2"+
		"\2\2\u012f\u0130\3\2\2\2\u0130\u0132\3\2\2\2\u0131\u012f\3\2\2\2\u0132"+
		"\u0133\5.\30\2\u0133\u0134\5\u00ba^\2\u0134\u0136\3\2\2\2\u0135\u0129"+
		"\3\2\2\2\u0135\u012f\3\2\2\2\u0136-\3\2\2\2\u0137\u013a\5*\26\2\u0138"+
		"\u013a\5L\'\2\u0139\u0137\3\2\2\2\u0139\u0138\3\2\2\2\u013a/\3\2\2\2\u013b"+
		"\u013c\7#\2\2\u013c\u0143\5\64\33\2\u013d\u013e\7#\2\2\u013e\u013f\7\3"+
		"\2\2\u013f\u0140\5\62\32\2\u0140\u0141\7A\2\2\u0141\u0143\3\2\2\2\u0142"+
		"\u013b\3\2\2\2\u0142\u013d\3\2\2\2\u0143\61\3\2\2\2\u0144\u0151\3\2\2"+
		"\2\u0145\u0146\5\64\33\2\u0146\u0147\7D\2\2\u0147\u0149\3\2\2\2\u0148"+
		"\u0145\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2"+
		"\2\2\u014b\u014d\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014e\5\64\33\2\u014e"+
		"\u014f\5\u00ba^\2\u014f\u0151\3\2\2\2\u0150\u0144\3\2\2\2\u0150\u014a"+
		"\3\2\2\2\u0151\63\3\2\2\2\u0152\u0154\58\35\2\u0153\u0155\5\66\34\2\u0154"+
		"\u0153\3\2\2\2\u0154\u0155\3\2\2\2\u0155\65\3\2\2\2\u0156\u0158\5\2\2"+
		"\2\u0157\u0156\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a"+
		"\7\b\2\2\u015a\u015b\5:\36\2\u015b\67\3\2\2\2\u015c\u0161\79\2\2\u015d"+
		"\u015e\7\7\2\2\u015e\u0160\79\2\2\u015f\u015d\3\2\2\2\u0160\u0163\3\2"+
		"\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u01629\3\2\2\2\u0163\u0161"+
		"\3\2\2\2\u0164\u0169\5t;\2\u0165\u0166\7\7\2\2\u0166\u0168\5t;\2\u0167"+
		"\u0165\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2"+
		"\2\2\u016a;\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u016d\7\67\2\2\u016d\u0174"+
		"\5@!\2\u016e\u016f\7\67\2\2\u016f\u0170\7\3\2\2\u0170\u0171\5> \2\u0171"+
		"\u0172\7A\2\2\u0172\u0174\3\2\2\2\u0173\u016c\3\2\2\2\u0173\u016e\3\2"+
		"\2\2\u0174=\3\2\2\2\u0175\u0182\3\2\2\2\u0176\u0177\5@!\2\u0177\u0178"+
		"\7D\2\2\u0178\u017a\3\2\2\2\u0179\u0176\3\2\2\2\u017a\u017d\3\2\2\2\u017b"+
		"\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017e\3\2\2\2\u017d\u017b\3\2"+
		"\2\2\u017e\u017f\5@!\2\u017f\u0180\5\u00ba^\2\u0180\u0182\3\2\2\2\u0181"+
		"\u0175\3\2\2\2\u0181\u017b\3\2\2\2\u0182?\3\2\2\2\u0183\u0184\79\2\2\u0184"+
		"\u0185\5\2\2\2\u0185A\3\2\2\2\u0186\u0187\78\2\2\u0187\u018e\5F$\2\u0188"+
		"\u0189\78\2\2\u0189\u018a\7\3\2\2\u018a\u018b\5D#\2\u018b\u018c\7A\2\2"+
		"\u018c\u018e\3\2\2\2\u018d\u0186\3\2\2\2\u018d\u0188\3\2\2\2\u018eC\3"+
		"\2\2\2\u018f\u019c\3\2\2\2\u0190\u0191\5F$\2\u0191\u0192\7D\2\2\u0192"+
		"\u0194\3\2\2\2\u0193\u0190\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2"+
		"\2\2\u0195\u0196\3\2\2\2\u0196\u0198\3\2\2\2\u0197\u0195\3\2\2\2\u0198"+
		"\u0199\5F$\2\u0199\u019a\5\u00ba^\2\u019a\u019c\3\2\2\2\u019b\u018f\3"+
		"\2\2\2\u019b\u0195\3\2\2\2\u019cE\3\2\2\2\u019d\u019e\58\35\2\u019e\u019f"+
		"\5H%\2\u019fG\3\2\2\2\u01a0\u01a8\5\2\2\2\u01a1\u01a2\5\2\2\2\u01a2\u01a3"+
		"\7\b\2\2\u01a3\u01a4\5:\36\2\u01a4\u01a8\3\2\2\2\u01a5\u01a6\7\b\2\2\u01a6"+
		"\u01a8\5:\36\2\u01a7\u01a0\3\2\2\2\u01a7\u01a1\3\2\2\2\u01a7\u01a5\3\2"+
		"\2\2\u01a8I\3\2\2\2\u01a9\u01aa\58\35\2\u01aa\u01ab\7\t\2\2\u01ab\u01ac"+
		"\5:\36\2\u01acK\3\2\2\2\u01ad\u01ae\7*\2\2\u01ae\u01af\5N(\2\u01af\u01b0"+
		"\5P)\2\u01b0\u01b6\3\2\2\2\u01b1\u01b2\7*\2\2\u01b2\u01b3\5N(\2\u01b3"+
		"\u01b4\5\32\16\2\u01b4\u01b6\3\2\2\2\u01b5\u01ad\3\2\2\2\u01b5\u01b1\3"+
		"\2\2\2\u01b6M\3\2\2\2\u01b7\u01b8\79\2\2\u01b8O\3\2\2\2\u01b9\u01ba\5"+
		"\32\16\2\u01ba\u01bb\5R*\2\u01bbQ\3\2\2\2\u01bc\u01bd\5&\24\2\u01bdS\3"+
		"\2\2\2\u01be\u01c5\5V,\2\u01bf\u01c5\5Z.\2\u01c0\u01c1\7\3\2\2\u01c1\u01c2"+
		"\5t;\2\u01c2\u01c3\7A\2\2\u01c3\u01c5\3\2\2\2\u01c4\u01be\3\2\2\2\u01c4"+
		"\u01bf\3\2\2\2\u01c4\u01c0\3\2\2\2\u01c5U\3\2\2\2\u01c6\u01c9\5X-\2\u01c7"+
		"\u01c9\5^\60\2\u01c8\u01c6\3\2\2\2\u01c8\u01c7\3\2\2\2\u01c9W\3\2\2\2"+
		"\u01ca\u01cb\t\2\2\2\u01cbY\3\2\2\2\u01cc\u01cf\79\2\2\u01cd\u01cf\5\\"+
		"/\2\u01ce\u01cc\3\2\2\2\u01ce\u01cd\3\2\2\2\u01cf[\3\2\2\2\u01d0\u01d1"+
		"\5\u00aeX\2\u01d1\u01d2\7\n\2\2\u01d2\u01d3\79\2\2\u01d3]\3\2\2\2\u01d4"+
		"\u01d5\5`\61\2\u01d5\u01d6\5b\62\2\u01d6_\3\2\2\2\u01d7\u01e0\5\20\t\2"+
		"\u01d8\u01e0\5\b\5\2\u01d9\u01da\7\4\2\2\u01da\u01db\7\13\2\2\u01db\u01dc"+
		"\7B\2\2\u01dc\u01e0\5\f\7\2\u01dd\u01e0\5\16\b\2\u01de\u01e0\5\4\3\2\u01df"+
		"\u01d7\3\2\2\2\u01df\u01d8\3\2\2\2\u01df\u01d9\3\2\2\2\u01df\u01dd\3\2"+
		"\2\2\u01df\u01de\3\2\2\2\u01e0a\3\2\2\2\u01e1\u01e2\7\5\2\2\u01e2\u01eb"+
		"\7C\2\2\u01e3\u01e4\7\5\2\2\u01e4\u01e6\5d\63\2\u01e5\u01e7\7\7\2\2\u01e6"+
		"\u01e5\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9\7C"+
		"\2\2\u01e9\u01eb\3\2\2\2\u01ea\u01e1\3\2\2\2\u01ea\u01e3\3\2\2\2\u01eb"+
		"c\3\2\2\2\u01ec\u01f1\5f\64\2\u01ed\u01ee\7\7\2\2\u01ee\u01f0\5f\64\2"+
		"\u01ef\u01ed\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2"+
		"\3\2\2\2\u01f2e\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4\u01f5\5h\65\2\u01f5"+
		"g\3\2\2\2\u01f6\u01f9\5t;\2\u01f7\u01f9\5b\62\2\u01f8\u01f6\3\2\2\2\u01f8"+
		"\u01f7\3\2\2\2\u01f9i\3\2\2\2\u01fa\u01fb\b\66\1\2\u01fb\u01fe\5T+\2\u01fc"+
		"\u01fe\5\u0080A\2\u01fd\u01fa\3\2\2\2\u01fd\u01fc\3\2\2\2\u01fe\u0209"+
		"\3\2\2\2\u01ff\u0200\f\6\2\2\u0200\u0208\5l\67\2\u0201\u0202\f\5\2\2\u0202"+
		"\u0208\5n8\2\u0203\u0204\f\4\2\2\u0204\u0208\5p9\2\u0205\u0206\f\3\2\2"+
		"\u0206\u0208\5r:\2\u0207\u01ff\3\2\2\2\u0207\u0201\3\2\2\2\u0207\u0203"+
		"\3\2\2\2\u0207\u0205\3\2\2\2\u0208\u020b\3\2\2\2\u0209\u0207\3\2\2\2\u0209"+
		"\u020a\3\2\2\2\u020ak\3\2\2\2\u020b\u0209\3\2\2\2\u020c\u020d\7\n\2\2"+
		"\u020d\u020e\79\2\2\u020em\3\2\2\2\u020f\u0210\7\4\2\2\u0210\u0211\5t"+
		";\2\u0211\u0212\7B\2\2\u0212o\3\2\2\2\u0213\u0215\7\4\2\2\u0214\u0216"+
		"\5t;\2\u0215\u0214\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0217\3\2\2\2\u0217"+
		"\u0219\7\f\2\2\u0218\u021a\5t;\2\u0219\u0218\3\2\2\2\u0219\u021a\3\2\2"+
		"\2\u021a\u021b\3\2\2\2\u021b\u0227\7B\2\2\u021c\u021e\7\4\2\2\u021d\u021f"+
		"\5t;\2\u021e\u021d\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0220\3\2\2\2\u0220"+
		"\u0221\7\f\2\2\u0221\u0222\5t;\2\u0222\u0223\7\f\2\2\u0223\u0224\5t;\2"+
		"\u0224\u0225\7B\2\2\u0225\u0227\3\2\2\2\u0226\u0213\3\2\2\2\u0226\u021c"+
		"\3\2\2\2\u0227q\3\2\2\2\u0228\u0229\7\3\2\2\u0229\u0232\7A\2\2\u022a\u022b"+
		"\7\3\2\2\u022b\u022d\5:\36\2\u022c\u022e\7\7\2\2\u022d\u022c\3\2\2\2\u022d"+
		"\u022e\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0230\7A\2\2\u0230\u0232\3\2"+
		"\2\2\u0231\u0228\3\2\2\2\u0231\u022a\3\2\2\2\u0232s\3\2\2\2\u0233\u0234"+
		"\b;\1\2\u0234\u0235\5v<\2\u0235\u024a\3\2\2\2\u0236\u0237\f\7\2\2\u0237"+
		"\u0238\5|?\2\u0238\u0239\5t;\b\u0239\u0249\3\2\2\2\u023a\u023b\f\6\2\2"+
		"\u023b\u023c\5z>\2\u023c\u023d\5t;\7\u023d\u0249\3\2\2\2\u023e\u023f\f"+
		"\5\2\2\u023f\u0240\5x=\2\u0240\u0241\5t;\6\u0241\u0249\3\2\2\2\u0242\u0243"+
		"\f\4\2\2\u0243\u0244\7\r\2\2\u0244\u0249\5t;\5\u0245\u0246\f\3\2\2\u0246"+
		"\u0247\7\16\2\2\u0247\u0249\5t;\4\u0248\u0236\3\2\2\2\u0248\u023a\3\2"+
		"\2\2\u0248\u023e\3\2\2\2\u0248\u0242\3\2\2\2\u0248\u0245\3\2\2\2\u0249"+
		"\u024c\3\2\2\2\u024a\u0248\3\2\2\2\u024a\u024b\3\2\2\2\u024bu\3\2\2\2"+
		"\u024c\u024a\3\2\2\2\u024d\u0252\5j\66\2\u024e\u024f\5~@\2\u024f\u0250"+
		"\5v<\2\u0250\u0252\3\2\2\2\u0251\u024d\3\2\2\2\u0251\u024e\3\2\2\2\u0252"+
		"w\3\2\2\2\u0253\u0254\t\3\2\2\u0254y\3\2\2\2\u0255\u0256\t\4\2\2\u0256"+
		"{\3\2\2\2\u0257\u0258\t\5\2\2\u0258}\3\2\2\2\u0259\u025a\t\6\2\2\u025a"+
		"\177\3\2\2\2\u025b\u025c\5\2\2\2\u025c\u025d\7\3\2\2\u025d\u025f\5t;\2"+
		"\u025e\u0260\7\7\2\2\u025f\u025e\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0261"+
		"\3\2\2\2\u0261\u0262\7A\2\2\u0262\u0081\3\2\2\2\u0263\u026e\5*\26\2\u0264"+
		"\u026e\5\u0088E\2\u0265\u026e\5\u0084C\2\u0266\u026e\5\u00a2R\2\u0267"+
		"\u026e\5\u00a4S\2\u0268\u026e\5\u00a6T\2\u0269\u026e\5\u00a8U\2\u026a"+
		"\u026e\5&\24\2\u026b\u026e\5\u0094K\2\u026c\u026e\5\u0098M\2\u026d\u0263"+
		"\3\2\2\2\u026d\u0264\3\2\2\2\u026d\u0265\3\2\2\2\u026d\u0266\3\2\2\2\u026d"+
		"\u0267\3\2\2\2\u026d\u0268\3\2\2\2\u026d\u0269\3\2\2\2\u026d\u026a\3\2"+
		"\2\2\u026d\u026b\3\2\2\2\u026d\u026c\3\2\2\2\u026e\u0083\3\2\2\2\u026f"+
		"\u0275\5\u0086D\2\u0270\u0275\5\u008cG\2\u0271\u0275\5\u008eH\2\u0272"+
		"\u0275\5\u0090I\2\u0273\u0275\5J&\2\u0274\u026f\3\2\2\2\u0274\u0270\3"+
		"\2\2\2\u0274\u0271\3\2\2\2\u0274\u0272\3\2\2\2\u0274\u0273\3\2\2\2\u0275"+
		"\u0085\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0087\3\2\2\2\u0278\u0279\5\u008a"+
		"F\2\u0279\u027a\7\f\2\2\u027a\u027b\5\u0082B\2\u027b\u0089\3\2\2\2\u027c"+
		"\u027d\79\2\2\u027d\u008b\3\2\2\2\u027e\u027f\5t;\2\u027f\u008d\3\2\2"+
		"\2\u0280\u0281\5t;\2\u0281\u0282\7?\2\2\u0282\u0287\3\2\2\2\u0283\u0284"+
		"\5t;\2\u0284\u0285\7@\2\2\u0285\u0287\3\2\2\2\u0286\u0280\3\2\2\2\u0286"+
		"\u0283\3\2\2\2\u0287\u008f\3\2\2\2\u0288\u0289\5:\36\2\u0289\u028a\5\u0092"+
		"J\2\u028a\u028b\5:\36\2\u028b\u0091\3\2\2\2\u028c\u0294\7\b\2\2\u028d"+
		"\u028e\5z>\2\u028e\u028f\7\b\2\2\u028f\u0294\3\2\2\2\u0290\u0291\5|?\2"+
		"\u0291\u0292\7\b\2\2\u0292\u0294\3\2\2\2\u0293\u028c\3\2\2\2\u0293\u028d"+
		"\3\2\2\2\u0293\u0290\3\2\2\2\u0294\u0093\3\2\2\2\u0295\u0296\7-\2\2\u0296"+
		"\u0297\5t;\2\u0297\u0298\5&\24\2\u0298\u0299\5\u0096L\2\u0299\u02a2\3"+
		"\2\2\2\u029a\u029b\7-\2\2\u029b\u029c\5\u0084C\2\u029c\u029d\7D\2\2\u029d"+
		"\u029e\5t;\2\u029e\u029f\5&\24\2\u029f\u02a0\5\u0096L\2\u02a0\u02a2\3"+
		"\2\2\2\u02a1\u0295\3\2\2\2\u02a1\u029a\3\2\2\2\u02a2\u0095\3\2\2\2\u02a3"+
		"\u02a9\3\2\2\2\u02a4\u02a5\7\'\2\2\u02a5\u02a9\5\u0094K\2\u02a6\u02a7"+
		"\7\'\2\2\u02a7\u02a9\5&\24\2\u02a8\u02a3\3\2\2\2\u02a8\u02a4\3\2\2\2\u02a8"+
		"\u02a6\3\2\2\2\u02a9\u0097\3\2\2\2\u02aa\u02ab\7)\2\2\u02ab\u02ac\5\u009a"+
		"N\2\u02ac\u02ad\5&\24\2\u02ad\u02b3\3\2\2\2\u02ae\u02af\7)\2\2\u02af\u02b0"+
		"\5\u009cO\2\u02b0\u02b1\5&\24\2\u02b1\u02b3\3\2\2\2\u02b2\u02aa\3\2\2"+
		"\2\u02b2\u02ae\3\2\2\2\u02b3\u0099\3\2\2\2\u02b4\u02b5\5t;\2\u02b5\u009b"+
		"\3\2\2\2\u02b6\u02b7\5\u009eP\2\u02b7\u02b9\7D\2\2\u02b8\u02ba\5\u009a"+
		"N\2\u02b9\u02b8\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb"+
		"\u02bc\7D\2\2\u02bc\u02bd\5\u00a0Q\2\u02bd\u009d\3\2\2\2\u02be\u02bf\5"+
		"\u0084C\2\u02bf\u009f\3\2\2\2\u02c0\u02c1\5\u0084C\2\u02c1\u00a1\3\2\2"+
		"\2\u02c2\u02c6\7\63\2\2\u02c3\u02c4\7\63\2\2\u02c4\u02c6\5:\36\2\u02c5"+
		"\u02c2\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c6\u00a3\3\2\2\2\u02c7\u02cb\7 "+
		"\2\2\u02c8\u02c9\7 \2\2\u02c9\u02cb\5\u008aF\2\u02ca\u02c7\3\2\2\2\u02ca"+
		"\u02c8\3\2\2\2\u02cb\u00a5\3\2\2\2\u02cc\u02d0\7$\2\2\u02cd\u02ce\7$\2"+
		"\2\u02ce\u02d0\5\u008aF\2\u02cf\u02cc\3\2\2\2\u02cf\u02cd\3\2\2\2\u02d0"+
		"\u00a7\3\2\2\2\u02d1\u02d2\7,\2\2\u02d2\u02d3\5\u008aF\2\u02d3\u00a9\3"+
		"\2\2\2\u02d4\u02d5\5\u00acW\2\u02d5\u02d6\7D\2\2\u02d6\u02d7\5\u00b0Y"+
		"\2\u02d7\u02d8\5,\27\2\u02d8\u00ab\3\2\2\2\u02d9\u02da\7\61\2\2\u02da"+
		"\u02db\5\u00aeX\2\u02db\u00ad\3\2\2\2\u02dc\u02dd\79\2\2\u02dd\u00af\3"+
		"\2\2\2\u02de\u02df\5\u00b2Z\2\u02df\u02e0\7D\2\2\u02e0\u02e2\3\2\2\2\u02e1"+
		"\u02de\3\2\2\2\u02e2\u02e5\3\2\2\2\u02e3\u02e1\3\2\2\2\u02e3\u02e4\3\2"+
		"\2\2\u02e4\u00b1\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e6\u02e7\7.\2\2\u02e7"+
		"\u02ee\5\u00b6\\\2\u02e8\u02e9\7.\2\2\u02e9\u02ea\7\3\2\2\u02ea\u02eb"+
		"\5\u00b4[\2\u02eb\u02ec\7A\2\2\u02ec\u02ee\3\2\2\2\u02ed\u02e6\3\2\2\2"+
		"\u02ed\u02e8\3\2\2\2\u02ee\u00b3\3\2\2\2\u02ef\u02fc\3\2\2\2\u02f0\u02f1"+
		"\5\u00b6\\\2\u02f1\u02f2\7D\2\2\u02f2\u02f4\3\2\2\2\u02f3\u02f0\3\2\2"+
		"\2\u02f4\u02f7\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f8"+
		"\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f8\u02f9\5\u00b6\\\2\u02f9\u02fa\5\u00ba"+
		"^\2\u02fa\u02fc\3\2\2\2\u02fb\u02ef\3\2\2\2\u02fb\u02f5\3\2\2\2\u02fc"+
		"\u00b5\3\2\2\2\u02fd\u02fe\5\u00b8]\2\u02fe\u00b7\3\2\2\2\u02ff\u0300"+
		"\7=\2\2\u0300\u00b9\3\2\2\2\u0301\u0304\6^\13\2\u0302\u0304\7D\2\2\u0303"+
		"\u0301\3\2\2\2\u0303\u0302\3\2\2\2\u0304\u00bb\3\2\2\2E\u00c2\u00ca\u00e4"+
		"\u00ea\u00f6\u00fd\u00ff\u0108\u010c\u011c\u0122\u0127\u012f\u0135\u0139"+
		"\u0142\u014a\u0150\u0154\u0157\u0161\u0169\u0173\u017b\u0181\u018d\u0195"+
		"\u019b\u01a7\u01b5\u01c4\u01c8\u01ce\u01df\u01e6\u01ea\u01f1\u01f8\u01fd"+
		"\u0207\u0209\u0215\u0219\u021e\u0226\u022d\u0231\u0248\u024a\u0251\u025f"+
		"\u026d\u0274\u0286\u0293\u02a1\u02a8\u02b2\u02b9\u02c5\u02ca\u02cf\u02e3"+
		"\u02ed\u02f5\u02fb\u0303";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}