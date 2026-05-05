package com.demo.Test;

public class FriendTest {

    private int id;
    private String name;
    private String lname;
    private String[] hobbies;
    private String mobile;
    private String email;
    public FriendTest(int id, String name, String lname, String[] hobbies,
                  String mobile, String email, String bdate, String address) {
        this.id = id;
        this.name = name;
        this.lname = lname;
        this.hobbies = hobbies;
        this.mobile = mobile;
        this.email = email;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String[] getHobbies() { return hobbies; }

    public void display() {
        System.out.println(id + " " + name + " " + lname + " " + mobile + " " + email);

        System.out.print("Hobbies: ");
        for (String h : hobbies) {
            System.out.print(h + " ");
        }

        System.out.println("\n-------------------");
    }
}