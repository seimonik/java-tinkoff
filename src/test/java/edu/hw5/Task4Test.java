package edu.hw5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task4Test {
    static Stream<Arguments> argumentsStream() {
        return Stream.of(
            Arguments.of("password", false),
            Arguments.of("password&", true),
            Arguments.of("@@!!", true),
            Arguments.of("123456789", false),
            Arguments.of("21432gdf&&&", true)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void test(String input, boolean expected) {

        boolean actual = Task4.isPasswordValid(input);

        assertEquals(expected, actual);
    }
}
