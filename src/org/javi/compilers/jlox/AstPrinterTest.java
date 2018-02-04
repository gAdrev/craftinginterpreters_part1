package org.javi.compilers.jlox;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AstPrinterTest {

    @Test
    void testPrintLiteral() {
        Expr expr = new Expr.Literal(21);
        String exprRepr = new AstPrinter().print(expr);

        Assertions.assertEquals("21", exprRepr);
    }

    @Test
    void testPrintUnaryOpLiteral() {
        Expr expr = new Expr.Unary(new Token(TokenType.MINUS, "-", "", 0),
                new Expr.Literal("smokes"));
        String exprRepr = new AstPrinter().print(expr);

        Assertions.assertEquals("(- smokes)", exprRepr);
    }
}
