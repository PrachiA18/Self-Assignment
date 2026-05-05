package com.demo.model;

public class Bike extends Vehicle {

    public Bike(String brand) {
        super(brand);
    }

    public void ride() {
        System.out.println(brand + " bike is riding");
    }
}