package com.kodilla.abstracts.homework;

public class Triangle extends Shape{

    int a;
    int b;
    int c;
    int h;
    public Triangle(int a, int b, int c, int h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public double getCircuit(){
        return a + b + c;

    }
    @Override
    public double getSurfaceArea(){
        return (a*h)/2 ;

    }
}
