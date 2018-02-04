package org.javi.compilers.jlox;

abstract class Expr {
    static class Binary extends Expr {
        Binary(Expr left, Token operator, Expr right) {
            this.left = left;
            this.operator = operator;
            this.right = right;
        }

        private final Expr left;
        private final Expr right;
        private final Token operator;
    }


}
