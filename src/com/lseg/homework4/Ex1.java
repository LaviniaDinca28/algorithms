package com.lseg.homework4;

public class Ex1 {
    public static void main(String[] args) {

        System.out.println(rangeSum(2,5,2));
        //System.out.println(isDivisible(0,10));

    }

    private static boolean isDivisible(int number, int divisor) {
        boolean result = false;
        if (number > 0) {
            if (number % divisor == 0) {
                result = true;
            } else {
                result = false;
            }
        } else {
            result = false;
        }
        return result;
    }

    static int rangeSum(int start, int end, int divisor){
        int sum = 0;
        if(start !=0 && end !=0){
            if(start <= end) {
                for (int number = start; number <= end; number++) {
                    if (isDivisible(number, divisor)) {
                        sum = sum + number;
                    }
                }
            } else {
                sum = -1;
            }
        } else {
            sum = -1;
        }
        return sum;
    }



    }



