package com.ruben.edabit.medium;

public class WarofNumbers {
    public static int warOfNumbers(int[]numbers){
        int oSum=0,eSum=0;
        for (int num : numbers) {
            if(num%2==0) {
                eSum+=num;
            }
            else {
                oSum+=num;
            }
        }
        if(eSum>oSum) {
            return eSum-oSum;
        }
        else {
            return oSum-eSum;
        }
    }

    public static void main(String[] args) {
        System.out.println(warOfNumbers(new int[]{2, 8, 7, 5})); // Output: 2
        System.out.println(warOfNumbers(new int[]{12, 90, 75})); // Output: 27
        System.out.println(warOfNumbers(new int[]{5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243})); // Output: 168
    }
}
