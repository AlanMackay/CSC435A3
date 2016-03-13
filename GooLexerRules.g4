lexer grammar GooLexerRules;

// The Java code below is embedded in the generated Lexer/Parser
// to implement a Go language feature whereby semicolons can be
// often be omitted at the ends of lines. The missing semicolons
// are inserted as and when needed.
//
// Omitted semicolons before ')' and '}' are NOT inserted by this
// code. (I don't know how to handle this feature easily.)

@lexer::header {
import java.util.*;
}

@lexer::members {
    protected int prevTokenType = Token.INVALID_TYPE;

    // These are the token types such that if one appears as the last
    // token on a line, a semicolon is inserted right afterwards.
    protected HashSet<Integer> lastTokens = new HashSet<Integer>() {{
        add(GooParser.Identifier);      add(GooParser.IntLit);
        add(GooParser.FloatLit);        add(GooParser.RuneLit);
        add(GooParser.StringLit);       add(GooParser.BREAK);
        add(GooParser.CONTINUE);        add(GooParser.FALLTHROUGH);
        add(GooParser.RETURN);          add(GooParser.PLUSPLUS);
        add(GooParser.MINUSMINUS);      add(GooParser.RPAREN);
        add(GooParser.RSQ);             add(GooParser.RBRACE);
    }};

	@Override
	public Token emit() {
		if (_type == GooParser.NL) {
            // we have a newline (NL) token
			if (lastTokens.contains(prevTokenType)) {
                // convert that NL token into a semicolon token
				_type = GooParser.SEMI;
				_text = ";";
			    prevTokenType = Token.INVALID_TYPE;
                //System.out.println(_tokenStartLine + ":" +
                //    _tokenStartCharPositionInLine + ": inserted semicolon");
			} else {
                // skip NL tokens
                //int cnt = 0;
                while(true) {
                    _type = nextToken().getType();
                //    cnt++;
                    if (_type != GooParser.NL) break;
                    super.emit();
                }
                prevTokenType = _type;
                if (_type < 0)
                    return emitEOF();
                //System.out.println(_tokenStartLine + ":" + _tokenStartCharPositionInLine +
                //    ": skipped " + cnt + "*NL" + ", next token = " + _SYMBOLIC_NAMES[_type]);
            }
		} else {
            // not a NL token, remember what kind it was
			prevTokenType = _type;
		}
		return super.emit();
	}

	@Override
	public Token nextToken() {
		if (_hitEOF && prevTokenType == GooParser.RBRACE) {
		    // insert a semicolon if last line ends with a right brace (i.e. NL is missing)
			_type = GooParser.SEMI;
			_text = ";";
			prevTokenType = Token.INVALID_TYPE;
			return super.emit();
		}
		return super.nextToken();
	}
}


//--------------- Lexer definitions follow -----------------

// All the keywords listed in the Go Language Specification
BREAK:      'break';
CASE:       'case';
CHAN:       'chan';
CONST:      'const';
CONTINUE:   'continue';
DEFAULT:    'default';
DEFER:      'defer';
ELSE:       'else';
FALLTHROUGH: 'fallthrough';
FOR:        'for';
FUNC:       'func';
GO:         'go';
GOTO:       'goto';
IF:         'if';
IMPORT:     'import';
INTERFACE:  'interface';
MAP:        'map';
PACKAGE:    'package';
RANGE:      'range';
RETURN:     'return';
SELECT:     'select';
STRUCT:     'struct';
SWITCH:     'switch';
TYPE:       'type';
VAR:        'var';


Identifier
        :       Letter LetterOrDigit*
        ;

ImaginaryLit
        :   IntLit 'i'
        |   FloatLit 'i'
        ;

IntLit
        :   [1-9] Digit*
        |   '0' ('x'|'X') [0-9a-fA-F]+
        |   '0' [0-7]*
        ;

FloatLit
        :   Digit+ FloatLitTail
        |   '.' Digit+ Exponent?
        ;

fragment
Digit
        :       [0-9]
        ;

fragment
FloatLitTail
        :   '.' Digit* Exponent?
        |   Exponent
        ;

fragment
Exponent
        :   ('e'|'E') ('+'|'-')? Digit+
        ;


fragment
Letter
	:	[a-zA-Z_] // _ and letters below 0xFF
	|	// covers all characters above 0xFF which are not a surrogate
		~[\u0000-\u00FF\uD800-\uDBFF]
		{Character.isJavaIdentifierStart(_input.LA(-1))}?
	|	// covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
		[\uD800-\uDBFF] [\uDC00-\uDFFF]
		{Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
	;

fragment
LetterOrDigit
	:	[a-zA-Z0-9_] // _ and letters or digits below 0xFF
	|	// covers all characters above 0xFF which are not a surrogate
		~[\u0000-\u00FF\uD800-\uDBFF]
		{Character.isJavaIdentifierPart(_input.LA(-1))}?
	|	// covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
		[\uD800-\uDBFF] [\uDC00-\uDFFF]
		{Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
	;

StringLit
        :   '"' SChar* '"'
        ;

RuneLit
        :   '\'' CChar '\''
        ;

// Names are given to only those operators and special
// symbols referenced by the rule for semicolon insertion
PLUSPLUS:   '++' ;
MINUSMINUS: '--' ;
RPAREN:     ')' ;
RSQ:        ']' ;
RBRACE:     '}' ;
SEMI:       ';' ;

fragment
SChar
        :   ~["\\\r\n]
        |   '\\' ["abfnrtv\\]
        ;

fragment
CChar
        :   ~['\\\r\n]
        |   '\\' ['abfnrtv\\]
        ;

Whitespace
        :   [ \t\u000C]+
            -> skip
        ;

LineComment
        :   '//' ~[\r\n]*
            -> skip
        ;

// The following rules support 3 kinds of line endings:
//    \n   \r\n   and   \r
// By writing the first two rules in this particular manner, the \r\n
// combination gets processed as a single line ending and not as two.
NL
        :   (   '\r' '\n'?
            |   '\n'
            |   BlockNLComment
            )
        ;

// Must be defined before BlockNLComment
BlockComment
        :   '/*' ~[\r\n]* '*/'
            -> skip
        ;

// A comment which contains one or more newlines -- needs to be distinguished
// from other /*...*/ comments to support semicolon insertion logic
BlockNLComment
        :   '/*' .*? '*/'
        ;
