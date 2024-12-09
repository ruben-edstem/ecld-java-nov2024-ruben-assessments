package com.edste.ecld.task;

import java.util.Scanner;

public class Calculator {
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator ob = new Calculator();
        double res;
        String choice;
        do {
            System.out.print("Enter first number: ");
            double op1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double op2 = scanner.nextDouble();
            System.out.println("""
                    Choose operation:\s
                    1. Add (+)
                    2. Subtract (-)
                    3. Multiply (*)
                    4. Divide (/)""");
            System.out.print("Enter operation you wish to perform: ");
            String option = scanner.next();
            switch (option) {
                case "add":
                case "ADD":
                    res = ob.add(op1, op2);
                    System.out.println(op1 + " + " + op2 + " = " + res);
                    break;
                case "subtract":
                case "SUBTRACT":
                    res = ob.subtract(op1, op2);
                    System.out.println(op1 + " - " + op2 + " = " + res);
                    break;
                case "multiply":
                case "MULTIPLY":
                    res = ob.multiply(op1, op2);
                    System.out.println(op1 + " * " + op2 + " = " + res);
                    break;
                case "divide":
                case "DIVIDE":
                    if (op2 == 0) {
                        System.out.println("Undefined because denominator is zero");
                        break;
                    } else {
                        res = ob.divide(op1, op2);
                        System.out.println(op1 + " / " + op2 + " = " + res);
                        break;
                    }
                default:
                    break;
            }
            System.out.print("Do you wish to perform another calculation? (yes/no): ");
            choice = scanner.next();
        }while(choice.equals("yes"));
    }
}
