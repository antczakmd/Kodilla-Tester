package com.kodilla.abstracts.homework.secondpart;



public class Pilot extends Job {

    public Pilot() {
        super(100000,"flying");
    }


    @Override
    public void showJob(){
        System.out.println("My job is being Pilot.");
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

