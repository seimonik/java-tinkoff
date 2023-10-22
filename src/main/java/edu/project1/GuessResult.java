package edu.project1;

public enum GuessResult {
    RIGHT("Да! Буква есть в слове!\n"),
    WRONG("Буквы НЕТ в слове!!!\n"),
    REPEAT("Вы уже предлагали эту букву\n"),
    LOSS("Вы проиграли..."),
    WIN("Вы выиграли! УРА!");

    private final String message;

    GuessResult(String s) {
        this.message = s;
    }

    public String getMessage() {
        return this.message;
    }
}
