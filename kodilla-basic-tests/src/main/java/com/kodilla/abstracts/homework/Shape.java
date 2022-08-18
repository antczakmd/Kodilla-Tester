package com.kodilla.abstracts.homework;

public abstract class Shape {

    private int circuit;
    private int height;
    private int aLenght;
    private int bLenght;
    private int cLenght;

    private int surfaceArea;

    public Shape (int circuit, int surfaceArea) {
        this.circuit = circuit;
        this.surfaceArea = surfaceArea;
    }
    public int getCircuit() {
        return circuit;
    }

    public int getSurfaceArea() {
        return surfaceArea;
    }

    public abstract double getCircleArea(double r);

    public abstract double circlePerimeter(double r);

    public abstract double getCirclePerimeter(double r);

    public abstract double getSquareCircuit();

    public abstract double getSquareSurfaceArea();

    public abstract double getTriangleCircuit();

    public abstract double getTriangleSurfaceArea();
}
