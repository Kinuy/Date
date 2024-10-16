package org.example;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        /*
        Step 1: Write code to output the current date and time.

        Step 2: Add a timespan of 2 weeks to the current date and output the new date.

        Step 3: Compare the current date with a specified future date and output whether the current date is before or after the specified date.

        Step 4: Calculate the difference in days between two arbitrary dates and output the result.
        */
        //Task1
        Instant now = Instant.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.printf("Date and time today: %s\n",dateTime);

        // Task2
        LocalDateTime inTwoWeeks = dateTime.plusWeeks(2);
        System.out.printf("In two weeks: %s",inTwoWeeks);



        LocalDate date1 = LocalDate.of(2023, 10, 1);
        LocalDate date2 = LocalDate.of(2024, 2, 15);

        //Task3
        LocalDate dateToday = LocalDate.now();
        LocalDate datePastFuture = LocalDate.of(2026, 2, 15);

        long daysBetween = ChronoUnit.DAYS.between(dateToday, datePastFuture);
        if(daysBetween<0){
            System.out.println("\nPast");
        }
        else{
            System.out.println("\nFuture");
        }
//        System.out.println("\nDifference in days: " + daysBetween);

        //Task4
        LocalDateTime dateTime1  =LocalDateTime.of(2023,10,3,6,2,1);
        LocalDateTime dateTime2  =LocalDateTime.of(2023,11,3,6,2,1);

        long daysBetween2 = ChronoUnit.DAYS.between(dateTime1, dateTime2);

        System.out.println("\nDifference in days: " + daysBetween2);



    }
}