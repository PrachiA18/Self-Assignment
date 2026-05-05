package com.demo.model;

public class Member {

    private static int counter = 1;

    private int id;
    private String name;
    private String mobile;
    private String email;
    private String membershipType;
    private double amount;

    public Member(String name, String mobile, String email,
                  String membershipType, double amount) {
        this.id = counter++;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.membershipType = membershipType;
        this.amount = amount;
    }

    public void display() {
        System.out.println("\nID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Mobile: " + mobile);
        System.out.println("Email: " + email);
        System.out.println("Membership Type: " + membershipType);
        System.out.println("Amount Paid: " + amount);
    }
}