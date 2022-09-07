package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mazda;
import com.kodilla.collections.interfaces.homework.Vw;
import com.kodilla.collections.interfaces.homework.Bmw;

import java.util.Random;

public class CarsApplication {


    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];
        for (int n = 0; n < cars.length; n++) {
            cars[n] = drawCar();
            cars[n].increaseSpeed();

        }
        for (Car car : cars)
            CarUtils.describeCar(car);

    }

    private static Car drawCar() {
        Random random = new Random();
        int drawnCarName = random.nextInt(3);
        double a = random.nextDouble() * 10 + 1;
        double b = random.nextDouble() * 10 + 1;
        double c = random.nextDouble() * 10 + 1;

        if (drawnCarName == 0) {
            return new Vw(a, b, c);
        }
        else if (drawnCarName == 1) {
            return new Bmw(a, b, c);
        }
        else {
            return new Mazda(a, b, c);
        }
    }
}



