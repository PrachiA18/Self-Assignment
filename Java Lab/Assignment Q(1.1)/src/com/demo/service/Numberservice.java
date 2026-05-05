package com.demo.service;

public class Numberservice {

    public boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) { // ✅ optimized
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public void printTable(int n) {
        System.out.println("Table of " + n);
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public void divideBy10(int n) {
        double result = n / 10.0;
        System.out.println(n + " is not prime. After division: " + result);
    }
}