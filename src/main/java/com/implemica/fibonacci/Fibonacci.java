package com.implemica.fibonacci;

/**
 * Find Fibonacci sequence
 * @author Slavik Aleksey V.
 * @version 1.1
 */
public class Fibonacci {

    /**
     * Finding number from the Fibonacci sequence in given position
     * @param pos
     * @return
     */
    public static int getValueAt(int pos) {
        if (pos < 0)
            throw new IllegalArgumentException();
        return pos > 2 ? getValueAt(pos - 1) + getValueAt(pos - 2) : 1;
    }
}
