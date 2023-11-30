package edu.hw3;

public class Task1 {
    private Task1() {

    }

    public static String atbash(String line) {
        StringBuilder result = new StringBuilder();

        for (char symbol :
            line.toCharArray()) {
            if (symbol >= 'A' && symbol <= 'Z')
                result.append((char) ('Z' - symbol + 'A'));
            else if (symbol >= 'a' && symbol <= 'z')
                result.append((char) ('z' - symbol + 'a'));
            else
                result.append(symbol);
        }

        return result.toString();
    }
}
