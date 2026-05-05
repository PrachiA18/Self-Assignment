package com.demo.model;

public class Car extends Vehicle {

    public Car(String brand) {
        super(brand);
    }

    public void drive() {
        System.out.println(brand + " car is driving");
    }
}