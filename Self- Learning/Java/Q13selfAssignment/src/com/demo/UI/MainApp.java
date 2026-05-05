package com.demo.UI;

import com.demo.model.DateManipulator;
import java.time.LocalDate;

public class MainApp {
    public static void main(String[] args) {

        DateManipulator dm = new DateManipulator();


        String s1 = "01-01-2024";
        String s2 = "10-01-2024";


        LocalDate d1 = dm.stringToDate(s1);
        LocalDate d2 = dm.stringToDate(s2);


        System.out.println("Date1: " + dm.dateToString(d1));
        System.out.println("Date2: " + dm.dateToString(d2));

 
        long days = dm.daysBetween(d1, d2);
        System.out.println("Days between: " + days);
    }
}
