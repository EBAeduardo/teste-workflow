package com.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5.0, calculator.add(2.0, 3.0), "2 + 3 deve ser 5");
    }

    @Test
    void testSubtract() {
        assertEquals(6.0, calculator.subtract(10.0, 4.0), "10 - 4 deve ser 6");
    }

    @Test
    void testMultiply() {
        assertEquals(30.0, calculator.multiply(5.0, 6.0), "5 * 6 deve ser 30");
    }

    @Test
    void testDivide() {
        assertEquals(5.0, calculator.divide(20.0, 4.0), "20 / 4 deve ser 5");
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(1.0, 0.0);
        });
        assertEquals("Divisão por zero não é permitida.", exception.getMessage());
    }
}