package edu.hw2.Task1;

public sealed interface Expr {
    double evaluate();

    public record Constant(double number) implements Expr {
        @Override
        public double evaluate() {
            return number;
        }
    }
    public record Negate(double number) implements Expr {
        public Negate(Expr expr) {
            this(expr.evaluate());
        }

        @Override
        public double evaluate() {
            return -number;
        }
    }
    public record Exponent(double number, int pow) implements Expr {
        public Exponent(Expr expr, int pow) {
            this(expr.evaluate(), pow);
        }

        @Override
        public double evaluate() {
            double result = Math.pow(number, pow);

            return result;
        }
    }
    public record Addition(double number1, double number2) implements Expr {
        public Addition(Expr expr1, Expr expr2) {
            this(expr1.evaluate(), expr2.evaluate());
        }

        @Override
        public double evaluate() {
            return number1 + number2;
        }
    }
    public record Multiplication(double number1, double number2) implements Expr {
        public Multiplication(Expr expr1, Expr expr2) {
            this(expr1.evaluate(), expr2.evaluate());
        }

        @Override
        public double evaluate() {
            return number1 * number2;
        }
    }
}
