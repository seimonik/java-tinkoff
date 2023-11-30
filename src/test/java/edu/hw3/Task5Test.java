package edu.hw3;

import edu.hw3.Task5.Contact;
import edu.hw3.Task5.Task5;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class Task5Test {
    static Stream<Arguments> contactManagerParameters() {
        return Stream.of(
            Arguments.of(
                List.of("John Locke", "Thomas Aquinas", "David Hume", "Rene Descartes"),
                "ASC",
                List.of(
                    new Contact("Thomas", "Aquinas"),
                    new Contact("Rene", "Descartes"),
                    new Contact("David", "Hume"),
                    new Contact("John", "Locke")
                )
            )
        );
    }
    @ParameterizedTest
    @MethodSource("contactManagerParameters")
    void testAscending(List<String> input, String order, List<Contact> expected) {
        ArrayList<Contact> result = Task5.parseContacts(input, order);

        assertEquals(expected, result);
    }
}
