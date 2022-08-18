package com.kodilla.inheritance.homework;

public class PowerOnOff {

    public static void main(String[] args){

        OperatingSystem operatingSystem = new OperatingSystem(1980);
        operatingSystem.turnOn();

        Windows95 windows95 = new Windows95(1995);
        windows95.shutDownSystem();
        windows95.turnOff();

        WindowsMe windowsMe = new WindowsMe(2000);
        windowsMe.softwareProductionYear();
        windowsMe.turnOn();

    }
}
