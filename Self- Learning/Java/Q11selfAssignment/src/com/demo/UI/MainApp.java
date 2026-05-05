package com.demo.UI;

import com.demo.service.EmployeeService;

public class MainApp {
    public static void main(String[] args) {

        EmployeeService service = new EmployeeService();
        service.sortEmployees();
    }
}