package com.ruben.edabit.medium;

public class PerfectSquarePatch {
    public static int[][] squarePatch(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = n;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] mat1 = squarePatch(3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println();
        }

        int[][] mat2 = squarePatch(3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mat2[i][j] + " ");
            }
            System.out.println();
        }

        int[][] mat3 = squarePatch(5);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(mat3[i][j] + " ");
            }
            System.out.println();
        }

        int[][] mat4 = squarePatch(8);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(mat4[i][j] + " ");
            }
            System.out.println();
        }
    }
}
