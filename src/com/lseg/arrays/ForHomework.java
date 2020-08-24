package com.lseg.arrays;

public class ForHomework {
    public static void main(String[] args) {

        //Ex1
        int[][] array = new int[10][10];

        for(int i=0; i<10; i++){
            for(int j = 0; j< 10; j++){
                array[i][j] = j;
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("");
        }

        System.out.println("");

        //Ex2
        int[][] array2 = new int[10][10];

        for(int i=0; i<10; i++){
            array2[i][i] = 1;
            for(int j = 0; j< 10; j++){
                System.out.print(array2[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");

        //Ex3
        int[][] array3 = new int[10][10];

        for(int i=0; i<10; i++){
            for(int j = 1; j< 10; j++){
                if(j == i+1){
                    array3[i][j] = 1;
                }
                System.out.print(array3[i][j] + "\t");
            }
            System.out.println("");
        }

        //Ex4







    }
}
