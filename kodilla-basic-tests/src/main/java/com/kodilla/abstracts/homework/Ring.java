package com.kodilla.abstracts.homework;

public class Ring extends Shape{
    static double PI = 3.1415927;
    int r;

    public Ring(int circuit, int surfaceArea) {
        super(circuit, surfaceArea);
    }
    @Override
    public double getSurfaceArea(double r) {
        return PI * r * r;
    }
    @Override
    public double getCircuit(double r) {
        return 2 * PI *r;
    }

//    @Override
//    public double getSquareCircuit() {
//        return 0;
//    }
//
//    @Override
//    public double getSquareSurfaceArea() {
//        return 0;
//    }
//
//    @Override
//    public double getTriangleCircuit() {
//        return 0;
//    }
//
//    @Override
//    public double getTriangleSurfaceArea() {
//        return 0;
//    }

}
