package com.demo.model;

import java.util.Date;

public class SalariedEmployee extends Employee {

    private double basic;

    public SalariedEmployee(String name, String mobile, String email,
                             String department, String designation,
                             Date doj, double basic) {
        super(name, mobile, email, department, designation, doj);
        this.basic = basic;
    }

    public double calculateNetSalary() {
        double da = 0.10 * basic;
        double hra = 0.15 * basic;
        double pf = 0.12 * basic;

        return basic + da + hra - pf;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Type: Salaried Employee");
        System.out.println("Net Salary: " + calculateNetSalary());
    }
}