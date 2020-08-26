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

        //Ex4. Scrieţi un program care să verifice dacă 3 numere introduse de la tastatură pot fi laturile unui
        //triunghi.

        while(true){
            System.out.println("Introduceti a: ");
            int a = Integer.valueOf(scan.nextLine());
            System.out.println("Introduceti b: ");
            int b = Integer.valueOf(scan.nextLine());
            System.out.println("Introduceti c: ");
            int c = Integer.valueOf(scan.nextLine());

           if((a>0) & (b>0) & (c>0) & ( (a+b>c) & (a+c>b) & (b+c>a) )){
               System.out.println("Cele 3 numere pot fi laturile unui triunghi");
               break;
            } else {
               System.out.println("Cele 3 numere nu pot fi laturile unui triunghi");
               break;
           }
        }

        //Ex5 - Introduceţi un număr întreg de la tastatură. Verificaţi dacă este palindrom. Un număr este
        //palindrom dacă este egal cu opusul său.
        System.out.println("Introduceti un nr: ");
        int palindrom = Integer.valueOf(scan.nextLine());
        int originalnumber = palindrom;
        int reversednumber = 0;
        int remainder = 0;

        while(palindrom != 0){
            remainder = palindrom %10;
            reversednumber = reversednumber * 10 + remainder;
            palindrom = palindrom / 10;
                }
        if(originalnumber == reversednumber){
            System.out.println("Numarul este palindrom");
        } else{
            System.out.println("Numarul nu este palindrom");
        }

        System.out.println("");

        //Ex6 - Scrieți un program în care voi vă gândiți la un număr între 1 și 100, iar computerul trebuie să îl
        //ghicească.
        //Scanner scann = new Scanner(System.in);
        System.out.println("Ganditi-va la un nr si apasati enter pentru a incepe!");
        scanner.nextLine();
        int min = 0;
        int max = 100;
        boolean done = false;

        while(!done){

            int guess = min + (int)(Math.random() * (max - min + 1));

            System.out.println("My guess is: " + guess);
            System.out.println("Please type yes if I got it right.");
            System.out.println("Please type higher if your number is greater than " + guess + ".");
            System.out.println("Please type lower if your number is less than " + guess + ".");
            System.out.println("Then press enter.");

            String answer = scanner.nextLine();

            if(answer.equals("lower")){
                max = guess - 1;
            }
            else if(answer.equals("higher")){
                min = guess + 1;
            }
            else{
                System.out.println("Yeii!");
                done = true;
            }
        }
        //scanner.close();

        System.out.println("");

        //Ex7 - Scrieți o functie care simuleaza un bancomat. Se verifica pinul. Daca userul introduce greșit
        //pinul de 3 ori, se iese din bucla while.

        //Scanner scanner = new Scanner(System.in);
        int pincorect = 1234;
        int count = 1;

        while(count <= 3){
            System.out.println("Introduceti codul pin:");
            int pin = Integer.valueOf(scanner.nextLine());

            if(pin == pincorect){
                System.out.println("Pinul este corect");
                break;
            }
            if(pin != pincorect) {
                System.out.println("Codul pin este gresit");
                count++;
                continue;
            }
        }

    }
}
