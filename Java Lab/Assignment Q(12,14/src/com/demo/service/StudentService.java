package com.demo.service;

import com.demo.model.Student;
import java.util.*;
import java.io.*;

public class StudentService {

    public static ArrayList<Student> list = new ArrayList<>();

   
    public static void readFromFile() {

        try {
            ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream("students.dat"));

            list = (ArrayList<Student>) ois.readObject();  // type casting

            ois.close();

            System.out.println("Data loaded successfully.");

        } catch (Exception e) {
            System.out.println("Error reading file");
        }
    }


    public static void displayAll() {
        for (Student s : list) {
            System.out.println(s);
        }
    }
}