package com.kodilla.abstracts.homework;

public class Policeman extends Job {

    public Policeman(int salary, int responsibilities, int name, int age) {
        super(salary, responsibilities, age, name);
    }

    @Override
    public void showSalary() {
        System.out.println("My salary is low, only 25000pln.");
    }

    @Override
    public void showResponsibilities() {
        System.out.println("I look for safety on the streets.");

    }

    @Override
    public void yourName() {
        System.out.println("My name is Tom.");
    }

    @Override
    public void yourAge() {
        System.out.println("I am 39.");

    }
}
