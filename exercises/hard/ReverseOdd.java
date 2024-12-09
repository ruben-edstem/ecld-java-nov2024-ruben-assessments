package com.ruben.edabit.hard;

import java.util.Scanner;

public class ReverseOdd {
    public static String reverseOddWords(String input) {
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (word.length() % 2 == 1) {
                result.append(new StringBuilder(word).reverse().toString());
            } else {
                result.append(word);
            }
            result.append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String result = reverseOddWords(input);
        System.out.println("Result: " + result);
    }
}
