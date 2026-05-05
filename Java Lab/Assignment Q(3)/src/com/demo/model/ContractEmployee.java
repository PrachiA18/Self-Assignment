package com.demo.model;

import java.util.Date;

public class ContractEmployee extends Employee {

    private int hours;
    private double rate;

    public ContractEmployee(String name, String mobile, String email,
                            String department, String designation,
                            Date doj, int hours, double rate) {
        super(name, mobile, email, department, designation, doj);
        this.hours = hours;
        this.rate = rate;
    }

    public double calculateSalary() {
        return hours * rate;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Type: Contract Employee");
        System.out.println("Salary: " + calculateSalary());
    }
}