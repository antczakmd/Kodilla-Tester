package com.kodilla.abstracts.homework.secondpart;

public class Driver extends Job {

    int age;
    int salary;
    String responsibilities;
    String name;
    String job;
    public Driver(int salary, String responsibilities, String name, int age, String job) {
        this.salary = salary;
        this.responsibilities = responsibilities;
        this.age = age;
        this.name = name;
        this.job = job;
    }
    @Override
    public void showJob() {
        System.out.println("I am a driver.");
    }

    @Override
    public void showSalary() {
        System.out.println("I earn 60000pln every year.");
    }
    @Override
    public void showResponsibilities() {
        System.out.println("I am delivering goods every day.");
    }
    @Override
    public void yourName() {
        System.out.println("My name is Brian.");
    }
    @Override
    public void yourAge() {
        System.out.println("I am 27.");
    }
}
