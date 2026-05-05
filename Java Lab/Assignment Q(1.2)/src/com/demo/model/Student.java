package com.demo.model;

public class Student {
    private int studId;
    private String name;
    private int m1, m2, m3;


    public Student(int studId, String name, int m1, int m2, int m3) {
        this.studId = studId;
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

  
    public void display() {
        System.out.println("\nStudent Details:");
        System.out.println("____________");
        System.out.println("Student Id: " + studId);
        System.out.println("Name: " + name);
        System.out.println("M1: " + m1);
        System.out.println("M2: " + m2);
        System.out.println("M3: " + m3);
    }
}
