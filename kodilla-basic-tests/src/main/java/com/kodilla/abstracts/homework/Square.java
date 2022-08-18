package com.kodilla.abstracts.homework;

public class Square extends Shape{

    int a;

    public Square(int circuit, int surfaceArea) {
        super(circuit, surfaceArea);
    }

    @Override
    public double getCircleArea(double r) {
        return 0;
    }

    @Override
    public double circlePerimeter(double r) {
        return 0;
    }

    @Override
    public double getSquareCircuit(){
        return a + a + a + a;
    }
    @Override
    public double getSquareSurfaceArea(){
        return a *a;
    }

    @Override
    public double getTriangleCircuit() {
        return 0;
    }

    @Override
    public double getTriangleSurfaceArea() {
        return 0;
    }


}
