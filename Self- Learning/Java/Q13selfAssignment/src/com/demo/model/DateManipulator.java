package com.demo.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateManipulator {

   
    private static final DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("dd-MM-yyyy");

   
    public LocalDate stringToDate(String dateStr) {
        return LocalDate.parse(dateStr, formatter);
    }


    public String dateToString(LocalDate date) {
        return date.format(formatter);
    }


    public long daysBetween(LocalDate d1, LocalDate d2) {
        return ChronoUnit.DAYS.between(d1, d2);
    }
}
