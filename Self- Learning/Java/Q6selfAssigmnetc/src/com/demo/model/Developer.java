package com.demo.model;

public class Developer extends Employee {

    private int hours;
    private double rate;

    public Developer(int empId, String name, int hours, double rate) {
        super(empId, name);
        this.hours = hours;
        this.rate = rate;
    }

    @Override
    public double calculateSalary() {
        return hours * rate;
    }
}