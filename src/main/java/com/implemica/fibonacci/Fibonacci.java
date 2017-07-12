package com.implemica.fibonacci;

import java.util.HashMap;

/**
 * Find element of Fibonacci sequence
 * @author Slavik Aleksey V.
 * @version 1.1
 */
public class Fibonacci {

    /**
     * Maximum position in Fibonacci sequence, value of it which less than 2147483647
     */
    private static final int MAX_VALUE = 46;

    /**
     * Map for the memorization of values for getValueAtMemorization() method
     */
    private static HashMap<Integer, Integer> values = new HashMap<Integer, Integer>();

    /*
     * Initializing first two values of Fibonacci sequence
     */
    static {
        values.put(0,0);
        values.put(1,1);
    }

    /**
     * Finding number from the Fibonacci sequence in given position using recursion.
     * Position must be in range from 0 to MAX_VALUE
     * @param pos   position of Fibonacci sequence
     * @return      element of given Fibonacci sequence
     */
    public static int getValueAtRecursive(int pos) {
        if (pos < 0 || pos > MAX_VALUE) {
            throw new IllegalArgumentException("Negative input value or result of recursive method work bigger than 2147483647. " +
                    "Input value " + pos + " must be in range from 0 to " + MAX_VALUE);
        }

        if (pos == 0) {
            return 0;
        }

        return pos > 2 ? getValueAtRecursive(pos - 1) + getValueAtRecursive(pos - 2) : 1;
    }

    /**
     * Finding number from the Fibonacci sequence in given position.
     * Value is found by using last two values of sequence.
     * Position must be in range from 0 to MAX_VALUE
     * @param pos   position of Fibonacci sequence
     * @return      element of given Fibonacci sequence
     */
    public static int getValueAtDynamic(int pos) {
        if (pos < 0 || pos > MAX_VALUE) {
            throw new IllegalArgumentException("Negative input value or result of dynamic method work bigger than 2147483647. " +
                    "Input value " + pos + " must be in range from 0 to " + MAX_VALUE);
        }

        if (pos == 0) {
            return 0;
        }

        int a = 0, b = 1;

        for (int i = 0; i < pos; i++) {
            b = a + b;
            a = b - a;
        }

        return a;
    }

    /**
     * Finding number from the Fibonacci sequence in given position using memorization of evaluated values.
     * Values was saved into Map.
     * @param pos   position of Fibonacci sequence
     * @return      element of given Fibonacci sequence
     */
    public static int getValueAtMemorization(int pos) {
        if (pos < 0 || pos > MAX_VALUE) {
            throw new IllegalArgumentException("Negative input value or result of memorization method work bigger than 2147483647. " +
                    "Input value " + pos + " must be in range from 0 to " + MAX_VALUE);
        }

        if (values.containsKey(pos)) {
            return values.get(pos);
        } else {
            int value = getValueAtMemorization(pos - 1) + getValueAtMemorization(pos - 2);
            values.put(pos, value);
            return value;
        }
    }
}
