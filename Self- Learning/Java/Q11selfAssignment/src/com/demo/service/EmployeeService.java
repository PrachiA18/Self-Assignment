package com.demo.service;

import java.util.*;
import com.demo.model.Employee;

public class EmployeeService {

    public void sortEmployees() {

        List<Employee> list = new ArrayList<>();

        list.add(new Employee(101, "Prachi", 50000));
        list.add(new Employee(102, "Rahul", 40000));
        list.add(new Employee(103, "Amit", 60000));


        Collections.sort(list);
        System.out.println("Sorted by Salary (Comparable):");
        for (Employee e : list) {
            System.out.println(e);
        }

        Collections.sort(list, new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                return e1.getName().compareTo(e2.getName());
            }
        });

        System.out.println("\nSorted by Name (Comparator):");
        for (Employee e : list) {
            System.out.println(e);
        }


        Collections.sort(list, (e1, e2) -> e1.getEmpId() - e2.getEmpId());

        System.out.println("\nSorted by ID (Comparator - Lambda):");
        for (Employee e : list) {
            System.out.println(e);
        }
    }
}