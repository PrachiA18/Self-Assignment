package com.demo.model;

public class ElectricCar extends Car {

    public ElectricCar(String brand) {
        super(brand);
    }

    public void charge() {
        System.out.println(brand + " electric car is charging");
    }
}