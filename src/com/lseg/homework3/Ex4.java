package com.lseg.homework3;

public class Ex4 {
    public static void main(String[] args) {


        System.out.println(isCatPlaying(false, 25));
    }

    private static boolean isCatPlaying(boolean summer, int temperature){
        if (summer == true){
            if (temperature >= 25 && temperature <= 45){
                System.out.println("Cat is playing");
                return true;
            }
            else {
                System.out.println("Cat is not playing");
                return false;
            }
        }
        else if (temperature >= 25 && temperature <= 35){
            System.out.println("Cat is playing");
            return true;
        }
        else {
            System.out.println("Cat is not playing");
            return false;
        }
    }
}
