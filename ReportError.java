// ReportError.java
//
// Handles display of warning and error messages

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class ReportError {
    private static int errorCount = 0;
    private static int warningCount = 0;

	// The first argument provides a reference to a parse tree
	// context from which line & column numbers are obtained.
    public static void error( ParserRuleContext ctx, String msg ) {
		printLocation(ctx);
        error(msg);
    }

    public static void error( int line, int col, String msg ) {
		printLocation(line, col);
        error(msg);
    }

    public static void error( String msg ) {
        System.out.println(msg);
        errorCount++;
    }

	// The first argument provides a reference to a parse tree
	// context from which line & column numbers are obtained.
    public static void warning( ParserRuleContext ctx, String msg ) {
		printLocation(ctx);
        warning(msg);
    }

    public static void warning( String msg ) {
        System.out.println(msg);
        warningCount++;
    }

	private static void printLocation( ParserRuleContext ctx ) {
    	if (ctx == null)
    		return;
    	// we have a choice of start or stop here (the beginning of the text
    	// for the syntactic construct or the end of the text) ... the
    	// beginning may not always be the most appropriate position.
    	CommonToken pos = (CommonToken)(ctx.start);
		printLocation(pos.getLine(), pos.getCharPositionInLine());
	}

	private static void printLocation( int line, int col ) {
		System.out.print("line " + line + ":");
		if (col > 0)
			System.out.print(col + " ");
	}

    public static int getErrorCount() { return errorCount; }

    public static int getWarningCount() { return warningCount; }

}