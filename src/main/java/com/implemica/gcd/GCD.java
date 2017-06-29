package com.implemica.gcd;

/**
 * Calculate GCD of four numbers
 * @author Slavik Aleksey V.
 * @version 1.1
 */
public class GCD {

    /**
     * Implementation of Euclid's algorithm
     * @param a
     * @param b
     * @return
     */
    public static int gcd(int a, int b) {
        if (b == 0)
            return Math.abs(a);
        return gcd(b, a % b);
    }

    /**
     * Return GCD of four numbers using GCD for two numbers
     * @return
     */
    public static int gcd(int a, int b, int c, int d) {
        return gcd(gcd(a, b), gcd(c, d));
    }
}
