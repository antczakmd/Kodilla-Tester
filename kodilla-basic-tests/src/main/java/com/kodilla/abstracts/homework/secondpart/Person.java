package com.kodilla.abstracts.homework.secondpart;

public class Person {
    public Person() {

    }

    public static void main(String[] args) {


        Driver driver = new Driver(60000,"driving", "Brian", 27, "driver" );
        driver.showResponsibilities();
        driver.showSalary();
        driver.yourName();
        Pilot pilot = new Pilot(100000, "fly", 58, "George", "Pilot");
        pilot.yourName();
        pilot.showResponsibilities();
        pilot.showSalary();
        Policeman policeman = new Policeman(25000, "guard", "Tom", 39, "Policeman");
        policeman.yourName();
        policeman.showResponsibilities();
        policeman.yourAge();

    }
}
