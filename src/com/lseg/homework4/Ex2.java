package com.lseg.homework4;

public class Ex2 {
    public static void main(String[] args) {

        System.out.println(rangeSum(0,5,2));
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
        int[] array = new int[(end-start)+1];
        int sum = 0;
        if(start !=0 && end !=0){
            if(start <= end) {
                for(int i =0; i <array.length;i++){ //add the values in the array
                    array[i] = start;
                    start++;
                }
                for (int tempVariable: array){
                    if (isDivisible(tempVariable, divisor)) {
                        sum = sum + tempVariable;
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
