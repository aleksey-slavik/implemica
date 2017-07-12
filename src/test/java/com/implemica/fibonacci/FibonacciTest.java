package com.implemica.fibonacci;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Testcases for Fibonacci class.
 * @author Slavik Aleksey V.
 * @version 1.0
 */
public class FibonacciTest {

    /**
     * Check correct work of method getValueAt of Fibonacci class.
     * Method returned value of Fibonacci sequence in given position.
     */
    @Test
    public void getValueAt() {
        fibonacciTest(0,0);
        fibonacciTest(1,1);
        fibonacciTest(2,1);
        fibonacciTest(5,5);
        fibonacciTest(10,55);
        fibonacciTest(15,610);
        fibonacciTest(20,6765);
        fibonacciTest(25, 75025);
        fibonacciTest(30,832040);
        fibonacciTest(35,9227465);
        fibonacciTest(40,102334155);
        fibonacciTest(45,1134903170);
        fibonacciTest(46,1836311903);
    }

    /**
     * Check wrong input data for the method getValueAt()
      */
    @Test
    public void getWrongValueAt() {
        fibonacciFail(-2147483648);
        fibonacciFail(-100);
        fibonacciFail(-15);
        fibonacciFail(-10);
        fibonacciFail(-1);

        fibonacciFail(47);
        fibonacciFail(50);
        fibonacciFail(100);
        fibonacciFail(1000);
        fibonacciFail(2147483647);
    }

    /**
     * Testcase for check correct work of methods getValueAtRecursive(), getValueAtDynamic() and getValueAtMemorization()
     * @param input     position in Fibonacci sequence
     * @param output    value of Fibonacci sequence in given position
     */
    private void fibonacciTest(int input, int output){
        assertEquals(output, Fibonacci.getValueAtRecursive(input));
        assertEquals(output, Fibonacci.getValueAtDynamic(input));
        assertEquals(output, Fibonacci.getValueAtMemorization(input));
    }

    /**
     * Testcase for check wrong input data for the methods getValueAtRecursive() and getValueAtDynamic()
     * @param value     position in Fibonacci sequence
     */
    private void fibonacciFail(int value) {
        try {
            Fibonacci.getValueAtRecursive(value);
            fail("Value " + value + " was outside the interval between 0 and 46 at recursive method");
        } catch (IllegalArgumentException e) {
            //expected
        }
        try {
            Fibonacci.getValueAtDynamic(value);
            fail("Value " + value + " was outside the interval between 0 and 46 at dynamic method");
        } catch (IllegalArgumentException e) {
            //expected
        }
        try {
            Fibonacci.getValueAtMemorization(value);
            fail("Value " + value + " was outside the interval between 0 and 46 at memorization method");
        } catch (IllegalArgumentException e) {
            //expected
        }
    }
}