package com.lao.exception_handling;

public class SumExample {
    public static int sum(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("An error occurred: " + e.getMessage());
            return 0;
        } finally {
            System.out.println("program calculation is done.");
        }
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 0; // Intentionally set to 0 to cause an ArithmeticException
        int result = sum(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
    }
}

