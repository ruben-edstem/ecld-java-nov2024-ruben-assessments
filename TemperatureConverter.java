package com.edste.ecld.task;

import java.util.Scanner;

public class TemperatureConverter {
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit =((celsius*9)/5)+32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit-32)/1.8;
        return celsius;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double res;
        TemperatureConverter ob = new TemperatureConverter();
        System.out.println("1. Convert Celsius to Fahrenheit\n" +
                           "2. Convert Fahrenheit to Celsius\n" +
                           "3. Exit");
        System.out.print("Choose option: ");
        int i = scanner.nextInt();
        switch(i){
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                res = ob.celsiusToFahrenheit(celsius);
                System.out.println(celsius + "°C =  " + String.format("%.2f",res) +"°F");
                break;
            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                res = ob.fahrenheitToCelsius(fahrenheit);
                System.out.println(fahrenheit + "°F =  " + String.format("%.2f",res) +"°C");
                break;
            default:
                break;
        }
    }
}
