package com.demo.model;

public class DeadlockDemo {

    private final Object resource1 = new Object();
    private final Object resource2 = new Object();

    public void method1() {
        synchronized (resource1) {
            System.out.println("Thread-1 locked Resource 1");

            try { Thread.sleep(100); } catch (Exception e) {}

            synchronized (resource2) {
                System.out.println("Thread-1 locked Resource 2");
            }
        }
    }

    public void method2() {
        synchronized (resource2) {
            System.out.println("Thread-2 locked Resource 2");

            try { Thread.sleep(100); } catch (Exception e) {}

            synchronized (resource1) {
                System.out.println("Thread-2 locked Resource 1");
            }
        }
    }
}
