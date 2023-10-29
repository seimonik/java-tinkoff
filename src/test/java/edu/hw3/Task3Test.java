package edu.hw3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task3Test {
    static Arguments[] simpleTestParams() {
        return new Arguments[] {
            Arguments.of(
                List.of("a", "bb", "a", "bb"),
                Map.of(
                    "bb", 2,
                    "a", 2
                )
            ),
            Arguments.of(
                List.of("this", "and", "that", "and"),
                Map.of(
                    "this", 1,
                    "that", 1,
                    "and", 2
                )
            ),
            Arguments.of(
                List.of("код", "код", "код", "bug"),
                Map.of(
                    "код", 3,
                    "bug", 1
                )
            ),
            Arguments.of(
                List.of(1, 1, 2, 2),
                Map.of(
                    1, 2,
                    2, 2
                )
            )
        };
    }

    @ParameterizedTest
    @MethodSource("simpleTestParams") <T>
    void freqDictTest(Collection<T> arr, Map<T, Integer> res) {
        assertEquals(Task3.freqDict(new ArrayList<>(arr)), res);
    }
}
