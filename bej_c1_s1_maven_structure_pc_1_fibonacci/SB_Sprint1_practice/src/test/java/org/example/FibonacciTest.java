package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FibonacciTest {
    @Test
    public void testCalculateFibonacci() {
        assertEquals(0, Fibonacci.calculateFibonacci(1));
        assertEquals(1, Fibonacci.calculateFibonacci(2));
        assertEquals(1, Fibonacci.calculateFibonacci(3));
        assertEquals(2, Fibonacci.calculateFibonacci(4));
        assertEquals(3, Fibonacci.calculateFibonacci(5));
        // Add more test cases as needed
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateFibonacciWithInvalidInput() {
        Fibonacci.calculateFibonacci(0);
    }
}