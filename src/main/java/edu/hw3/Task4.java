package edu.hw3;

public class Task4 {
    static final int M = 1_000;
    static final int D = 500;
    static final int C = 100;
    static final int L = 50;
    static final int X = 10;
    static final int V = 5;
    static final int I = 1;

    public static String convertToRoman(int number){
        StringBuilder result = new StringBuilder();

        while (number >= M) {
            number -= M;
            result.append('M');
        }
        while (number >= D){
            number -= D;
            result.append('D');
        }
        while (number >= C){
            number -= C;
            result.append('C');
        }
        while (number >= L){
            number -= L;
            result.append('L');
        }
        while (number >= X){
            number -= X;
            result.append('X');
        }
        while (number >= V){
            number -= V;
            result.append('V');
        }
        while (number >= I){
            number -= I;
            result.append('I');
        }

        return result.toString();
    }
}
