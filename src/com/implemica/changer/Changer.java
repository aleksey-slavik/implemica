package com.implemica.changer;

/**
 * Change values of two variables without third variable
 * @author Slavik Aleksey V.
 * @version 1.0
 */
public class Changer {

    private int a, b;

    public Changer (int a, int b) {
        this.a = a;
        this.b = b;
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
