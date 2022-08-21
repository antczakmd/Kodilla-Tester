package com.kodilla.abstracts.homework;

public class Square extends Shape{

    int a;

    public Square(int circuit, int surfaceArea) {
        super(circuit, surfaceArea);
    }
    @Override
    public int getCircuit(){
        return a + a + a + a;
    }
    @Override
    public int getSurfaceArea(){
        return  a *a;
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
