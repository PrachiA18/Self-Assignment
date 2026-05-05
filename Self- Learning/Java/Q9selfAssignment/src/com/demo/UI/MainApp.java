package com.demo.UI;

import com.demo.model.Datemanipulator;
import java.time.LocalDate;

public class MainApp {
    public static void main(String[] args) {

        Datemanipulator dm = new Datemanipulator();

      
        LocalDate date1 = dm.stringToDate("01-01-2024");
        LocalDate date2 = dm.stringToDate("10-01-2024");


        System.out.println("Date1: " + dm.dateToString(date1));
        System.out.println("Date2: " + dm.dateToString(date2));


        long days = dm.daysBetween(date1, date2);
        System.out.println("Days between: " + days);
    }
}
