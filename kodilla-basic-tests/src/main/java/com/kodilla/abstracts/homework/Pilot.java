package com.kodilla.abstracts.homework;

public class Pilot extends Job{
    public Pilot(int salary, int responsibilities, int age, int name) {
        super(salary, responsibilities, name, age);
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
