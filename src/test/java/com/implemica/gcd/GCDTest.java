package com.implemica.gcd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Testcases for GCD class.
 * @author Slavik Aleksey V.
 * @version 1.0
 */
public class GCDTest {

    /**
     * Check correct work of method gcd(a,b) of GCD class.
     * Method return gcd of two numbers.
     */
    @Test
    public void gcdOfTwo(){
        //Testcases with second value equals zero
        gcdTest(-2147483647, 0, 2147483647);
        gcdTest(-318, 0, 318);
        gcdTest(-88,0,88);
        gcdTest(-6,0,6);
        gcdTest(-1,0,1);
        gcdTest(1,0,1);
        gcdTest(34,0,34);
        gcdTest(759,0, 759);
        gcdTest(2147483647, 0, 2147483647);

        //Testcases with first value equals zero
        gcdTest(0, -2147483647, 2147483647);
        gcdTest(0,-4555, 4555);
        gcdTest(0,-56, 56);
        gcdTest(0, -6, 6);
        gcdTest(0,1,1);
        gcdTest(0,66,66);
        gcdTest(0,344,344);
        gcdTest(0,344555,344555);
        gcdTest(0,2147483647,2147483647);

        //Testcases with second value equals one
        gcdTest(-2147483648, 1, 1);
        gcdTest(-4676, 1,1);
        gcdTest(-77,1,1);
        gcdTest(-1,1,1);
        gcdTest(34,1,1);
        gcdTest(863,1,1);
        gcdTest(2147483647,1,1);

        //Testcases with first value equals one
        gcdTest(1,-2147483648,1);
        gcdTest(1,-777,1);
        gcdTest(1,-95,1);
        gcdTest(1,-1,1);
        gcdTest(1,56,1);
        gcdTest(1,7888,1);
        gcdTest(1,2147483647,1);

        //Testcases for equals values
        gcdTest(-2147483647,-2147483647,2147483647);
        gcdTest(-892,-892,892);
        gcdTest(-1,-1,1);
        gcdTest(0,0,0);
        gcdTest(1,1,1);
        gcdTest(34,34,34);
        gcdTest(2147483647,2147483647,2147483647);

        //Testcases for values with different sign
        gcdTest(-2147483648, 2147483647,1);
        gcdTest(-180, 66, 6);
        gcdTest(-1,1,1);
        gcdTest(2147483647,-2147483648,1);
        gcdTest(18,-6,6);
        gcdTest(1,-1,1);

        //Testcases for simple numbers
        gcdTest(2,3,1);
        gcdTest(5,7,1);
        gcdTest(13,17,1);
        gcdTest(29,37,1);
        gcdTest(5,13,1);
        gcdTest(57,73,1);

        //Testcases for mutually simple numbers
        gcdTest(55, 12,1);
        gcdTest(-78, 25, 1);
        gcdTest(125,4,1);
        gcdTest(303,100,1);
        gcdTest(46, 63,1);
        gcdTest(68, 33,1);

        //Testcases for values with one of them is result gcd
        gcdTest(4,16,4);
        gcdTest(20,40,20);
        gcdTest(88, 11, 11);
        gcdTest(45, 15,15);
        gcdTest(34, 17,17);
        gcdTest(65,13,13);
    }

    /**
     * Check gcd of values, which return value 2147483648
     */
    @Test
    public void gcdOfTwoWrong() {
        gcdFail(-2147483648, -2147483648);
        gcdFail(-2147483648, 0);
        gcdFail(0, -2147483648);
    }

