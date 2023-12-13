package edu.hw5;

public class Task8 {
    private Task8() {

    }

    // нечетной длины
    public static boolean isLengthOdd(String str) {
        return str.matches("^[01]([01]{2})*$");
    }

    // начинается с 0 и имеет нечетную длину, или начинается с 1 и имеет четную длину
    public static boolean startsWithZeroLengthEvenOrStartsWithOneLengthOdd(String str) {
        return str.matches("^0([01]{2})*$|^1[01]([01]{2})*$");
    }

    // количество 0 кратно 3
    public static boolean countOfZeroMultipleOfThree(String str) {
        return false;
    }

    // любая строка, кроме 11 или 111
    public static boolean notTwoOrThreeOnes(String str) {
        return str.matches("^(?!(11$|111$))[01]*$");
    }
}
