package com.lseg.Homework3;

public class Ex2 {
    public static void main(String[] args) {

        System.out.println(shouldWakeUp(true,-1));


    }

        public static boolean shouldWakeUp(boolean barking, int hour){
            boolean result = false;
            if (hour < 0 || hour > 23){
                System.out.println("1st Condition");
                return false;
            }
            else if (hour >= 8 && hour <= 22){
                System.out.println("2nd Condition");
                result = false;
            }

            else if (hour >= 1 || hour <=7 || hour >=23){
                if(barking == true){
                    System.out.println("3rd Condition");
                    result = true;
                }
                else {
                    System.out.println("4th Condition");
                    result = false;
                }
            }
            return result;
        }

    }

