package com.implemica.gcd;

import java.util.*;

/**
 * Calculate GCD of four numbers
 * @author Slavik Aleksey V.
 * @version 1.1
 */
public class GCD {

    /**
     * Count of values for calculate GCD
     */
    private static final int VALUES_COUNT = 4;

    /**
     * Implementation of Euclid's algorithm
     * @param a first number
     * @param b second number
     * @return  GCD of given numbers
     */
    public static int gcd(int a, int b) {
        if (a == Integer.MIN_VALUE && (b == Integer.MIN_VALUE || b == 0)) {
            throw new IllegalArgumentException("gcd(" + a + ", " + b + ") equals 2147483648, which is bigger than maximum of integer");
        }

        if ((a == Integer.MIN_VALUE || a == 0) && b == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("gcd(" + a + ", " + b + ") equals 2147483648, which is bigger than maximum of integer");
        }

        if (b == 0) {
            return Math.abs(a);
        }

        return gcd(b, a % b);
    }

    /**
     * Return GCD of array of four numbers using GCD for array of numbers
     * @param array array of numbers
     * @return      GCD of given numbers in array
     */
    public static int gcd(int[] array) {
        if (array == null || array.length != VALUES_COUNT) {
            throw new IllegalArgumentException("Wrong input data (null array or array length not equals 4)");
        }

        int[] res = removeSame(array);

        if (res.length == 1) {

            if (res[0] == Integer.MIN_VALUE) {
                throw new IllegalArgumentException("GCD of given number " + res [0] + " bigger than 2147483647");
            } else {
                return Math.abs(res[0]);
            }
        }

        int gcd = gcd(res[0], res[1]);

        for (int i = 2; i < res.length; i++) {
            gcd = gcd(gcd, res[i]);
        }

        return gcd;
    }

    /**
     * Remove same values from given array
     * @param array array of numbers
     * @return      array of different numbers
     */
    private static int[] removeSame(int[] array) {
        int[] res = new int[array.length];
        int cur = 1;
        res[0] = array[0];

        for(int i : array) {
            if(!isContains(res, i)) {
                res[cur] = i;
                cur++;
            }
        }

        if (cur == array.length) {
            return array;
        }

        return Arrays.copyOf(res, cur);
    }

    /**
     * Return true if value is contains in given array
     * @param array array of numbers
     * @param a     value to check
     * @return      true, if value is contained in array; false, if value is not contained in array
     */
    private static boolean isContains(int[] array, int a) {
        for (int i : array) {
            if (i == a) {
                return true;
            }
        }

        return false;
    }
}
