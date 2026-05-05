package com.demo.UI;

import com.demo.model.InvalidAgeException;
import com.demo.model.InvalidSalaryException;

public class MainApp {

 
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        } else {
            System.out.println("Valid Age");
        }
    }

    static void checkSalary(double salary) {
        if (salary < 10000) {
            throw new InvalidSalaryException("Salary must be >= 10000");
        } else {
            System.out.println("Valid Salary");
        }
    }

    public static void main(String[] args) {

        try {
            checkAge(16);   
        } catch (InvalidAgeException e) {
            System.out.println("Checked Exception: " + e.getMessage());
        }

        try {
            checkSalary(5000);  
        } catch (InvalidSalaryException e) {
            System.out.println("Unchecked Exception: " + e.getMessage());
        }
    }
}