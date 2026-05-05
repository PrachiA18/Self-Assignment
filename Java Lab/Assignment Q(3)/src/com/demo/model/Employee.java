package com.demo.model;

import java.util.Date;

public class Employee {

    private static int counter = 1;

    protected int id;
    protected String name;
    protected String mobile;
    protected String email;
    protected String department;
    protected String designation;
    protected Date doj;

    public Employee(String name, String mobile, String email,
                    String department, String designation, Date doj) {
        this.id = counter++;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.department = department;
        this.designation = designation;
        this.doj = doj;
    }

    public int getId() {
        return id;
    }

    public void display() {
        System.out.println("\nID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Mobile: " + mobile);
        System.out.println("Email: " + email);
        System.out.println("Department: " + department);
        System.out.println("Designation: " + designation);
        System.out.println("DOJ: " + doj);
    }
}