package com.kodilla.inheritance.homework;

public class Windows95 extends OperatingSystem {
    public Windows95(int year) {
        super(year);
    }
    public void startSystem(){
        System.out.println("System starting...");
    }
    public void shutDownSystem(){
        System.out.println("System closing");
    }
    @Override
    public void softwareProductionYear(){
        System.out.println("Year 1995");
    }
}