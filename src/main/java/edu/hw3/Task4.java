package edu.hw3;

public class Task4 {
    public static String convertToRoman(int number){
        StringBuilder result = new StringBuilder();

        while (number >= 1000) {
            number -= 1000;
            result.append('M');
        }
        while (number >= 500){
            number -= 500;
            result.append('D');
        }
        while (number >= 100){
            number -= 100;
            result.append('C');
        }
        while (number >= 50){
            number -= 50;
            result.append('L');
        }
        while (number >= 10){
            number -= 10;
            result.append('X');
        }
        while (number >= 5){
            number -= 5;
            result.append('V');
        }
        while (number >= 1){
            number -= 1;
            result.append('I');
        }

        return result.toString();
    }
}
