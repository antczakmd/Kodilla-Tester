package com.kodilla.abstracts.homework;

public class Driver extends Job{
    public Driver(int salary, int responsibilities, int name, int age) {
        super(salary, responsibilities, name ,age);
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
