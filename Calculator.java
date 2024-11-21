package com.edste.ecld.task;

import java.util.Scanner;

public class Calculator {
    public static double add(double a, double b) {
        return a+b;
    }
    public static double subtract(double a, double b) {
        return a-b;
    }
    public static double multiply(double a, double b) {
        return a*b;
    }
    public static double divide(double a, double b) {
        return a/b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator ob = new Calculator();
        double res;
        System.out.print("Enter first number: ");
        double op1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double op2 = scanner.nextDouble();
        System.out.println( "Choose operation: \n" +
                            "1. Add (+)\n" +
                            "2. Subtract (-)\n" +
                            "3. Multiply (*)\n" +
                            "4. Divide (/)");
        System.out.print("Enter choice:");
        int i = scanner.nextInt();
        switch(i) {
            case 1:
                res = ob.add(op1,op2);
                System.out.println(op1+" + "+op2+" = "+res);
                break;
            case 2:
                res = ob.subtract(op1, op2);
                System.out.println(op1+" - "+op2+" = "+res);
                break;
            case 3:
                res = ob.multiply(op1, op2);
                System.out.println(op1+" * "+op2+" = "+res);
                break;
            case 4:
                if (op2 != 0) {
                    res = ob.divide(op1, op2);
                    System.out.println(op1+" / "+op2+" = "+res);
                    break;
                } else {
                    System.out.println("Undefined because denominator is zero");
                    break;
                }
            default:
                break;
        }
    }
}
