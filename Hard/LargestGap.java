package com.ruben.edabit.hard;

import java.util.Arrays;
import java.util.Scanner;

public class LargestGap {
    public static int largestGap(int[] numbers,int n) {
        if (n < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }
        Arrays.sort(numbers);
        int maxGap = 0;
        for (int i = 1; i < numbers.length; i++) {
            int gap = numbers[i] - numbers[i - 1];
            if (gap > maxGap) {
                maxGap = gap;
            }
        }
        return maxGap;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        int result = largestGap(numbers,n);
        System.out.println("The largest gap is: " + result);

        scanner.close();
    }
}
