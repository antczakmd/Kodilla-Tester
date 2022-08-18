package com.kodilla.inheritance.homework;

public class WindowsMe extends OperatingSystem {

    public WindowsMe(int year) {
        super(year);
    }
    @Override
    public void softwareProductionYear(){
        System.out.println("Year 2000");
    }
}
