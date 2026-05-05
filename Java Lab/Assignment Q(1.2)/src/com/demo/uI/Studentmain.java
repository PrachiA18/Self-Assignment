package com.demo.uI;

import java.util.Scanner;
import com.demo.model.Student;
import com.demo.service.StudentService;

public class Studentmain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        Student s1 = service.acceptStudent(sc);
        Student s2 = service.acceptStudent(sc);

        s1.display();
        s2.display();

        sc.close();
    }
}