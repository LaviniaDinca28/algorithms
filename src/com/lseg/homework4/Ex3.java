package com.lseg.homework4;

public class Ex3 {
    public static void main(String[] args) {

        System.out.println((convertFromSeconds(38239)));
    }

    static String convertFromSeconds (int numberOfseconds){
        int H = numberOfseconds / 3600;
        int remainder = numberOfseconds - H * 3600;
        int M = remainder / 60;
        int S = numberOfseconds % 60;

        String output = "H" + H + "M" + M + "S" + S;

        return output;
    }
}
