package com.kodilla.abstracts.homework;

public class Ring extends Shape {
    static double PI = 3.1415927;
    int r;

    public Ring(int r) {
        this.r = r;
    }

    @Override
    public double getSurfaceArea() {
        return PI * r * r;
    }

    @Override
    public double getCircuit() {
        return 2 * PI * r;
    }
}