package com.demo.service;

import com.demo.model.Employee;

public class EmployeeService {

    public void displayDetails(Employee e) {
        System.out.println("Employee Id: " + e.getEmpId());
        System.out.println("Name: " + e.getName());
        System.out.println("Salary: " + e.calculateSalary());
        System.out.println("-----------------------");
    }
}
