package com.kodilla.abstracts.homework;

public class Triangle extends Shape{
    int a;
    int b;
    int c;
    int h;
    public Triangle(int circuit, int surfaceArea) {
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
    public double getSquareCircuit() {
        return 0;
    }

    @Override
    public double getSquareSurfaceArea() {
        return 0;
    }

    @Override
    public double getTriangleCircuit(){
        return a + b +c;
    }
    @Override
    public double getTriangleSurfaceArea(){
        return (a*h)/2 ;
    }
}
