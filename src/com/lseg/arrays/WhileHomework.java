package com.lseg.arrays;

import java.util.Scanner;

public class WhileHomework {
    public static void main(String[] args) {


        //Ex1 - Salvaţi o valoare între 1 şi 10 într-o variabilă. Încercaţi să ghiciţi numărul prin introducerea unei
        //valori de la tastatură. Afişaţi mesaje diferite dacă numărul este mai mare, mai mic sau dacă l-aţi
        //ghicit.

        Scanner scanner = new Scanner(System.in);
        int x = 7;
        System.out.println("Ghiciti un numar intre 1 si 10.");

        while(true){
            System.out.println("Introduceti numarul:");
            int number = Integer.valueOf(scanner.nextLine());

            if(number > x){
                System.out.println("Numarul cautat este mai mic!");
                continue;
            }
            if(number <x){
                System.out.println("Numarul cautat este mai mare!");
                continue;
            }
            if (number == x) {
                System.out.println("Felicitari! Ati ghicit numarul!");
                break;
            }

        }

    }
}
