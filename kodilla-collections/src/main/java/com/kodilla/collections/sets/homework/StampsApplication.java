package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {

        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Czerwony Mauritius",3,4,true));
        stamps.add(new Stamp("Jednocentówka Gujany Brytyjskiej",2,2,false));
        stamps.add(new Stamp("Franklin Z-Grill",4,5,true));
        stamps.add(new Stamp("Polska numer 1",3,6,true));
        stamps.add(new Stamp("Pięćdziesiąt kopiejek",2,5,false));
        stamps.add(new Stamp("Pięćdziesiąt kopiejek",2,5,false));

        System.out.println("Set size: " + stamps.size());
        for (Stamp stamp : stamps) {
            System.out.println("Added to collection " + stamp);
        }
    }
}
