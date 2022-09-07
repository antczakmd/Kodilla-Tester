package com.kodilla.collections.lists.homework;
import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Bmw;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mazda;
import com.kodilla.collections.interfaces.homework.Vw;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Vw(5,1.2,0.9));
        cars.add(new Vw(4.5,1.1,0.8));
        cars.add(new Vw(4.7,1.2,1.1));
        cars.add(new Bmw(4.8,1.3,1.1));
        cars.add(new Bmw(4.6,1,0.8));
        cars.add(new Mazda(4.9,1.3,0.9));
        cars.add(new Mazda(4.7,1.2,0.7));


        for(Car car : cars) {
            CarUtils.describeCar(car);
        }

        cars.remove(5);
        for(Car car : cars) {
            CarUtils.describeCar(car);
        }
        cars.remove(new Vw(4.7,1.2,1.1));
        for(Car car : cars) {
            CarUtils.describeCar(car);
        }
    }
}