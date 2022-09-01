package com.kodilla.collections.interfaces.homework;

public class Vw implements Car{

    int speed;
    private int acceleration;
    private int brakes;

    public Vw(int speed, int acceleration, int brakes) {
        this.speed = speed;
        this.acceleration = acceleration;
        this.brakes = brakes;
    }
    public int getSpeed() {

        return speed;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public void increaseSpeed() {

        speed*=acceleration;
    }

    public void decreaseSpeed() {

        speed*=brakes;
    }
}
