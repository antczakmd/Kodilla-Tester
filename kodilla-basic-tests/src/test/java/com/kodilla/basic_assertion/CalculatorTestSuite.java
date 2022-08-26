package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 9;
        int subtractResult = calculator.subtract(a, b);
        assertEquals(-4, subtractResult);
    }

    @Test
    public void testSubtract1() {
        Calculator calculator = new Calculator();
        int a = 15;
        int b = 9;
        int subtractResult = calculator.subtract(a, b);
        assertEquals(6, subtractResult);
    }

    @Test
    public void testSquaredMinus() {
        Calculator calculator = new Calculator();
        int a = -5;
        double squaredResult = calculator.squared(a);
        assertEquals(25, squaredResult, 0.01);
    }
    @Test
    public void testSquaredZero() {
        Calculator calculator = new Calculator();
        int a = 0;
        double squaredResult = calculator.squared(a);
        assertEquals(0, squaredResult, 0.01);
    }
    @Test
    public void testSquared() {
        Calculator calculator = new Calculator();
        double a = 5;
        double squaredResult = calculator.squared(a);
        assertEquals(25, squaredResult, 0.01);
    }
}
