package com.lseg.homework14;

import com.lseg.homework13.Person;

import java.util.*;

public class Collections {

    public static void main(String[] args) {

        Set<Persoane> setPers = new TreeSet<Persoane>();

        Persoane pers1 = new Persoane(50, "RName1");
        Persoane pers2 = new Persoane(20, "Name2");
        Persoane pers3 = new Persoane(30, "Name3");
        Persoane pers4 = new Persoane(40, "Name4");

        setPers.add(pers1);
        setPers.add(pers2);
        setPers.add(pers3);
        setPers.add(pers4);

        for (Persoane pers : setPers) {
            System.out.println("Persoana = " + pers);
        }

    }
}
