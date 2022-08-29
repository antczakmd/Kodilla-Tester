//Utwórz klasę abstrakcyjną Job (zawód), z polami salary oraz responsibilities.
//Utwórz kilka konkretnych zawodów (klas dziedziczących po Job).
//W kolejnym kroku utwórz klasę Person, która zawierać będzie pola firstName, age i job.
//Dodaj metodę, która wyświetli obowiązki danej osoby w pracy.

package com.kodilla.abstracts.homework.secondpart;

public class Person extends Policeman{
    int age;
    String name;
    String job;
    public Person( int age, String name, String job) {
        this.age = age;
        this.name = name;
        this.job = job;
    }

    public String getName() {
        return this.name;
    }


    public void printResponsibilities() {
        System.out.println(this.getName() + "'s responsibilities at work are: " + this.getResponsibilities());
    }




}


