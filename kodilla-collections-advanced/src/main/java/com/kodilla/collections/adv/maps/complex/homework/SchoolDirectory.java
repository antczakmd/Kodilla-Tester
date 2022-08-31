package com.kodilla.collections.adv.maps.complex.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {

    public static void main(String[] args) {

        Map<Principal, School> allSchools = new HashMap<>();

        Principal adam = new Principal("Adam", "Jones");
        Principal eddie = new Principal("Eddie", "Stobart");
        Principal john = new Principal("John", "Wick");
        Principal tom = new Principal("Tom", "Ford");

        School adamEducation = new School("Education kings", 12,17,30,14);
        School eddieTraining = new School("Hgv training school", 3,5,2,7);
        School johnFights = new School("JW FightClub", 7,8,6,7);
        School tomDancing = new School("Dancing Queens", 10,10,10,10);

        allSchools.put(adam,adamEducation);
        allSchools.put(eddie,eddieTraining);
        allSchools.put(john,johnFights);
        allSchools.put(tom,tomDancing);

for (Map.Entry<Principal, School> principalEntry : allSchools.entrySet()) {
    System.out.println("The total number of students in " + principalEntry.getKey().getFirstname() +
            principalEntry.getKey().getLastname() + " " + principalEntry.getValue().getSchoolName() + " is " + principalEntry.getValue().getSum());
}




    }
}
