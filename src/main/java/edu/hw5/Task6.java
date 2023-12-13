package edu.hw5;

public final class Task6 {
    private Task6() { }

    public static boolean isSubstring(String text, String str) {
        return str.matches(".*" + text + ".*");
    }
}
