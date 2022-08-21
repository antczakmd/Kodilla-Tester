package com.kodilla.abstracts.homework;

public class Person{
    public static void main(String[] args) {


        Driver driver = new Driver(60000,1,1,27);
        driver.showResponsibilities();
        driver.showSalary();
        Pilot pilot = new Pilot(100000,1,58,1 );
        pilot.showResponsibilities();
        pilot.yourName();
        Policeman policeman = new Policeman(25000,1,1,39);
        policeman.showResponsibilities();
        policeman.yourAge();

    }

}
