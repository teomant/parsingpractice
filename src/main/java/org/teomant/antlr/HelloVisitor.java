// Generated from C:/projects/parsingpractice/src/main/java/antlr\Hello.g4 by ANTLR 4.7.2
package org.teomant.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HelloParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HelloVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HelloParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(HelloParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryExpression}
	 * labeled alternative in {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpression(HelloParser.BinaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpression(HelloParser.BoolExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpression(HelloParser.IdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpression(HelloParser.ParenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(HelloParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#binary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary(HelloParser.BinaryContext ctx);
}