package com.lseg.Homework3;

public class Ex4 {
    public static void main(String[] args) {


        System.out.println(isCatPlaying(true, 35));
    }

    private static boolean isCatPlaying(boolean summer, int temperature){
        boolean result = false;
        if(summer = true & (temperature < 25 || temperature > 45)){
            System.out.println("Cat is not playing");
            return false;
        }
        else if(summer = false & (temperature < 25 || temperature > 35)){
            System.out.println("Cat is not playing");
            return false;
        }
        else if (summer = false & (temperature > 25 || temperature <35)){
            System.out.println("Cats are playing");
        return true;
        }
        return result;
    }
}
