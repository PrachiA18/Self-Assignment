
package com.demo.service;

import java.util.Scanner;
import com.demo.model.Student;

public class StudentService {

    public Student acceptStudent(Scanner sc) {
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter M1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter M2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter M3: ");
        int m3 = sc.nextInt();

        return new Student(id, name, m1, m2, m3);
    }
}
