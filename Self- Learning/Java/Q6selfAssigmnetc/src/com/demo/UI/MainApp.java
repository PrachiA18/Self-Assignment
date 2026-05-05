package com.demo.UI;

import com.demo.model.*;
import com.demo.service.EmployeeService;

public class MainApp {
    public static void main(String[] args) {

        EmployeeService service = new EmployeeService();

        Employee e1 = new Manager(101, "Prachi", 50000, 10000);
        Employee e2 = new Developer(102, "Sejal", 8, 500);

        service.displayDetails(e1);
        service.displayDetails(e2);
    }
}