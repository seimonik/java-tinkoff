package edu.hw2;

import edu.hw2.Task1.Expr;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class Task1Test {
    @Test
    void ConstantTest() {
        var expected = 7;

        var result = new Expr.Constant(7);

        Assertions.assertEquals(expected, result.evaluate());
    }

    @Test
    void NegateTest(){
        var expected = -7;

        var result = new Expr.Negate(7);

        Assertions.assertEquals(expected, result.evaluate());
    }

    @Test
    void ExponentTest(){
        var expected = 128;

        var result = new Expr.Exponent(2,7);

        Assertions.assertEquals(expected, result.evaluate());
    }

    @Test
    void AdditionTest(){
        var expected = 15;

        var result = new Expr.Addition(7, 8);

        Assertions.assertEquals(expected, result.evaluate());
    }

    @Test
    void MultiplicationTest(){
        var expected = 56;

        var result = new Expr.Multiplication(7, 8);

        Assertions.assertEquals(expected, result.evaluate());
    }
}
