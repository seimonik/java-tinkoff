package edu.hw3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Task4Test {
    @ParameterizedTest
    @CsvSource({"2, II", "12, XII", "16, XVI"})
    void convertToRomanTest(int input, String expected) {
        String result = Task4.convertToRoman(input);

        Assertions.assertEquals(expected, result);
    }
}
