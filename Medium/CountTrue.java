package com.ruben.edabit.medium;

import java.util.Scanner;

public class CountTrue {
    public static int countTrue(boolean[] arr) {
        int count = 0;
        for (boolean value : arr) {
            if (value) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        boolean[] arr = new boolean[n];
        System.out.println("Enter the boolean values (true or false):");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextBoolean();
        }
        int result = countTrue(arr);
        System.out.println("Number of true values: " + result);
    }
}
