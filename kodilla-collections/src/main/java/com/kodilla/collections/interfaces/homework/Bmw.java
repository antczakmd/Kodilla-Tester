package com.kodilla.collections.interfaces.homework;

public class Bmw implements Car{
    private int speed;

    public Bmw(){
        this.speed = 0;
    }
    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + 40;


    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 15;

    }
}
