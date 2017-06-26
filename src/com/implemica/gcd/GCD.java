package com.implemica.gcd;

/**
 * Calculate GCD of four numbers
 * @author Slavik Aleksey V.
 * @version 1.0
 */
public class GCD {

    private int a, b, c, d;

    public GCD(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    /**
     * Implementation of Euclid's algorithm
     * @param a
     * @param b
     * @return
     */
    public int gcd(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b)
                a = a % b;
            else
                b = b % a;
        }
        return a + b;
    }

    /**
     * Return GCD of four numbers using GCD for two numbers
     * @return
     */
    public int samplingGCD() {
        return gcd(gcd(a, b), gcd(c, d));
    }

    @Override
    public String toString() {
        return "a = " + a + ", b = " + b + ", c = " + c + ", d = " + d;
    }
}
