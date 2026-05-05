package com.demo.model;

public class WrapperMethod {

    public void showMethods1() {

       
        Integer i = Integer.valueOf("123");   // String → Integer
        System.out.println("Integer value: " + i);
        System.out.println("Max value: " + Integer.MAX_VALUE);
        System.out.println("Binary: " + Integer.toBinaryString(i));

   
        Double d = Double.valueOf("45.67");
        System.out.println("\nDouble value: " + d);
        System.out.println("Is NaN: " + Double.isNaN(d));
        System.out.println("Is Infinite: " + Double.isInfinite(d));

        char ch = 'A';
        System.out.println("\nCharacter: " + ch);
        System.out.println("Is Digit: " + Character.isDigit(ch));
        System.out.println("Is Letter: " + Character.isLetter(ch));
        System.out.println("To Lowercase: " + Character.toLowerCase(ch));

    
        Boolean b = Boolean.valueOf("true");
        System.out.println("\nBoolean value: " + b);


        int num = i.intValue();   // Integer → int
        double num2 = d.doubleValue(); // Double → double

        System.out.println("\nConverted int: " + num);
        System.out.println("Converted double: " + num2);


        System.out.println("\nCompare Integers: " + Integer.compare(10, 20));
        System.out.println("Compare Doubles: " + Double.compare(5.5, 2.2));
    }

	public void showMethods() {
		// TODO Auto-generated method stub
		
	}
}
