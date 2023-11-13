package edu.hw5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.time.LocalDate;
import java.util.Optional;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task3Test {
    static Stream<Arguments> argumentsTest() {
        return Stream.of(
            Arguments.of(
                "2020-10-9",
                Optional.of(LocalDate.of(2020, 10, 9))
            ),
            Arguments.of(
                "1/3/2020",
                Optional.of(LocalDate.of(2020, 3, 1))
            )
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsTest")
    void test(String input, Optional<LocalDate> expected) {
        var actual = Task3.parseDate(input);

        assertEquals(expected, actual);
    }
}
