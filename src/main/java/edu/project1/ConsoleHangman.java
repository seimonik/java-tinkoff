package edu.project1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHangman {
    public void run() throws IOException {
        Session session = new Session();
        GuessResult result = GuessResult.START;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (result != GuessResult.WIN || result != GuessResult.LOSS){
            String input = br.readLine();
            result = session.guess(input.charAt(0));
        }

        System.out.println(result.getMessage());
    }
}
