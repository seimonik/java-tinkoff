package edu.project1;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SampleTest {
    @Test
    void test1() {
        Dictionary dict = new InMemoryDictionary();
        dict.setDictionary(List.of("один"));
        Session session = new Session(dict);

        GuessResult result = GuessResult.START;
        char[] input = new char[] {'о', 'н', 'о', 'д', 'и'};
        for (char symbol:
             input) {
            result = session.guess(symbol);
        }

        assertThat(result).isEqualTo(GuessResult.WIN);
    }

    @Test
    void test2() {
        Dictionary dict = new InMemoryDictionary();
        dict.setDictionary(List.of("один"));
        Session session = new Session(dict);

        GuessResult result = GuessResult.START;
        char[] input = new char[] {'о', 'ы', 'о', 'р', 'и', 'х', 'п', 'й', 'м', 'у'};
        for (char symbol:
            input) {
            result = session.guess(symbol);
        }

        assertThat(result).isEqualTo(GuessResult.LOSS);
    }
}
