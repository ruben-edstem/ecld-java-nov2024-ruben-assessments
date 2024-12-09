package com.ruben.edabit.hard;

import java.util.Scanner;

public class AlternateSign {
    public static boolean alternateSign(int[] arr,int n) {
        if (n == 0) return false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) return false;
            if (i > 0 && (arr[i] > 0 && arr[i - 1] > 0 || arr[i] < 0 && arr[i - 1] < 0)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        boolean result = alternateSign(arr,size);
        if(result){
            System.out.println("The array alternate between positive and negative");
        }
        else{
            System.out.println("The array does not alternate between positive and negative");
        }
    }
}
