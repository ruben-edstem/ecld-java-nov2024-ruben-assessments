//Consecutive Numbers

package edabit.java.ruben;

import java.util.Arrays;

public class ConsecutiveNumbers {
    public static boolean cons(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean val;
        System.out.println(cons((new int[]{5, 1, 4, 3, 2}))); //true
        System.out.println(cons((new int[]{55, 59, 58, 56, 57}))); //true
        System.out.println(cons((new int[]{-3, -2, -1, 1, 0}))); //true
        System.out.println(cons((new int[]{5, 1, 4, 3, 2, 8}))); //false
        System.out.println(cons((new int[]{5, 6, 7, 8, 9, 9}))); //false
        System.out.println(cons((new int[]{5, 3}))); //false
    }
}

