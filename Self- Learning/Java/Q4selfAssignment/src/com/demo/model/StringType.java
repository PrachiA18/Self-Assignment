package com.demo.model;

public class StringType {

    public void demonstrate() {


        String str = "Hello";
        str.concat(" World");   
        System.out.println("String (Immutable): " + str);

        str = str.concat(" World"); 
        System.out.println("After concat: " + str);

 
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println("\nStringBuffer: " + sb);

        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);

        sb.replace(6, 10, "C++");
        System.out.println("After replace: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);


        StringBuilder sbld = new StringBuilder("Hello");
        sbld.append(" World");
        System.out.println("\nStringBuilder: " + sbld);

        sbld.insert(5, " Java");
        System.out.println("After insert: " + sbld);

        sbld.delete(5, 10);
        System.out.println("After delete: " + sbld);

        sbld.reverse();
        System.out.println("After reverse: " + sbld);
    }
}