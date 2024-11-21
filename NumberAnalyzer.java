package com.edste.ecld.task;

import java.util.Scanner;

public class NumberAnalyzer {
    public static void analyzeNumber(int num) {
        if(num>0){
            System.out.println("- Positive");
        }
        else{
            System.out.println("- Negative");
        }
        if(num%2==0){
            System.out.println("- Even");
        }
        else{
            System.out.println("- Odd");
        }
        if(num%5==0){
            System.out.println("- Multiple of 5");
        }
        else{
            System.out.println("- Not a multiple of 5");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberAnalyzer ob = new NumberAnalyzer();
        for(int i=1;i<=5;i++) {
            System.out.print("Enter number " + i + ": ");
            int num = scanner.nextInt();
            System.out.println("Number " + num + " is: ");
            ob.analyzeNumber(num);
        }
    }
}
