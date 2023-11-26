package edu.project1;

public enum GuessResult {
    START,
    RIGHT("Да! Буква есть в слове!\n"),
    WRONG("Буквы НЕТ в слове!!!\n"),
    REPEAT("Вы уже предлагали эту букву\n"),
    LOSS("Вы проиграли..."),
    WIN("Вы выиграли! УРА!");

    private String message;

    GuessResult(String s) {
        this.message = s;
    }
    GuessResult() {}

    public String getMessage() {
        return this.message;
    }
}
