package com.kodilla.collections.interfaces.homework;

public class CarRace {

    public static void main(String[] args) {
        Audi audi = new Audi();
        doRace(audi);
        Bmw bmw = new Bmw();
        doRace(bmw);
        Mercedes mercedes = new Mercedes();
        doRace(mercedes);
    }


    private static void doRace(Car car) {
        System.out.println(car.increaseSpeed(), car.increaseSpeed(), car.increaseSpeed());
        System.out.println(car.decreaseSpeed(), car.decreaseSpeed());
        System.out.println(car.getSpeed());

    }
}
