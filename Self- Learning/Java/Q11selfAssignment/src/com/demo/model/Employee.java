package com.demo.model;

public class Employee implements Comparable<Employee> {

    private int empId;
    private String name;
    private double salary;

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    // Getters
    public int getEmpId() { return empId; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    // Comparable → sort by salary
    @Override
    public int compareTo(Employee e) {
        return Double.compare(this.salary, e.salary);
    }

    @Override
    public String toString() {
        return empId + " " + name + " " + salary;
    }
}
