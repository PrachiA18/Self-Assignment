package com.demo.service;

import com.demo.model.Student;
import java.util.*;
import java.io.*;

public class Studentservice {

    private static ArrayList<Student> list = new ArrayList<>();

   
    public static void addStudent(Student s) {
        list.add(s);
        System.out.println("Student Added!");
    }

   
    public static void writeToFile() {

        try {
            ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream("students.dat"));

            oos.writeObject(list);  

            oos.close();

            System.out.println("Data saved using ObjectOutputStream.");

        } catch (IOException e) {
            System.out.println("Error writing file");
        }
    }
}