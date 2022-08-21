package com.kodilla.abstracts.homework.secondpart;

import com.kodilla.abstracts.homework.secondpart.Job;

public class Pilot extends Job {
    int age;
    int salary;
    String responsibilities;
    String name;
    String job;
    public Pilot(int salary, String responsibilities, int age, String name, String job) {
        this.salary = salary;
        this.responsibilities = responsibilities;
        this.age = age;
        this.name = name;
        this.job = job;
    }

    @Override
    public void showJob(){
        System.out.println("My job is being Pilot.");
    }

    @Override
    public void showSalary() {
        System.out.println("My salary is 100000pln.");
    }

    @Override
    public void showResponsibilities() {
        System.out.println("I need to safely pilot the plane.");

    }

    @Override
    public void yourName() {
        System.out.println("My name is George.");
    }

    @Override
    public void yourAge() {
        System.out.println("I am 58.");

    }
}
