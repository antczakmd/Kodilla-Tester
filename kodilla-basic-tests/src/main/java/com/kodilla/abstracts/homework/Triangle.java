package com.kodilla.abstracts.homework;

public class Triangle extends Shape{
    int a;
    int b;
    int c;
    int h;
    public Triangle(int circuit, int surfaceArea) {
        super(circuit, surfaceArea);
    }

//    @Override
//    public double getCircleArea(double r) {
//        return 0;
//    }
//
//    @Override
//    public double circlePerimeter(double r) {
//        return 0;
//    }
//
//    @Override
//    public double getSquareCircuit() {
//        return 0;
//    }

//    @Override
//    public double getSquareSurfaceArea() {
//        return 0;
//    }

    @Override
    public int getCircuit(){
        return a + b +c;
    }
    @Override
    public int getSurfaceArea(){
        return (a*h)/2 ;
    }

    @Override
    public double getCircuit(double r) {
        return 0;
    }

    @Override
    public double getSurfaceArea(double r) {
        return 0;
    }
}
