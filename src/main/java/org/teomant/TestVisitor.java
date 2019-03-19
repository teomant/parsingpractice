package org.teomant;

import org.teomant.antlr.HelloBaseVisitor;
import org.teomant.antlr.HelloParser;

public class TestVisitor extends HelloBaseVisitor {
    @Override
    public Object visitParse(HelloParser.ParseContext ctx) {
        return super.visit(ctx.expression());
    }

    @Override
    public Object visitBinaryExpression(HelloParser.BinaryExpressionContext ctx) {
        if (ctx.op.AND() != null) {
            return asBoolean(ctx.left) && asBoolean(ctx.right);
        }
        else if (ctx.op.OR() != null) {
            return asBoolean(ctx.left) || asBoolean(ctx.right);
        }
        throw new RuntimeException("not implemented: binary operator " + ctx.op.getText());
    }

    @Override
    public Object visitBoolExpression(HelloParser.BoolExpressionContext ctx) {
        return visit(ctx.bool());
    }

    @Override
    public Object visitBool(HelloParser.BoolContext ctx) {
        return Boolean.parseBoolean(ctx.getText());
    }

    private boolean asBoolean(HelloParser.ExpressionContext ctx) {
        return (boolean)visit(ctx);
    }

    @Override
    public Object visitIdentifierExpression(HelloParser.IdentifierExpressionContext ctx) {
        return Boolean.parseBoolean(ctx.getText());
    }

    @Override
    public Object visitParenExpression(HelloParser.ParenExpressionContext ctx) {
        return super.visit(ctx.expression());
    }
}
