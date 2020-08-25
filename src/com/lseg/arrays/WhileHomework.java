package com.lseg.arrays;

import java.util.Scanner;

public class WhileHomework {
    public static void main(String[] args) {


        //Ex1+2 - 1.Salvaţi o valoare între 1 şi 10 într-o variabilă. Încercaţi să ghiciţi numărul prin introducerea unei
        //valori de la tastatură. Afişaţi mesaje diferite dacă numărul este mai mare, mai mic sau dacă l-aţi
        //ghicit. 2. Pentru programul anterior, afişaţi şi numărul de încercări care au fost necesare.

        Scanner scanner = new Scanner(System.in);
        int x = 7;
        System.out.println("Ghiciti un numar intre 1 si 10.");
        int counts = 0;

        while(true){
            System.out.println("Introduceti numarul:");
            int number = Integer.valueOf(scanner.nextLine());

            if(number > x){
                System.out.println("Numarul cautat este mai mic!");
                counts++;
                continue;
            }
            if(number <x){
                System.out.println("Numarul cautat este mai mare!");
                counts++;
                continue;
            }
            if (number == x) {
                System.out.println("Felicitari! Ati ghicit numarul!");
                counts++;
                break;
            }
        }
        System.out.println("Numarul total de incercari este: " + counts);

    //Ex3. Scrieţi un program care să facă suma unor numere întregi introduse de la tastatură. Suma va fi
        //afişată la fiecare pas. Programul se va opri când se va introduce valoarea 0.
        Scanner scan = new Scanner(System.in);
        int sum = 0;

        while(true) {
            System.out.println("Introduceti numarul: ");
            int numar = Integer.valueOf(scan.nextLine());

            if(numar==0){
                break;
            }
            if(numar!=0){
                sum = sum + numar;
            }

        }

        System.out.println("Suma numerelor este: " + sum);


    }
}
