package edu.project1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHangman {
    public void run() throws IOException {
        Dictionary dict = new InMemoryDictionary();
        Session session = new Session(dict);
        GuessResult result = GuessResult.START;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (result != GuessResult.WIN && result != GuessResult.LOSS) {
            System.out.println("> The word: " + session.maskWord());

            System.out.println("> Guess a letter");

            System.out.print("< ");
            String input = br.readLine();

            result = session.guess(input.charAt(0));

            if (result == GuessResult.WRONG) {
                System.out.println(
                    "> Missed, mistake " + session.getFailedAttempts() + " out of " + session.getMaxAttempts());
            } else {
                System.out.println(result.getMessage());
            }
        }
    }
}
