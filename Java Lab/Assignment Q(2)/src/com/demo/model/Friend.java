package com.demo.model;



public class Friend {
    private int id;
    private String name;
    private String lastname;
    private String[] hobbies;
    private String mobno;
    private String email;
    private String bdate;
    private String address;

    public Friend(int id, String name, String lastname, String[] hobbies,
                  String mobno, String email, String bdate, String address) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.hobbies = hobbies;
        this.mobno = mobno;
        this.email = email;
        this.bdate = bdate;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name + " " + lastname);

        System.out.print("Hobbies: ");
        for (String h : hobbies) {
            System.out.print(h + " ");
        }

        System.out.println("\nMobile: " + mobno);
        System.out.println("Email: " + email);
        System.out.println("Birthdate: " + bdate);
        System.out.println("Address: " + address);
        System.out.println("-------------------------");
    }
}