package com.lseg.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ForHomework {
    public static void main(String[] args) {

        //Ex1
        int[][] array = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                array[i][j] = j;
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("");
        }

        System.out.println("");

        //Ex2
        int[][] array2 = new int[10][10];

        for (int i = 0; i < 10; i++) {
            array2[i][i] = 1;
            for (int j = 0; j < 10; j++) {
                System.out.print(array2[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");

        //Ex3
        int[][] array3 = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == i + 1) {
                    array3[i][j] = 1;
                }
                System.out.print(array3[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");

        //Ex4
        int[][] array4 = new int[10][10];

        for (int i = 0; i < 10; i++) { //i=0
            for (int j = 0; j < 10; j++) { //j=9
                if (i + j == 9) {
                    array4[i][j] = 1;
                }
                System.out.print(array4[i][j] + "\t");
            }
            System.out.println("");
        }

        System.out.println("");

        //Ex5
        int[][] array5 = new int[6][6];

        for (int i = 0; i < 6; i++) { //i=0
            for (int j = 0; j <= i; j++) {
                array5[i][j] = i;
                System.out.print(array5[i][j] + "\t");
            }
            System.out.println("");
        }

        System.out.println("");

        //Ex6
        int[][] array6 = new int[5][5];

        for (int i = 0; i < 5; i++) { //i=0
            for (int j = 4; j >= i; j--) {
                array6[i][j] = i + 1;
                System.out.print(array6[i][j] + "\t");
            }
            System.out.println("");
        }

        System.out.println("");

        //Ex7 - Sa se determine si sa se salveze toate numerele prime intr-un int[] array ce va fi returnat de
        //functie, mai mici decat un numar dat n, natural.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the number:");
        int n = scanner.nextInt(); //acesta este nr dat
        int m = 0; //no of values in the array
        int[] array7 = new int[m];

      //  for (int i = 0; i < n; i++) {
           //** if (i % 2 == 0) {
            //    array7[i] = scanner.nextInt();;
           // }
           // System.out.print(array7[i] + "\t");
       //}

        System.out.println("");

        //Ex8 -Scrieți o functie care sa sorteze un array de numere intregi.
        //Scanner scan = new Scanner(System.in);
        //System.out.println("Give the array:");

        int[] array8 = {3,0,4,6,8,1,};
        Arrays.sort(array8);
        System.out.println("Ordered array list is:" + Arrays.toString(array8));

    }
}
