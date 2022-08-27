package com.kodilla.collections.interfaces.homework;

public class Bmw implements Car {
    private int speed;


    @Override
    public Bmw() {
        this.speed = 0;
    }

    public int getSpeed() {
        return speed;
    }


    public void increaseSpeed() {
        speed = speed + 40;



    public void decreaseSpeed() {
        speed = speed - 15;

    }
}