//Array of Multiples

package com.ruben.edabit.medium;

import java.util.Arrays;

public class ArrayMultiples {
    public static int[] arrayOfMultiples(int a, int b) {
        int[] arr = new int[b];
        for (int i = 0; i < b; i++) {
            arr[i] = a * (i + 1);
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayOfMultiples(7, 5)));  // [7, 14, 21, 28, 35]
        System.out.println(Arrays.toString(arrayOfMultiples(12, 10))); // [12, 24, 36, 48, 60, 72, 84, 96, 108, 120]
        System.out.println(Arrays.toString(arrayOfMultiples(17, 6)));  // [17, 34, 51, 68, 85, 102]
    }
}
