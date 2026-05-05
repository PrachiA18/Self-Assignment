package com.demo.service;

import com.demo.model.Calculator;

public class CalculatorService {


    public void useAnonymousClass() {

        Calculator add = new Calculator() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };

        System.out.println("Addition (Anonymous): " + add.operate(10, 5));
    }

  
    public void useLambda() {

        Calculator multiply = (a, b) -> a * b;

        System.out.println("Multiplication (Lambda): " + multiply.operate(10, 5));
    }
}