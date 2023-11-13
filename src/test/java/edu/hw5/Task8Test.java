package edu.hw5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task8Test {
    @ParameterizedTest
    @CsvSource({
        "111, true",
        "01, false",
        "10111, true"
    })
    void firstRegexTest(String input, boolean expected) {
        boolean actual = Task8.isLengthOdd(input);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
        "1111, true",
        "111, false",
        "01, false",
        "01111, true"
    })
    void secondRegexTest(String input, boolean expected) {
        boolean actual = Task8.startsWithZeroLengthEvenOrStartsWithOneLengthOdd(input);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
        "1111, true",
        "111, false",
        "11, false",
        "0111, true"
    })
    void fourthRegexTest(String input, boolean expected) {
        boolean actual = Task8.notTwoOrThreeOnes(input);

        assertEquals(expected, actual);
    }
}
