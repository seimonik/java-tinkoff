package edu.hw5;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;

public class Task2 {

    private Task2() {
    }

    private static final int THIRTEEN = 13;
    private static final int MONTHS_COUNT = 12;

    public static List<LocalDate> getAllFridayThirteens(int year) {
        List<LocalDate> result = new ArrayList<>();

        for (int month = 1; month <= MONTHS_COUNT; month++) {
            LocalDate day = LocalDate.of(year, month, THIRTEEN);

            if (day.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
                result.add(day);
            }
        }

        return result;
    }

    public static LocalDate findNextFriday13(LocalDate date) {
        LocalDate nextFriday13 = date.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));

        while (nextFriday13.getDayOfMonth() != THIRTEEN) {
            nextFriday13 = nextFriday13.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        }

        return nextFriday13;
    }
}
