package edu.hw3;

import java.util.ArrayList;
import java.util.Stack;

public class Task2 {
    private Task2() {

    }

    public static ArrayList<String> clusterize(String input) {
        ArrayList<String> result = new ArrayList<>();
        Stack<Character> buffer = new Stack<>();
        StringBuilder clust = new StringBuilder();

        for (char elem :
            input.toCharArray()) {
            if (elem == '(')
                buffer.push(elem);

            if (elem == ')')
                buffer.pop();

            clust.append(elem);

            if (buffer.empty()){
                result.add(clust.toString());
                clust = new StringBuilder();
            }
        }

        return result;
    }
}
