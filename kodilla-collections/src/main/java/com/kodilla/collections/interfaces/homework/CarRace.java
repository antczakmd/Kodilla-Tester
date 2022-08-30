package com.kodilla.collections.interfaces.homework;

public class CarRace {

    public static void main(String[] args) {


    Bmw bmw = new Bmw(50,30,20);
    doRace(bmw);
    Mazda mazda = new Mazda(20,35,15);
    doRace(mazda);
    Vw vw = new Vw(25,60,30);
    doRace(vw);

}

private static void doRace(Car car) {
    car.increaseSpeed();
    car.increaseSpeed();
    car.decreaseSpeed();
    car.increaseSpeed();
    car.decreaseSpeed();

    System.out.println(car.getSpeed());
    }
}
