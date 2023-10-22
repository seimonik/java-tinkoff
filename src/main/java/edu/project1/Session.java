package edu.project1;

import java.util.Arrays;

class Session {
    private final String answer;
    private final char[] userAnswer;
    private final int maxAttempts = 7;
    private int attempts;

    Session(char[] userAnswer, int attempts) {
        this.answer = Dictionary.randomWord();
        this.userAnswer = userAnswer;
        this.attempts = attempts;
    }

    GuessResult guess(char guess){
        if (attempts >= maxAttempts)
            return GuessResult.LOSS;

        if (Arrays.asList(userAnswer).contains(guess))
            return GuessResult.REPEAT;

        if (answer.contains(String.valueOf(guess)))
            return GuessResult.RIGHT;

        return GuessResult.WRONG;
    }
}
