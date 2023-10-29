package edu.hw3;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task2Test {
    @Test
    void clusterizeTest1() {
        ArrayList<String> expected = new ArrayList<>(List.of("()", "()", "()"));

        ArrayList<String> result = Task2.clusterize("()()()");

        assertEquals(expected, result);
    }

    @Test
    void clusterizeTest2() {
        ArrayList<String> expected = new ArrayList<>(List.of("((()))", "(())", "()", "()", "(()())"));

        ArrayList<String> result = Task2.clusterize("((()))(())()()(()())");

        assertEquals(expected, result);
    }
}
