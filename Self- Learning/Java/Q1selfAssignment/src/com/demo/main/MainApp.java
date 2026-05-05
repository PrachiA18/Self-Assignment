package com.demo.main;

import com.demo.model.Boxing;

public class MainApp {
    public static void main(String[] args) {

        Boxing obj = new Boxing();

     
        Integer boxed = obj.boxingExample(25);
        System.out.println("Boxed value: " + boxed);


        int unboxed = obj.unboxingExample(boxed);
        System.out.println("Unboxed value: " + unboxed);

  
        obj.autoExample();
    }
}