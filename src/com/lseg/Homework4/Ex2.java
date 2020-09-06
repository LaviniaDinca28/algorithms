package com.lseg.Homework4;

public class Ex2 {
    public static void main(String[] args) {

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
            return false;
        }
        return result;
    }

}


