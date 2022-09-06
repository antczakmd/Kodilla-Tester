package com.kodilla.collections.interfaces.homework;

public class Vw implements Car{

    double speed;
    private double acceleration;
    private double brakes;

    public Vw(int speed, int acceleration, int brakes) {
        this.speed = speed;
        this.acceleration = acceleration;
        this.brakes = brakes;
    }
    public double getSpeed() {

        return speed;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public void increaseSpeed() {

        speed*=acceleration;
    }

    public void decreaseSpeed() {

        speed*=brakes;
    }
}
