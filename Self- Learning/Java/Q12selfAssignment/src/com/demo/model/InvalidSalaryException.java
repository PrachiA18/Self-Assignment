package com.demo.model;

// Unchecked Exception
public class InvalidSalaryException extends RuntimeException {

    public InvalidSalaryException(String message) {
        super(message);
    }
}
