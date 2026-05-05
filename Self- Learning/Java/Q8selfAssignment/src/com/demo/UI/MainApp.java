package com.demo.UI;

import com.demo.service.CalculatorService;

public class MainApp {
    public static void main(String[] args) {

        CalculatorService service = new CalculatorService();

        service.useAnonymousClass();
        service.useLambda();
    }
}
