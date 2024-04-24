package org.example;

import org.junit.Test;
import static org.junit.Assert.*;
public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(15, calculator.multiply(5, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(2, calculator.divide(6, 3));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        calculator.divide(6, 0);
    }

    @Test
    public void testModulo() {
        assertEquals(1, calculator.modulo(5, 2));
    }

    @Test(expected = ArithmeticException.class)
    public void testModuloByZero() {
        calculator.modulo(6, 0);
    }
}
