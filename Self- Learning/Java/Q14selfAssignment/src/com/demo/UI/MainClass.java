package com.demo.UI;

import java.util.Scanner;
import com.demo.model.WrapperList;

public class MainClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        WrapperList wl = new WrapperList();

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
                    wl.insert(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Enter value: ");
                    wl.delete(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Enter value: ");
                    wl.search(sc.nextInt());
                    break;

                case 4:
                    wl.display();
                    break;

                case 5:
                    wl.sort();
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
