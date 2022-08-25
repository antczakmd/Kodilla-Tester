//Utwórz klasę abstrakcyjną Job (zawód), z polami salary oraz responsibilities.
//Utwórz kilka konkretnych zawodów (klas dziedziczących po Job).
//W kolejnym kroku utwórz klasę Person, która zawierać będzie pola firstName, age i job.
//Dodaj metodę, która wyświetli obowiązki danej osoby w pracy.

package com.kodilla.abstracts.homework.secondpart;

public class Person {
    int age;
    String name;
    Job job;
    public Person( int age, String name, Job job) {
        this.age = age;
        this.name = name;
        this.job = job;
    }
    public static void main(String[] args) {


        Job driver = new Driver();
        JobProcessor processor = new JobProcessor();
        processor.process(driver);
        driver.yourName();
        Job pilot = new Pilot();
        processor.process(pilot);
        pilot.yourName();
        Job policeman = new Policeman();
        processor.process(policeman);
        policeman.yourName();
        policeman.yourAge();
        policeman.showJob();

    }
}