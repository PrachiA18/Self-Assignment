package com.demo.UI;

import com.demo.model.*;
import com.demo.service.VehicleServices;

public class MainApp {
    public static void main(String[] args) {

        VehicleServices service = new VehicleServices();

        Car c = new Car("Honda");
        ElectricCar ec = new ElectricCar("Tesla");
        Bike b = new Bike("Yamaha");

        service.showVehicle(c);
        service.showVehicle(ec);
        service.showVehicle(b);
    }
}