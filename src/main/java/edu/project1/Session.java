package edu.project1;

import java.util.ArrayList;

class Session {
    private String answer;
    private ArrayList<Character> userAnswer = new ArrayList<>();
    private int maxAttempts = 7;
    private int failedAttempts = 0;

    Session(Dictionary dictionary) {
        this.answer = dictionary.randomWord();
    }

    GuessResult guess(char guess) {
        if (failedAttempts >= maxAttempts - 1)
            return GuessResult.LOSS;

        if (checkString(answer, userAnswer))
            return GuessResult.WIN;

        if (userAnswer.contains(guess))
            return GuessResult.REPEAT;

        userAnswer.add(guess);

        if (answer.contains(String.valueOf(guess))) {
            if (checkString(answer, userAnswer))
                return GuessResult.WIN;

            return GuessResult.RIGHT;
        }
        failedAttempts++;
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

    public int getFailedAttempts(){
        return failedAttempts;
    }

    public int getMaxAttempts(){
        return maxAttempts;
    }

    public String maskWord() {
        StringBuilder result = new StringBuilder();

        for (char symbol :
            answer.toCharArray()) {
            if (userAnswer.contains(symbol)) {
                result.append(symbol);
            } else {
                result.append('*');
            }
        }

        return result.toString();
    }
}
