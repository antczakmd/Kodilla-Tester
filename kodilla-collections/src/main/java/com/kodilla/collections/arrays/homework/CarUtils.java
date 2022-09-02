package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mazda;
import com.kodilla.collections.interfaces.homework.Vw;
import com.kodilla.collections.interfaces.homework.Bmw;



public class CarUtils {
    public static void describeCar(Car car) {

        System.out.println("-----------------------------");
        System.out.println("Car make : " + getCarName(car));
        System.out.println("Car make : " + car.toString());
    }

        static String getCarName(Car car){
            if ( car instanceof Vw)
                return "Vw" ;
            else if ( car instanceof Mazda)
                return "Mazda" ;
            else if (car instanceof Bmw)
                return "Bmw" ;
            else
                return "Unknown car name";

        }



    }

