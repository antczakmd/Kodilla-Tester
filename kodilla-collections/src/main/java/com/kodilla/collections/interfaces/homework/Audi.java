package com.kodilla.collections.interfaces.homework;

public class Audi implements Car{

    private int speed;

    public Audi(){
        this.speed = 0;
    }

    public int getSpeed() {
        return speed;
    }


    public void increaseSpeed() {
        speed = speed + 20;


    }


    public void decreaseSpeed() {
      speed =  speed - 10;
    }
}
