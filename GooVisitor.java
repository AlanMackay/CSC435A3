// Generated from Goo.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GooParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GooVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GooParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(GooParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(GooParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#typeLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeLit(GooParser.TypeLitContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(GooParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#arrayLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLength(GooParser.ArrayLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#elementType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementType(GooParser.ElementTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#sliceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSliceType(GooParser.SliceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#structType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructType(GooParser.StructTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#fieldDeclList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclList(GooParser.FieldDeclListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#fieldDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDecl(GooParser.FieldDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#pointerType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerType(GooParser.PointerTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#baseType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseType(GooParser.BaseTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignature(GooParser.SignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(GooParser.ResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(GooParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(GooParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#parameterDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDecl(GooParser.ParameterDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(GooParser.MethodNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(GooParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(GooParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(GooParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#topLevelDeclList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopLevelDeclList(GooParser.TopLevelDeclListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#topLevelDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopLevelDecl(GooParser.TopLevelDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#constDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDecl(GooParser.ConstDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#constSpecList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstSpecList(GooParser.ConstSpecListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#constSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstSpec(GooParser.ConstSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#constSpecRem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstSpecRem(GooParser.ConstSpecRemContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(GooParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(GooParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#typeDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDecl(GooParser.TypeDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#typeSpecList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecList(GooParser.TypeSpecListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#typeSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpec(GooParser.TypeSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(GooParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#varSpecList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarSpecList(GooParser.VarSpecListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#varSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarSpec(GooParser.VarSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#varSpecRem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarSpecRem(GooParser.VarSpecRemContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#shortVarDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortVarDecl(GooParser.ShortVarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#functionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecl(GooParser.FunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(GooParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(GooParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(GooParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(GooParser.OperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(GooParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#basicLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicLit(GooParser.BasicLitContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#operandName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperandName(GooParser.OperandNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#qualifiedIdent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedIdent(GooParser.QualifiedIdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#compositeLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompositeLit(GooParser.CompositeLitContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#literalType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralType(GooParser.LiteralTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#literalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralValue(GooParser.LiteralValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#elementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementList(GooParser.ElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(GooParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(GooParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpr(GooParser.PrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(GooParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(GooParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#slice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlice(GooParser.SliceContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(GooParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolExp}
	 * labeled alternative in {@link GooParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExp(GooParser.BoolExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnExp}
	 * labeled alternative in {@link GooParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnExp(GooParser.UnExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumExp}
	 * labeled alternative in {@link GooParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumExp(GooParser.NumExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelExp}
	 * labeled alternative in {@link GooParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelExp(GooParser.RelExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#unaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(GooParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#relOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelOp(GooParser.RelOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#addOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOp(GooParser.AddOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#mulOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulOp(GooParser.MulOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#unaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOp(GooParser.UnaryOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#conversion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConversion(GooParser.ConversionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(GooParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#simpleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStmt(GooParser.SimpleStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#emptyStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStmt(GooParser.EmptyStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#labeledStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStmt(GooParser.LabeledStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(GooParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#expressionStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStmt(GooParser.ExpressionStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#incDecStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncDecStmt(GooParser.IncDecStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(GooParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#assignOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignOp(GooParser.AssignOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(GooParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#elsePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsePart(GooParser.ElsePartContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#forStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(GooParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(GooParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#forClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForClause(GooParser.ForClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#initStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitStmt(GooParser.InitStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#postStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostStmt(GooParser.PostStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(GooParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#breakStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStmt(GooParser.BreakStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#continueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStmt(GooParser.ContinueStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#gotoStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGotoStmt(GooParser.GotoStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#sourceFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceFile(GooParser.SourceFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#packageClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageClause(GooParser.PackageClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#packageName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageName(GooParser.PackageNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#importDeclList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclList(GooParser.ImportDeclListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#importDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDecl(GooParser.ImportDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#importSpecList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportSpecList(GooParser.ImportSpecListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#importSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportSpec(GooParser.ImportSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#importPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportPath(GooParser.ImportPathContext ctx);
	/**
	 * Visit a parse tree produced by {@link GooParser#optSemi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptSemi(GooParser.OptSemiContext ctx);
}