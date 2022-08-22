package com.kodilla.abstracts.homework.secondpart;

import com.kodilla.abstracts.homework.secondpart.Job;

public class Policeman extends Job {


    @Override
    public void showJob(){
        System.out.println("I work as a Policeman.");
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
