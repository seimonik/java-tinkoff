package edu.hw5;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Task1 {

    public Duration getAverageTime(List<String> dates) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd, HH:mm");

        return dates.stream()
            .map(date -> date.split(" - "))
            .map(date -> new LocalDateTime[] {
                LocalDateTime.parse(date[0], dateTimeFormatter),
                LocalDateTime.parse(date[1], dateTimeFormatter)})
            .map(date -> Duration.between(date[0], date[1]))
            .reduce(Duration.ZERO, Duration::plus)
            .dividedBy(dates.size());
    }
}
