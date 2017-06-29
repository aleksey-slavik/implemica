package com.implemica.gcd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Testcases for GCD class.
 * @author Slavik Aleksey V.
 * @version 1.0
 */
public class GCDTest {

    @Test
    public void gcdOfTwo(){
        assertTrue(GCD.gcd(1,1) == 1);
        assertTrue(GCD.gcd(0,0) == 0);
        assertTrue(GCD.gcd(17,3) == 1);
        assertTrue(GCD.gcd(18,6) == 6);
        assertTrue(GCD.gcd(18,-6) == 6);
    }

    @Test
    public void gcdOfFour() {
        assertTrue(GCD.gcd(1, 1, 1, 1) == 1);
        assertTrue(GCD.gcd(0, 0, 0, 0) == 0);
        assertTrue(GCD.gcd(-1, -1, -1, -1) == 1);
        assertTrue(GCD.gcd(17, 21, 5, 7) == 1);
        assertTrue(GCD.gcd(10, 15, 20, 30) == 5);
        assertTrue(GCD.gcd(18, 48, 0, 30) == 6);
        assertTrue(GCD.gcd(18, 48, -54, 30) == 6);
        assertTrue(GCD.gcd(18, 48, 54, 30) == 6);
    }

}