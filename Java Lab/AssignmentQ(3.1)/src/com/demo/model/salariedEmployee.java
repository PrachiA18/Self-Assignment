package com.demo.model;

public class salariedEmployee extends Employee {
    double basic;

    public salariedEmployee(String name, String mobile, String email,
                            String department, String designation, String doj,
                            double basic) {
        super(name, mobile, email, department, designation, doj);
        this.basic = basic;
    }

    public double calculateSalary() {
        double da = 0.10 * basic;
        double hra = 0.15 * basic;
        double pf = 0.12 * basic;
        return basic + da + hra - pf;
    }
}