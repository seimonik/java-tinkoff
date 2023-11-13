package edu.hw5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task2Test {
    static Stream<Arguments> argumentsStreamGetAll() {
        return Stream.of(
            Arguments.of(
                1925,
                List.of(
                    LocalDate.of(1925, 2, 13),
                    LocalDate.of(1925, 3, 13),
                    LocalDate.of(1925, 11, 13)
                )
            ),
            Arguments.of(
                2024,
                List.of(
                    LocalDate.of(2024, 9, 13),
                    LocalDate.of(2024, 12, 13)
                )
            )
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStreamGetAll")
    void test(int input, List<LocalDate> expected) {

        List<LocalDate> actual = Task2.getAllFridayThirteens(input);

        assertEquals(expected, actual);
    }

    @Test
    void nextFri13test() {
        var date = LocalDate.now();
        var expected = LocalDate.of(2024, 9, 13);

        var actual = Task2.findNextFriday13(date);

        assertEquals(expected, actual);
    }
}
