package com.lseg.Homework4;

public class Ex4 {
    public static void main(String[] args) {
        System.out.println(canPack(1,5,9));
    }

    static boolean canPack(int bigCount, int smallCount, int goal){
        int bigCountKilos = bigCount * 5;
        int smallCountKilos = smallCount;

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        } else {

            if (bigCountKilos >= goal && bigCountKilos % goal == 0) {
                return true;
            } else if (bigCountKilos + smallCountKilos >= goal && bigCountKilos % goal == 0) {
                return true;
            } else if (bigCountKilos < goal && bigCountKilos + smallCountKilos >= goal) {
                return true;
            } else {
                return false;
            }
        }
    }
}
