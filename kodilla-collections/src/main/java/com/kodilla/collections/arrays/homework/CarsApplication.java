package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mazda;
import com.kodilla.collections.interfaces.homework.Vw;
import com.kodilla.collections.interfaces.homework.Bmw;

import java.util.Random;

public class CarsApplication {

    Random random = new Random();

    public static void main(String[] args) {
        Car[] cars = new Car[15 + 1];
        for (int n = 0; n < cars.length; n++) {
            cars[n] = drawCar();
            cars[n].increaseSpeed();

    }
        for (Car car : cars)
            CarUtils.describeCar(car);

    }
    private static Car drawCar() {
        int drawnCarName = random.nextInt(3);

    }
}
