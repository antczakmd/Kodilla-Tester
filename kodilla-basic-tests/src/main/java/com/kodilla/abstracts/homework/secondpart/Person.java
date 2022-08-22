package com.kodilla.abstracts.homework.secondpart;

public class Person {
    int age;
    int salary;
    String responsibilities;
    String name;
    String job;
    public Person(int salary, String responsibilities, int age, String name, String job) {
        this.salary = salary;
        this.responsibilities = responsibilities;
        this.age = age;
        this.name = name;
        this.job = job;

    }

    public static void main(String[] args) {


        Driver driver = new Driver();
        driver.showResponsibilities();
        driver.showSalary();
        driver.yourName();
        Pilot pilot = new Pilot();
        pilot.yourName();
        pilot.showResponsibilities();
        pilot.showSalary();
        Policeman policeman = new Policeman();
        policeman.yourName();
        policeman.showResponsibilities();
        policeman.yourAge();

    }
}
