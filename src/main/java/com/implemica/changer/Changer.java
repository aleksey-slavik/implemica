package com.implemica.changer;

/**
 * Change values of two variables without third variable
 * @author Slavik Aleksey V.
 * @version 1.1
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Changer changer = (Changer) o;

        if (a != changer.a) return false;
        return b == changer.b;
    }
}
