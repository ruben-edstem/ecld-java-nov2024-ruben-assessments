package com.ruben.edabit.hard;

import java.util.Scanner;

public class LuckySeven {
    public static boolean luckySeven(int[] arr,int n) {
        if (n < 3) {
            return false;
        }
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 7) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        if (size < 3) {
            System.out.println("Array must have at least 3 numbers.");
            return;
        }
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        if (luckySeven(arr,size)) {
            System.out.println("Yes, it's possible to make 7 using three different numbers from thr array.");
        } else {
            System.out.println("No, it's not possible to make 7 using three different numbers  from thr array.");
        }
    }
}
