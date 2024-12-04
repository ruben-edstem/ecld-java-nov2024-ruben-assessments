package com.ruben.edabit.hard;

import java.util.Scanner;

public class ValidatePIN {
    public static boolean validate(String pin) {

        if(pin.length() != 4 && pin.length() != 6){
            return false;
        }
        for(int i = 0; i < pin.length(); i++){
            if(!Character.isDigit(pin.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter you pin : ");
        String pin=sc.next();
        System.out.println(validate(pin));

    }
}