    /**
     * Check work of method gcd(a,b,c,d) of GCD class.
     * Method return gcd of four numbers.
     */
    @Test
    public void gcdOfFour() {
        //Testcases for values, amount which are three 0
        gcdTest(-2147483647,0,0,0,2147483647);
        gcdTest(-78,0,0,0,78);
        gcdTest(3,0,0,0,3);
        gcdTest(2147483647,0,0,0,2147483647);
        gcdTest(0,0,0,-2147483647,2147483647);
        gcdTest(0,0,0,-755,755);
        gcdTest(0,0,0,34,34);
        gcdTest(0,0,0,2147483647,2147483647);

        //Testcases for values, amount which are two 0
        gcdTest(0,-2147483647,0,0,2147483647);
        gcdTest(0,-6,0,0,6);
        gcdTest(0,56,0,0,56);
        gcdTest(0,2147483647,0,0,2147483647);
        gcdTest(0,-567,0,-567,567);
        gcdTest(1,0,1,0,1);
        gcdTest(89,89,0,0,89);
        gcdTest(0,2147483647,2147483647,0,2147483647);

        //Testcases for values, amount which is one 0
        gcdTest(0,-3,27,300,3);
        gcdTest(-45,0,15,150,15);
        gcdTest(-2147483648,-233, 0,55,1);
        gcdTest(345,5,15,0,5);
        gcdTest(56,2147483647, 77, 0,1);
        gcdTest(87,2147483647,0,2147483647,1);
        gcdTest(9,0,63,999,9);
        gcdTest(0,6,30,48,6);

        //Testcases for values, amount which are three 1
        gcdTest(-2147483647,1,1,1,1);
        gcdTest(1,-651,1,1,1);
        gcdTest(1,1,-23,1,1);
        gcdTest(1,1,1,234,1);
        gcdTest(1,1,456,1,1);
        gcdTest(1,2777,1,1,1);
        gcdTest(2147483647,1,1,1,1);
        gcdTest(1,2147483647,1,1,1);

        //Testcases for values, amount which are two 1
        gcdTest(1,845,344,1,1);
        gcdTest(8883,1,1,-2435,1);
        gcdTest(1,-23876,1,887,1);
        gcdTest(3,1,-85479,1,1);
        gcdTest(1,1,-873,34,1);
        gcdTest(-4536,256,1,1,1);
        gcdTest(7666,1,9,1,1);

        //Testcases for values, amount which is one 1
        gcdTest(1,-2147483648,234,325,1);
        gcdTest(65,1,45,887,1);
        gcdTest(-844,1,2147483647,44,1);
        gcdTest(98,634,1,3,1);
        gcdTest(-2147483648,1,34,55,1);
        gcdTest(2147483647,-2147483648,34,1,1);
        gcdTest(93,888,1,-39,1);
        gcdTest(1,-73,2147483647,2147483647,1);

        //Testcases for equal values
        gcdTest(-2147483647,-2147483647,-2147483647,-2147483647,2147483647);
        gcdTest(-67,-67,-67,-67,67);
        gcdTest(-1,-1,-1,-1,1);
        gcdTest(0,0,0,0,0);
        gcdTest(1,1,1,1,1);
        gcdTest(57,57,57,57,57);
        gcdTest(2147483647,2147483647,2147483647,2147483647,2147483647);

        //Testcases for negative values
        gcdTest(-2147483647,-2147483647,-2147483647,-2147483647,2147483647);
        gcdTest(-2345,-2,-677,-987,1);
        gcdTest(-18,-48,-54,-30,6);
        gcdTest(-34,-67,-45,-89,1);
        gcdTest(-25,-50,-625,-1000,25);
        gcdTest(-6,-60,-180,-12,6);
        gcdTest(-4,-8,-44,-444,4);
        gcdTest(-2,-4,-8,-64,2);

        //Testcases for positive values
        gcdTest(17,21,5,7,1);
        gcdTest(10,15,20,30,5);
        gcdTest(18,48,0,30,6);
        gcdTest(18,48,54,30,6);
        gcdTest(25,5,625,1000,5);
        gcdTest(8,2,4,12,2);
        gcdTest(37,45,89,48,1);
        gcdTest(2147483647,23,2147483647,34666,1);

        //Testcases for values with different sign
        gcdTest(-2,4,-8,10,2);
        gcdTest(25,-40,90,-135,5);
        gcdTest(18,48,-54,30,6);
        gcdTest(-2147483648,2147483647,2147483647,2147483647, 1);
        gcdTest(2147483647,2147483647, -2147483648,2147483647, 1);
        gcdTest(2147483647,-2147483648, -2147483648,2147483647, 1);
        gcdTest(2147483647,2147483647, -2147483648,-2147483648, 1);
        gcdTest(-2147483648,2147483647, -2147483648,-2147483648, 1);

        //Testcases for simple numbers
        gcdTest(2,7,11,29,1);
        gcdTest(59,53,101,173,1);
        gcdTest(-83,113,13,17,1);
        gcdTest(157,-199,61,31,1);
        gcdTest(19,47,79,37,1);
        gcdTest(23,97,163,191,1);
        gcdTest(197,97,157,109,1);
        gcdTest(61,59,19,23,1);

        //Testcases for mutually simple numbers
        gcdTest(55, 12, -78, 34, 1);
        gcdTest(55, 12,51,63,1);
        gcdTest(-78, 25,33,16, 1);
        gcdTest(125,4,77,87,1);
        gcdTest(303,100,27, 33,1);
        gcdTest(46, 63, 34, 55,1);
        gcdTest(68, 33,49, 95,1);

        //Testcases for values with one of them is result gcd
        gcdTest(4,16,20,48,4);
        gcdTest(4,16,56,80,4);
        gcdTest(100, 320,20,40,20);
        gcdTest(88, 11,33,55, 11);
        gcdTest(45, 15,60,90,15);
        gcdTest(34, 17,68,102,17);
        gcdTest(65,13,130,260,13);
    }

