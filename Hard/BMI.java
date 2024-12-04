package com.ruben.edabit.hard;

import java.util.Scanner;

public class BMI {
    public static String calculateBMI(double w, String w1, double h, String h1) {
        if (w1.equalsIgnoreCase("pounds")) {
            w *= 0.453592;
        }
        if (h1.equalsIgnoreCase("inches")) {
            h *= 0.0254;
        }
        double bmi = w / (h * h);
        String category;
        if (bmi < 18.5) {
            category = "Underweight";
        } else if (bmi < 25) {
            category = "Normal weight";
        } else if (bmi < 30) {
            category = "Overweight";
        } else {
            category = "Obesity";
        }
        return String.format("%.1f %s", bmi, category);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight (e.g., 70 kilos or 154 pounds): ");
        double w = scanner.nextDouble();
        String w1 = scanner.next();
        System.out.print("Enter height (e.g., 1.75 meters or 70 inches): ");
        double h = scanner.nextDouble();
        String h1 = scanner.next();
        String result = calculateBMI(w, w1, h, h1);
        System.out.println("BMI and Category: " + result);
    }
}
