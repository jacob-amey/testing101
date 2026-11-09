package edu.secourse;

public class Calculator {
    public static double add(double a, double b) {
        return a + b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    // Creating and Implementing the method sqrt

    public static double sqrt(double a){
        if (a < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        }
        return Math.sqrt(a);
    }

    // Creating the overloading method for add and multiply

    public static int add(int a, int b){
        return a + b;
    }

    public static int multiply(int a, int b){
        return a * b;
    }

    // Creating and implementing the method divide

    public static double divide(double a, double b){
        if (b == 0){
            throw new IllegalArgumentException("Cannot divide by zero");
        } else {
            return a / b;
        }
    }
}
