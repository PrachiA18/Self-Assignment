package com.demo.model;

public class Boxing {

   
    public Integer boxingExample(int num) {
        Integer obj = Integer.valueOf(num);  
        return obj;
    }


    public int unboxingExample(Integer obj) {
        int num = obj.intValue();  // manual unboxing
        return num;
    }


    public void autoExample() {
        int a = 10;

        Integer obj = a;   
        int b = obj;       

        System.out.println("Autoboxing value: " + obj);
        System.out.println("Auto-unboxing value: " + b);
    }
}