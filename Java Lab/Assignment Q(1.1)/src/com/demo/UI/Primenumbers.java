package com.demo.UI;

import com.demo.service.Numberservice;

public class Primenumbers {

    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Please enter exactly 3 numbers");
            return;
        }   

        Numberservice service = new Numberservice();

        for (int i = 0; i < 3; i++) {
            try {
                int num = Integer.parseInt(args[i]);

                if (service.isPrime(num)) {
                    service.printTable(num);
                } else {
                    service.divideBy10(num);
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + args[i]);
            }

            System.out.println();
        }
    }
}