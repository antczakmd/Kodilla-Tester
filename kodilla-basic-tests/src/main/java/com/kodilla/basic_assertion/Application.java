package com.kodilla.basic_assertion;


public class Application {
    public static void main(String[] args) {

        int a = -5;
        int b = 8;
        Calculator calculator = new Calculator();
        int sumResult = calculator.sum(5,8);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int subtractResult = calculator.subtract(5,8);
        boolean dobry = ResultChecker.assertEquals(-3, subtractResult);
        if (dobry) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);
        }

        double squaredResult = calculator.squared(-5);
        boolean good = ResultChecker.assertEquals(25, squaredResult);
        if (good) {
            System.out.println("Metoda squared działa poprawnie dla liczb " + a );
        } else {
            System.out.println("Metoda squared nie działa poprawnie dla liczb " + a );
        }
    }
}
