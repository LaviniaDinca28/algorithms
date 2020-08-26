package com.lseg.arrays;

import java.util.Scanner;

public class SwitchHomework {
    public static void main(String[] args) {

        //Ex - 1. Să se realizeze un program în care utilizatorul introduce de la tastatură un număr între 0 și 6
        //reprezentând ziua din săptămână, astfel: 0 = Duminică, 1 = Luni ... 6 = Sâmbătă. Să se afișeze un
        //mesaj specific zilei din săptămână.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar intre 0 si 6:");
        int day = Integer.valueOf(scanner.nextLine());

        switch(day){
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;

        }

    }
}
