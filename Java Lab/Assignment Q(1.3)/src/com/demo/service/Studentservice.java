package com.demo.service;

import java.util.Scanner;
import com.demo.model.Student;

public class Studentservice {

    // Accept multiple students
    public Student[] acceptStudents(Scanner sc, int n) {
        Student[] arr = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter id:");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter name:");
            String name = sc.nextLine();

            System.out.println("Enter marks:");
            int m1 = sc.nextInt();
            int m2 = sc.nextInt();
            int m3 = sc.nextInt();

            arr[i] = new Student(id, name, m1, m2, m3);
        }
        return arr;
    }

    
    public void displayAll(Student[] arr) {
        for (Student s : arr) {
            s.display();
        }
    }


    public Student searchById(Student[] arr, int id) {
        for (Student s : arr) {
            if (s.getId() == id)
                return s;
        }
        return null;
    }

    public Student searchByName(Student[] arr, String name) {
        for (Student s : arr) {
            if (s.getName().equalsIgnoreCase(name))
                return s;
        }
        return null;
    }
}