package com.ruben.edabit.easy;

public class NoOfTrue {
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
        System.out.println(countTrue(new boolean[]{true, false, false, true, false}));  // Output: 2
        System.out.println(countTrue(new boolean[]{false, false, false, false}));      // Output: 0
        System.out.println(countTrue(new boolean[]{}));                                  // Output: 0
        System.out.println(countTrue(new boolean[]{true, true, true, true}));           // Output: 4
        System.out.println(countTrue(new boolean[]{false, true, false, true, true}));   // Output: 3
    }
}
