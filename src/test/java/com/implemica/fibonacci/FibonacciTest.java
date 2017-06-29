package com.implemica.fibonacci;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Testcases for Fibonacci class.
 * @author Slavik Aleksey V.
 * @version 1.0
 */
public class FibonacciTest {

    @Test
    public void getValueAt() {
        assertTrue(Fibonacci.getValueAt(0) == 1);
        assertTrue(Fibonacci.getValueAt(1) == 1);
        assertTrue(Fibonacci.getValueAt(10) == 55);
    }

    @Test (expected = IllegalArgumentException.class)
    public void getValueAtNegative() {
        Fibonacci.getValueAt(-1);
    }
}