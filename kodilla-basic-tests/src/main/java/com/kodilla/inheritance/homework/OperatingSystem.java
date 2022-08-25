package com.kodilla.inheritance.homework;

public class OperatingSystem {

    private int year;

    public OperatingSystem (int year){

        this.year = year;
    }

    public void turnOn() {
        System.out.println("System started");

    }
    public void turnOff()
    {
        System.out.println("System switched off ");
    }
    public void softwareProductionYear() {
        System.out.println("Production year" + year);
    }
    public int getYear(){
        return year;
    }
}

