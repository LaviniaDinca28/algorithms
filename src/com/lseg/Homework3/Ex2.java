package com.lseg.Homework3;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {


        System.out.println(shouldWakeUp( true,  5));

    }

    private static boolean shouldWakeUp(boolean barking, int hour){
            boolean result = false;
            if (hour < 0 || hour > 23){
                System.out.println("Don't wake up");
                return false;
            }
            else if (hour >= 8 && hour <= 22){
                System.out.println("Don't wake up");
                result = false;
            }

            else if (hour >= 1 || hour <=7 || hour >=23){
                if(barking == true){
                    System.out.println("Wake up");
                    result = true;
                }
                else {
                    System.out.println("Don't wake up");
                    result = false;
                }
            }
            return result;
        }

    }

