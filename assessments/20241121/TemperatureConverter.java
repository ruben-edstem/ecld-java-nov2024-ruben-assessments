package com.edste.ecld.task;

import java.util.Scanner;

public class TemperatureConverter {
    public static boolean isValidCelsius(double celsius) {
        return celsius >= -273.15;
    }

    public static boolean isValidFahrenheit(double fahrenheit) {
        return fahrenheit >= -459.67;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return ((celsius * 9) / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double res;
        TemperatureConverter ob = new TemperatureConverter();
        while (true) {
            System.out.println("1. Convert Celsius to Fahrenheit");
            System.out.println("2. Convert Fahrenheit to Celsius");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");
            int i = scanner.nextInt();

            switch(i) {
                case 1:
                    try {
                        System.out.print("Enter temperature in Celsius: ");
                        double celsius = scanner.nextDouble();
                        if (isValidCelsius(celsius)) {
                            res = ob.celsiusToFahrenheit(celsius);
                            System.out.println(celsius + "°C = " + String.format("%.2f", res) + "°F");
                        } else {
                            System.out.println("Invalid Celsius temperature. Please enter a value >= -273.15°C.");
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input. Please enter a valid number for Celsius.");
                        scanner.next();
                    }
                    break;

                case 2:
                    try {
                        System.out.print("Enter temperature in Fahrenheit: ");
                        double fahrenheit = scanner.nextDouble();
                        if (isValidFahrenheit(fahrenheit)) {
                            res = ob.fahrenheitToCelsius(fahrenheit);
                            System.out.println(fahrenheit + "°F = " + String.format("%.2f", res) + "°C");
                        } else {
                            System.out.println("Invalid Fahrenheit temperature. Please enter a value >= -459.67°F.");
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input. Please enter a valid number for Fahrenheit.");
                        scanner.next();
                    }
                    break;

                case 3:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please choose 1, 2, or 3.");
                    break;
            }
        }
    }
}