    /**
     * Check gcd of values, which return value 2147483648
     */
    @Test
    public void gcdOfFourWrong() {
        //All values are -2147483648
        gcdFail(-2147483648,-2147483648,-2147483648,-2147483648);

        //Testcase for values, amount which is one 0
        gcdFail(0,-2147483648, -2147483648,-2147483648);
        gcdFail(-2147483648, 0,-2147483648,-2147483648);
        gcdFail(-2147483648,-2147483648,0,-2147483648);
        gcdFail(-2147483648,-2147483648,-2147483648,0);

        //Testcase for values, amount which are two 0
        gcdFail(0,-2147483648, 0,-2147483648);
        gcdFail(-2147483648,0,0,-2147483648);
        gcdFail(-2147483648,-2147483648,0,0);
        gcdFail(0,-2147483648,-2147483648,0);

        //Testcase for values, amount which are three 0
        gcdFail(0,0,0,-2147483648);
        gcdFail(-2147483648,0,0,0);
        gcdFail(0,0,-2147483648,0);
        gcdFail(0,-2147483648,0,0);
    }

    /**
     * Testcase for check correct work of method GCD for two numbers
     * @param a     first number
     * @param b     second number
     * @param res   GCD of given numbers
     */
    private void gcdTest(int a, int b, int res) {
        assertEquals(res, GCD.gcd(a,b));
    }

    /**
     * Testcase for check correct work of method GCD for four numbers
     * @param a     first number
     * @param b     second number
     * @param c     third number
     * @param d     fourth number
     * @param res   GCD of given numbers
     */
    private void gcdTest(int a, int b, int c, int d, int res) {
        assertEquals(res, GCD.gcd(new int[] {a, b, c, d}));
    }

    /**
     * Testcase for check gcd of two values, which return value bigger than 2147483647
     * @param a     first value
     * @param b     second value
     */
    private void gcdFail(int a, int b) {
        try {
            GCD.gcd(a, b);
            fail("Result of gcd(" + a + ", " + b + ") was out of integers values");
        } catch (IllegalArgumentException e) {
            //expected
        }
    }

    /**
     * Testcase for check gcd of four values, which return value bigger than 2147483647
     * @param a     first value
     * @param b     second value
     * @param c     third value
     * @param d     fourth value
     */
    private void gcdFail(int a, int b, int c, int d) {
        try {
            GCD.gcd(new int[] {a, b, c, d});
            fail("Result of gcd(" + a + ", " + b + ", " + c + ", " + d + ") was out of integers values");
        } catch (IllegalArgumentException e) {
            //expected
        }
    }
}