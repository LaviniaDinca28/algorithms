package com.lseg.Homework3;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Give a year:");
        int year = scan.nextInt();

        if (year % 4 != 0) {
            System.out.println("The year is not a leap year.");
        } else if (year % 400 == 0) {
            System.out.println("The year is a leap year.");
        } else if (year % 100 == 0){
            System.out.println("The year is not a leap year.");
        } else {
            System.out.println("The year is a leap year");
        }
    }
}
