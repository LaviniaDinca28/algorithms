package com.lseg.Homework4;

public class Ex1 {
    public static void main(String[] args) {

        System.out.println(rangeSum(2,50,2));

    }

    private static boolean isDivisible(int number, int divisor) {
        if (number > 0) {
            if (number % divisor == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    static int rangeSum(int start, int end, int divisor){
        int sum = 0;
        if(isDivisible(58, 2) == true){
            sum++;
        }
        return sum;
    }



    }



