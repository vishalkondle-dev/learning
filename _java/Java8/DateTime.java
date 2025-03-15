package _java.Java8;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {

        // Date and Time
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate - " + localDate);
        LocalTime localTime = LocalTime.now();
        System.out.println("localTime - " + localTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime - " + localDateTime);
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime - " + zonedDateTime);

        ZoneOffset zoneOffset = ZoneOffset.UTC;
        ZonedDateTime utc = ZonedDateTime.now(zoneOffset);
        System.out.println("utc - " + utc);

        // Comparisons
        Instant instant = Instant.now(); // Duration from 1970-01-01T00:00:00Z
        System.out.println("instant - " + instant);
        System.out.println("duration btw now and utc " + Duration.between(localDateTime, utc)); // Time
        System.out.println("duration btw now and utc " + Period.between(localDate, localDate)); // Date

        // Formatting
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-YYYY");
        String formattedDate = localDate.format(formatter);
        System.out.println("formattedDate - " + formattedDate);

    }
}
