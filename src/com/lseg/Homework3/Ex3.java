package com.lseg.Homework3;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        System.out.println(year(2021));
    }

    private static boolean year(int year){
        boolean result = false;
        if (year % 4 != 0) {
            System.out.println("The year is not a leap year.");
            result = false;
        } else if (year % 400 == 0) {
            System.out.println("The year is a leap year.");
            result = true;
        } else if (year % 100 == 0){
            System.out.println("The year is not a leap year.");
            result = false;
        } else {
            System.out.println("The year is a leap year");
            result = true;
        }
        return result;
    }
}
