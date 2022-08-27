//Utwórz klasę abstrakcyjną Job (zawód), z polami salary oraz responsibilities.
//Utwórz kilka konkretnych zawodów (klas dziedziczących po Job).
//W kolejnym kroku utwórz klasę Person, która zawierać będzie pola firstName, age i job.
//Dodaj metodę, która wyświetli obowiązki danej osoby w pracy.

package com.kodilla.abstracts.homework.secondpart;

public class Person {
    int age;
    Job name;
    Job job;
    public Person( int age, Job name, Job job) {
        this.age = age;
        this.name = name;
        this.job = job;
    }
    public static void main(String[] args) {

   //     Person person = new Person(27, "Brian", "driver");

        Driver driver = new Driver();
        driver.getResponsibilities();
        Pilot pilot = new Pilot();
        pilot.getResponsibilities();
        Policeman policeman = new Policeman();
        policeman.getResponsibilities();

    }
}
//        Job pilot = new Pilot();
//
//        pilot.yourName();
//        Job policeman = new Policeman();
//
//        policeman.yourName();
//        policeman.yourAge();
//        policeman.showJob();
//        policeman.getResponsibilities();
//        policeman.getSalary();

