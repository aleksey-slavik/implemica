package com.implemica.changer;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Testcases for Changer class.
 * @author Slavik Aleksey V.
 * @version 1.0
 */
public class ChangerTest {

    /**
     * Check correct work of methods change(), changeXOR() and toString() of Changer class.
     * Methods was swap two input values
     */
    @Test
    public void logicTest() {
        //Testcases for values with zero
        changeTest(0,0);
        changeTest(0,3);
        changeTest(0,100);
        changeTest(0,-38);
        changeTest(0,-2147483648);
        changeTest(0,2147483647);
        changeTest(1,0);
        changeTest(45,0);
        changeTest(2147483647, 0);

        //Testcases for values with different sign
        changeTest(10, -5);
        changeTest(475, -123);
        changeTest(2147483647, -30);
        changeTest(-40, 12);
        changeTest(-549, 34);
        changeTest(-2147483648, 6427);

        //Testcases for positive values
        changeTest(2, 3);
        changeTest(12,465);
        changeTest(674,62);
        changeTest(6473,98989);
        changeTest(76873,4533);
        changeTest(2147483647,75);
        changeTest(33,2147483647);

        //Testcases for negative values
        changeTest(-5,-10);
        changeTest(-345,-4);
        changeTest(-908, -88);
        changeTest(-56,-778);
        changeTest(-87655,-2147483648);
        changeTest(-2147483648, -2);

        //Testcases for equal values
        changeTest(5,5);
        changeTest(-5,-5);
        changeTest(-5,5);
        changeTest(5,-5);
        changeTest(14600, 14600);
        changeTest(-645, 645);
        changeTest(8543,-8543);
        changeTest(712,-712);

        //Testcases for combinations of maximum and minimum of integer
        changeTest(2147483647, -2147483648);
        changeTest(2147483647,2147483647);
        changeTest(-2147483648, -2147483648);
        changeTest(-2147483648, 2147483647);
    }

    /**
     * Check correct work of toString() method
     */
    @Test
    public void toStringTest() {
        toStringTest(0,0,"a = 0, b = 0");
        toStringTest(0,100,"a = 0, b = 100");
        toStringTest(0,-2147483648,"a = 0, b = -2147483648");
        toStringTest(0,2147483647,"a = 0, b = 2147483647");
        toStringTest(2147483647, 0,"a = 2147483647, b = 0");

        toStringTest(2147483647, -30,"a = 2147483647, b = -30");
        toStringTest(-40, 12,"a = -40, b = 12");
        toStringTest(-549, 34,"a = -549, b = 34");
        toStringTest(-2147483648, 6427,"a = -2147483648, b = 6427");

        toStringTest(6473,98989,"a = 6473, b = 98989");
        toStringTest(76873,4533,"a = 76873, b = 4533");
        toStringTest(2147483647,75,"a = 2147483647, b = 75");
        toStringTest(33,2147483647,"a = 33, b = 2147483647");

        toStringTest(-908, -88,"a = -908, b = -88");
        toStringTest(-56,-778,"a = -56, b = -778");
        toStringTest(-87655,-2147483648,"a = -87655, b = -2147483648");
        toStringTest(-2147483648, -2,"a = -2147483648, b = -2");
    }

    /**
     * Testcase for check correct work of methods change(), changeXOR() and toString()
     * @param a first value
     * @param b second value
     */
    private void changeTest(int a, int b) {
        Changer input = new Changer(a, b);
        checkStatement(input, a, b);
        input.change();
        checkStatement(input, b, a);
        input = new Changer(a, b);
        checkStatement(input, a, b);
        input.changeXOR();
        checkStatement(input, b, a);
    }

    /**
     * Check statement of Changer object
     * @param changer   object
     * @param a         first value
     * @param b         second value
     */
    private void checkStatement(Changer changer, int a, int b) {
        assertEquals(a, changer.getA());
        assertEquals(b, changer.getB());
    }

    /**
     * Testcase for check correct work of toString() method
     * @param a         first value
     * @param b         second value
     * @param message   actual message
     */
    private void toStringTest(int a, int b, String message) {
        Changer input = new Changer(a, b);
        checkStatement(input, a, b);
        assertEquals(message, input.toString());
    }
}