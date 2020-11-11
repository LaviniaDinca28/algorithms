package com.lseg.homework5;

public class Ex4 {
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
        int number = start;
        if(start !=0 && end !=0){
            if(start <= end) {
                while (number >= start && number <= end) {
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



