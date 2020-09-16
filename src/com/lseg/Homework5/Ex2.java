package com.lseg.Homework5;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
    program();
    }

    private static void program () {
        int pos = 0;
        int neg = 0;
        int zero = 0;
        String opt = "";

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Give a number:");
            int number = scanner.nextInt();

            if (number == 0) {
                zero++;
            }
            if (number > 0) {
                pos++;
            }
            if (number < 0) {
                neg++;
            }
            System.out.println("Write 'Yes' if you want to continue or other character if not");
            opt = scanner.next();

        } while (opt.equals("Yes"));

        System.out.println("Nr elementelor pozitive este:" + pos);
        System.out.println("Nr elementelor negative este:" + neg);
        System.out.println("Nr elementelor egale cu zero este:" + zero);

         }
    }

