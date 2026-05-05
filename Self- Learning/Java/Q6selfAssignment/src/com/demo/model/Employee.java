package com.demo.model;

public class Employee {

 
    private int empId;
    private String name;
    private double salary;


    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

  
    public void display() {
        System.out.println("Employee Id: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}