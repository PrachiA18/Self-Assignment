package com.demo.model;

public class Member {
    private static int counter = 5000;

    public int id;
    public String name, mobile, email, type;
    public double amountPaid;

    public Member(String name, String mobile, String email,
                  String type, double amountPaid) {
        this.id = ++counter;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.type = type;
        this.amountPaid = amountPaid;
    }

    public void display() {
        System.out.println(id + " " + name + " " + type);
    }
}
