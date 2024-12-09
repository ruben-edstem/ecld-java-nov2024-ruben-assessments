package com.ruben.edabit.hard;

import java.util.Scanner;

public class CarryDigits {
    public static int carryDigits(int n1, int n2) {
        int carry = 0;
        int carryCount = 0;
        while (n1 > 0 || n2 > 0 || carry > 0) {
            int digit1 = n1 % 10;
            int digit2 = n2 % 10;
            if (digit1 + digit2 + carry > 9) {
                carry = 1;
                carryCount++;
            } else {
                carry = 0;
            }
            n1 /= 10;
            n2 /= 10;
        }

        return carryCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int i = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int j = scanner.nextInt();
        int result = carryDigits(i, j);
        System.out.println("Number of carry operations: " + result);
    }
}
