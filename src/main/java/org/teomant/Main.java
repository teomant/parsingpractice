package org.teomant;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.teomant.antlr.HelloLexer;
import org.teomant.antlr.HelloParser;

public class Main {

    public static void main(String[] args) {
        HelloLexer lexer = new HelloLexer(CharStreams.fromString("false AND (true OR true)"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HelloParser parser = new HelloParser(tokens);
        Object result = new TestVisitor().visit(parser.parse());
        System.out.println(result);
    }
}
