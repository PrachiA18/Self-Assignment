package com.demo.model;

public class Manager extends Employee {

    private double salary;
    private double bonus;

    public Manager(int empId, String name, double salary, double bonus) {
        super(empId, name);
        this.salary = salary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return salary + bonus;
    }
}