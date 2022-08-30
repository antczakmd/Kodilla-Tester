package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.Square;

import java.util.ArrayList;
import java.util.List;

public class ShapesListApplication {
    public static void main(String[] args) {
        List<Square> shapes = new ArrayList<>();
        shapes.add(new Square(10.0));
        shapes.add(new Square(5.0));
        shapes.add(new Square(1.0));
//        Square square1 = new Square(10.0);
//        Square square2 = new Square(5.0);
//        Square square3 = new Square(1.0);
//        shapes.add(square1);
//        shapes.add(square2);
//        shapes.add(square3);

//        for (int n = 0; n < shapes.size(); n++) {
//            Square square = shapes.get(n);

        // U Z Y C I E  FOR EACH //



        for (Square square : shapes) {
            if (square.getArea() > 20)
                System.out.println(square + ", area: " + square.getArea());
        }
    }
}

