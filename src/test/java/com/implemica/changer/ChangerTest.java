package com.implemica.changer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Testcases for Changer class.
 * @author Slavik Aleksey V.
 * @version 1.0
 */
public class ChangerTest {

    Changer case1, case2, case3;

    @Before
    public void init() {
        case1 = new Changer(10,-5);
        case2 = new Changer(0,3);
        case3 = new Changer(2,3);
    }

    @After
    public void tearDown() {
        case1 = null;
        case2 = null;
        case3 = null;
    }

    @Test
    public void change() {
        case1.change();
        assertTrue(case1.equals(new Changer(-5,10)));
        case2.change();
        assertTrue(case2.equals(new Changer(3,0)));
        case3.change();
        assertTrue(case3.equals(new Changer(3,2)));
    }

    @Test
    public void changeXOR() {
        case1.changeXOR();
        assertTrue(case1.equals(new Changer(-5,10)));
        case2.changeXOR();
        assertTrue(case2.equals(new Changer(3,0)));
        case3.changeXOR();
        assertTrue(case3.equals(new Changer(3,2)));
    }
}