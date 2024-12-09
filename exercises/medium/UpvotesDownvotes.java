package com.ruben.edabit.medium;

import java.util.Scanner;

public class UpvotesDownvotes {
    public static int getVoteCount(int i, int j) {
        return i - j;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Upvotes: ");
        int u = scanner.nextInt();
        System.out.print("Enter the number of downvotes: ");
        int d = scanner.nextInt();
        int netVotes = getVoteCount(u, d);
        System.out.println("Net vote count: " + netVotes);
    }
}

