package com.demo.ui;

import java.util.Scanner;
import com.demo.model.Student;
import com.demo.service.Studentservice;

public class studentmain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

     
        Studentservice service = new Studentservice();

        System.out.println("Enter number of students:");
        int n = sc.nextInt();

        Student[] arr = service.acceptStudents(sc, n);

        int choice;

        do {
            System.out.println("\n1. Display All");
            System.out.println("2. Search by ID");
            System.out.println("3. Search by Name");
            System.out.println("4. Calculate GPA");
            System.out.println("5. Exit");

            System.out.println("Enter choice:");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    service.displayAll(arr);
                    break;

                case 2:
                    System.out.println("Enter ID:");
                    int id = sc.nextInt();

                    Student s1 = service.searchById(arr, id);
                    if (s1 != null)
                        s1.display();
                    else
                        System.out.println("Student not found");
                    break;

                case 3:
                    System.out.println("Enter Name:");
                    sc.nextLine();
                    String name = sc.nextLine();

                    Student s2 = service.searchByName(arr, name);
                    if (s2 != null)
                        s2.display();
                    else
                        System.out.println("Student not found");
                    break;

                case 4:
                    System.out.println("Enter ID:");
                    int gid = sc.nextInt();

                    Student s3 = service.searchById(arr, gid);
                    if (s3 != null)
                        System.out.println("GPA: " + s3.calculateGPA());
                    else
                        System.out.println("Student not found");
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);

        sc.close();
    }
}