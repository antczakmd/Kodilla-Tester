package com.kodilla.collections.interfaces.homework;

public class Audi implements Car{

    private int speed;

    public Audi(int speed){
        this.speed = 0;
    }
    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed(int incSpeed) {
        speed = speed + 20;


    }

    @Override
    public void decreaseSpeed(int decSpeed) {
      speed =  speed - 10;
    }
}
