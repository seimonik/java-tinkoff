package edu.project1;

import java.util.ArrayList;
import java.util.Arrays;

class Session {
    private String answer;
    private ArrayList<Character> userAnswer;
    private int maxAttempts = 7;
    private int attempts = 0;

    Session() {
        this.answer = Dictionary.randomWord();
    }

    GuessResult guess(char guess){
        if (attempts >= maxAttempts)
            return GuessResult.LOSS;
        attempts++;

        if (checkString(answer, userAnswer))
            return GuessResult.WIN;

        if (userAnswer.contains(guess))
            return GuessResult.REPEAT;

        userAnswer.add(guess);

        if (answer.contains(String.valueOf(guess)))
            return GuessResult.RIGHT;

        return GuessResult.WRONG;
    }

    public static boolean checkString(String str, ArrayList<Character> list) {
        for (int i = 0; i < str.length(); i++) {
            if (!list.contains(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
