package com.kodilla.abstracts.homework;
public class Application {
    public static void main(String[] args) {


        Square square = new Square(2);
        square.getCircuit();
        square.getSurfaceArea();
        Triangle triangle = new Triangle(3,5,7,3);
        triangle.getSurfaceArea();
        triangle.getCircuit();
        Ring ring = new Ring(5);
        ring.getSurfaceArea();
        ring.getCircuit();



    }
}
