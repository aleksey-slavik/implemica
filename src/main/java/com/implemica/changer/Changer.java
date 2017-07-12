package com.implemica.changer;

/**
 * Change values of two variables without third variable.
 * Wrapper class for two integer numbers.
 * @author Slavik Aleksey V.
 * @version 1.1
 */
public class Changer {

    /**
     * Values which need to swap
     */
    private int a, b;

    /**
     * Create Changer object
     * @param a first number
     * @param b second number
     */
    public Changer (int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return  b;
    }

    /**
     * Change values using '+' and '-' operations
     */
    public void change () {
        a = a - b;
        b = a + b;
        a = b - a;
    }

    /**
     * Change values using XOR
     */
    public void changeXOR () {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
    }

    @Override
    public String toString() {
        return "a = " + a + ", b = " + b;
    }
}
