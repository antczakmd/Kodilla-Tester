package com.kodilla.abstracts.homework;

public class Square extends Shape{

    int a;

    public Square(int a) {
        this.a = a;
    }
    @Override
    public double getCircuit(){
        return a + a + a + a;
    }
    @Override
    public double getSurfaceArea(){
        return  a *a;
    }
}
