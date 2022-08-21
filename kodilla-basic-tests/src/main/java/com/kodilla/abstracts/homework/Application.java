package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {

        Square square = new Square(2,4);
        square.getCircuit();
        Triangle triangle = new Triangle(5,7);
        triangle.getCircuit();
        Ring ring = new Ring(23,6);
        ring.getSurfaceArea();



    }
}
