package com.example.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5.0, calculator.add(2.0, 3.0), 0.001);
        assertEquals(0.0, calculator.add(-2.0, 2.0), 0.001);
        assertEquals(-5.0, calculator.add(-2.0, -3.0), 0.001);
    }

    @Test
    public void testSubtract() {
        assertEquals(2.0, calculator.subtract(5.0, 3.0), 0.001);
        assertEquals(-2.0, calculator.subtract(3.0, 5.0), 0.001);
        assertEquals(0.0, calculator.subtract(5.0, 5.0), 0.001);
    }

    @Test
    public void testMultiply() {
        assertEquals(15.0, calculator.multiply(5.0, 3.0), 0.001);
        assertEquals(-15.0, calculator.multiply(-5.0, 3.0), 0.001);
        assertEquals(0.0, calculator.multiply(0.0, 5.0), 0.001);
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, calculator.divide(6.0, 3.0), 0.001);
        assertEquals(-2.0, calculator.divide(-6.0, 3.0), 0.001);
        assertThrows(ArithmeticException.class, () -> calculator.divide(5.0, 0.0));
    }

    @Test
    public void testPower() {
        assertEquals(8.0, calculator.power(2.0, 3.0), 0.001);
        assertEquals(1.0, calculator.power(5.0, 0.0), 0.001);
        assertEquals(0.25, calculator.power(2.0, -2.0), 0.001);
    }

    @Test
    public void testModulo() {
        assertEquals(1.0, calculator.modulo(7.0, 3.0), 0.001);
        assertEquals(0.0, calculator.modulo(8.0, 4.0), 0.001);
        assertThrows(ArithmeticException.class, () -> calculator.modulo(5.0, 0.0));
    }

    @Test
    public void testSqrt() {
        assertEquals(3.0, calculator.sqrt(9.0), 0.001);
        assertEquals(0.0, calculator.sqrt(0.0), 0.001);
        assertEquals(2.5, calculator.sqrt(6.25), 0.001);
        assertThrows(ArithmeticException.class, () -> calculator.sqrt(-1.0));
    }

    @Test
    public void testFactorial() {
        assertEquals(1, calculator.factorial(0));
        assertEquals(1, calculator.factorial(1));
        assertEquals(24, calculator.factorial(4));
        assertEquals(120, calculator.factorial(5));
        assertThrows(IllegalArgumentException.class, () -> calculator.factorial(-1));
    }
}