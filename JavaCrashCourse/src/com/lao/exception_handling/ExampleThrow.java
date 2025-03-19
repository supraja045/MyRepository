package com.lao.exception_handling;

public class ExampleThrow {
	    public void validateAge(int age) {
	        if (age < 0) {
	            throw new IllegalArgumentException("Age cannot be negative");
	        } else if (age > 120) {
	            throw new IllegalArgumentException("Invalid age: " + age);
	        } else {
	            System.out.println("Age is valid: " + age);
	        }
	    }

	    public static void main(String[] args) {
	    	ExampleThrow validator = new ExampleThrow();
	        try {
	            validator.validateAge(125);
	        } catch (IllegalArgumentException e) {
	        	e.printStackTrace();
	        	e.getMessage();
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	}

