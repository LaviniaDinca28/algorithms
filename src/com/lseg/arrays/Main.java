package com.lseg.arrays;

import java.util.Scanner;

public class Main {

        public static void main (String[]args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the n and d:");
            int n = scanner.nextInt(); // n este nr de int din array
            int d = scanner.nextInt(); // d este nr de rotatii
            System.out.println("Enter the array:");
            int[] array = new int[n]; //  este array-ul

            for (int i = 0; i < n; i++) {
                array[(i + n - d) % n] = scanner.nextInt();
            }
            for(int i = 0; i < n; i++) {
                System.out.print(i + " ");
            }
        }
}

