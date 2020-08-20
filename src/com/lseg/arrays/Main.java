package com.lseg.arrays;

import java.util.Scanner;

public class Main {

        public static void main (String[]args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the n and d:");
            int n = scanner.nextInt(); // n este nr de int din array
            //System.out.println("Enter the d:");
            int d = scanner.nextInt(); // d este nr de rotatii
            int[] array = new int[n]; //  este array-ul

            System.out.println("Give the array:"); //introducem arrayul original
            for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            }

            for (int i = 0; i < d; i++) { //facem rotatia
                int j, first;
                first = array[0];
                for (j=0; j < array.length - 1; j++){
                    array[j] = array[j+1];
                }
                array[j] = first;
            }
            for(int i = 0; i < n; i++) { //printam arrayl dupa rotatie
                System.out.print(array[i] + " ");
            }
        }
}

