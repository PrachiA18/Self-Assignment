package com.demo.service;

import com.demo.model.*;

public class VehicleServices {

    public void showVehicle(Vehicle v) {

        v.start();

        if (v instanceof Car) {
            ((Car) v).drive();
        }

        if (v instanceof ElectricCar) {
            ((ElectricCar) v).charge();
        }

        if (v instanceof Bike) {
            ((Bike) v).ride();
        }

        System.out.println("----------------------");
    }
}
