package com.demo.UI;

import java.util.Scanner;

import com.demo.model.WrapperListService;


public class MainApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        WrapperListService service = new WrapperListService();

        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Display");
            System.out.println("5. Sort");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    service.insert(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Enter value: ");
                    service.delete(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Enter value: ");
                    service.search(sc.nextInt());
                    break;

                case 4:
                    service.iterate();
                    break;

                case 5:
                    service.sort();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}