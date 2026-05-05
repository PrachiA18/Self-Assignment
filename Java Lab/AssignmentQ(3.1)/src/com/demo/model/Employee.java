package com.demo.model;

public abstract class Employee {
    public int id;
    public String name;
	protected String mobile;
	protected String email;
	public String department;
	public String designation;
	protected String doj;

    private static int counter = 1000;

    public Employee(String name, String mobile, String email,
                    String department, String designation, String doj) {
        this.id = ++counter;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.department = department;
        this.designation = designation;
        this.doj = doj;
    }

    public abstract double calculateSalary();

    public void display() {
        System.out.println(id + " " + name + " " + designation);
    }
}