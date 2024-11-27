package com.ruben.edabit.hard;

import java.util.Arrays;
import java.util.Scanner;

public class NumberedCards {
    public static boolean winRound(int[] you, int[] opp) {
        Arrays.sort(you);
        Arrays.sort(opp);
        int Score1 = (you[4] * 10) + you[3];
        int Score2 = (opp[4] * 10) + opp[3];
        return Score1 > Score2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] yourCards = new int[5];
        int[] opponentCards = new int[5];
        System.out.println("Enter your 5 cards (numbers between 0 and 9): ");
        for (int i = 0; i < 5; i++) {
            yourCards[i] = scanner.nextInt();
        }
        System.out.println("Enter opponent's 5 cards (numbers between 0 and 9): ");
        for (int i = 0; i < 5; i++) {
            opponentCards[i] = scanner.nextInt();
        }
        if (winRound(yourCards, opponentCards)) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose or it's a tie.");
        }
    }
}
