package com.demo.main;

import com.demo.model.Employee;

public class MainApp {
    public static void main(String[] args) {

        Employee e = new Employee();

        e.setEmpId(101);
        e.setName("Divya");
        e.setSalary(50000);

        System.out.println("Employee Id: " + e.getEmpId());
        System.out.println("Name: " + e.getName());
        System.out.println("Salary: " + e.getSalary());
    }
}