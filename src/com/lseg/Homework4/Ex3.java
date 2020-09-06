package com.lseg.Homework4;

public class Ex3 {
    public static void main(String[] args) {

        System.out.println(String.valueOf(convertFromSeconds(123456)));
    }

    static int convertFromSeconds (int numberOfseconds){
        int H = numberOfseconds / 3600;
        int S = numberOfseconds % 60;
        int M = S / 60;
        return H+M+S;
    }
}
