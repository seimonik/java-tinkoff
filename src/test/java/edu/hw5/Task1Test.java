package edu.hw5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.time.Duration;
import java.util.List;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1Test {
    static Stream<Arguments> argumentsTest() {
        return Stream.of(
            Arguments.of(
                List.of("2022-03-12, 20:20 - 2022-03-12, 23:50", "2022-04-01, 21:30 - 2022-04-02, 01:20"),
                Duration.ofMinutes(220)
            ),
            Arguments.of(
                List.of("2022-03-12, 00:20 - 2022-03-13, 00:20"),
                Duration.ofHours(24)
            )
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsTest")
    void test(List<String> input, Duration expected) {
        edu.hw5.Task1 task1 = new Task1();

        Duration actual = task1.getAverageTime(input);

        assertEquals(expected, actual);
    }
}
