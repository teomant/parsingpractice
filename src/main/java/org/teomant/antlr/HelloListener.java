// Generated from C:/projects/parsingpractice/src/main/java/antlr\Hello.g4 by ANTLR 4.7.2
package org.teomant.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(HelloParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(HelloParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryExpression}
	 * labeled alternative in {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpression(HelloParser.BinaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryExpression}
	 * labeled alternative in {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpression(HelloParser.BinaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpression(HelloParser.BoolExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpression(HelloParser.BoolExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(HelloParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(HelloParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpression(HelloParser.ParenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpression(HelloParser.ParenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(HelloParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(HelloParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#binary}.
	 * @param ctx the parse tree
	 */
	void enterBinary(HelloParser.BinaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#binary}.
	 * @param ctx the parse tree
	 */
	void exitBinary(HelloParser.BinaryContext ctx);
}