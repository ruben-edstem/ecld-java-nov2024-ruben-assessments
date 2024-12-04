package com.ruben.edabit.hard;

import java.util.Scanner;

public class SevenBoom {
    public static String sevenBoom(int[] arr) {
        for (int num : arr) {
            if (String.valueOf(num).contains("7")) {
                return "Boom!";
            }
        }
        return "There is no 7 in the array.";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(sevenBoom(arr));
    }
}
