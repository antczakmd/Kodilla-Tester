package com.kodilla.abstracts.homework;
public class Application {
    public static void main(String[] args) {


        Square square = new Square(2);
        System.out.println("Square Circuit is "+ square.getCircuit() +" Square Surface is" + square.getSurfaceArea());
        Triangle triangle = new Triangle(3,5,7,3);
        System.out.println("Triangle Circuit is " + triangle.getCircuit() + " Triangle Surface is " + triangle.getSurfaceArea());
        Ring ring = new Ring(5);
        System.out.println("Ring Circuit is " + ring.getCircuit() + " Ring Surface is " + ring.getSurfaceArea());



    }
}
