package com.lseg.homework3;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        //1.  Write a function called convertToKilometersPerHour(double milesPerHour) that would return the
        //converted value of speed from mile/hour into km/hour. The function definition should be:
        //static double convertToKilometersPerHour(double milesPerHour);

        Scanner s = new Scanner(System.in);
        System.out.print("Give the distance in miles:");
        double milesPerHour = s.nextDouble();
        double kmPerHour = 0;

        System.out.println(milesPerHour + " miles = " + convertToKilometersPerHour(milesPerHour) + " km");


    }
        private static double convertToKilometersPerHour(double milesPerHour) {
        return milesPerHour * 1.60934;
    }



}



