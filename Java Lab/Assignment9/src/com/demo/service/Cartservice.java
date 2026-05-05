package com.demo.service;

import com.demo.model.Product;
import java.util.*;

public class Cartservice {


    public static ArrayList<Product> products = new ArrayList<>();

    
    public static Map<String, List<Product>> cartMap = new HashMap<>();

 
    static {
        products.add(new Product(1, "Shoes", 3000, 10));
        products.add(new Product(2, "Shirt", 1500, 20));
        products.add(new Product(3, "Bag", 2000, 15));
        products.add(new Product(4, "Watch", 5000, 8));
        products.add(new Product(5, "Jeans", 2500, 12));
        products.add(new Product(6, "Cap", 500, 30));
        products.add(new Product(7, "Jacket", 4000, 6));
        products.add(new Product(8, "Socks", 200, 50));
        products.add(new Product(9, "Belt", 800, 25));
        products.add(new Product(10, "T-shirt", 1200, 18));
    }


    public static void displayProducts() {
        for (Product p : products) {
            System.out.println(p);
        }
    }


    public static void buyProduct(String username, int pid, int qty) {

        Product selected = null;

        for (Product p : products) {
            if (p.getId() == pid) {
                selected = p;
                break;
            }
        }

        if (selected == null) {
            System.out.println("Invalid product!");
            return;
        }

        double amount = selected.getPrice() * qty;
        System.out.println("Amount = ₹" + amount);

        Product cartItem = new Product(
                selected.getId(),
                selected.getName(),
                selected.getPrice(),
                qty
        );

        cartMap.putIfAbsent(username, new ArrayList<>());
        cartMap.get(username).add(cartItem);

        System.out.println("Added to cart.");
    }


    public static void displayUsers() {
        for (String user : cartMap.keySet()) {
            System.out.println(user);
        }
    }


    public static double displayBill(String username) {

        List<Product> list = cartMap.get(username);

        if (list == null) {
            System.out.println("User not found!");
            return 0;
        }

        double total = 0;

        for (Product p : list) {
            double amt = p.getPrice() * p.getQty();
            total += amt;
            System.out.println(p.getName() + " x " + p.getQty() + " = ₹" + amt);
        }

        System.out.println("Total = ₹" + total);
        return total;
    }

    public static void deliver(String username) {
        cartMap.remove(username);
        System.out.println("Order delivered successfully!");
    }
}