package com.ruben.edabit.hard;

import java.util.Scanner;

public class IntegerDigits {
    public static int count(int n) {
        n = Math.abs(n);
        if (n < 10) {
            return 1;
        }
        return 1 + count(n / 10);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int result = count(number);
        System.out.println("The number of digits in " + number + " is: " + result);
        scanner.close();
    }
}
