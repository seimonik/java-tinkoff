package edu.project1;

import java.util.List;
import java.util.Random;

public class Dictionary {
    private static List<String> dictionary = List.of("piglet", "weather", "nicely", "hello", "irony", "only");

    public static String randomWord() {
        Random rnd = new Random();
        return dictionary.get(rnd.nextInt(dictionary.size()));
    }
}
