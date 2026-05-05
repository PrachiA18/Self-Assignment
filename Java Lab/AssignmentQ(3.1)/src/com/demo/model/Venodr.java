package com.demo.model;

public class Venodr extends Employee {
    int noOfEmployees;
    double amount;

    public Venodr(String name, String mobile, String email,
                  String department, String designation, String doj,
                  int noOfEmployees, double amount) {
        super(name, mobile, email, department, designation, doj);
        this.noOfEmployees = noOfEmployees;
        this.amount = amount;
    }

    public double calculateSalary() {
        return amount + (amount * 0.18);
    }
}
