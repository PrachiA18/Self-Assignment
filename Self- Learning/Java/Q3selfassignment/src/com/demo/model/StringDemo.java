package com.demo.model;

public class StringDemo {

    public void showMethods() {


        String str = "Hello Java World";

    
        System.out.println("Length: " + str.length());

     
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

    
        System.out.println("Char at index 1: " + str.charAt(1));

 
        System.out.println("Substring (0-5): " + str.substring(0, 5));

   
        System.out.println("Contains 'Java': " + str.contains("Java"));

 
        System.out.println("Replace 'Java' with 'Python': " + str.replace("Java", "Python"));

 
        System.out.println("Index of 'Java': " + str.indexOf("Java"));

        String str2 = "hello java world";
        System.out.println("Equals: " + str.equals(str2));
        System.out.println("Equals Ignore Case: " + str.equalsIgnoreCase(str2));

        String str3 = "   Welcome   ";
        System.out.println("Trim: '" + str3.trim() + "'");


        String[] words = str.split(" ");
        System.out.println("Split words:");
        for (String w : words) {
            System.out.println(w);
        }

  
        String newStr = str.concat("!!!");
        System.out.println("Concatenated: " + newStr);

        System.out.println("Starts with Hello: " + str.startsWith("Hello"));
        System.out.println("Ends with World: " + str.endsWith("World"));
    }
}