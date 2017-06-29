package com.implemica.house;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tastcases for House class
 * @author Slavik Aleksey V.
 * @version 1.0
 */
public class HouseTest {

    private House house;

    @Before
    public void init() {
        house = new House(9,4);
    }

    @After
    public void tearDown() {
        house = null;
    }

    @Test
    public void getEntrance() {
        assertTrue(house.getEntrance(1) == 1);
        assertTrue(house.getEntrance(36) == 1);
        assertTrue(house.getEntrance(37) == 2);
        assertTrue(house.getEntrance(72) == 2);
    }

    @Test (expected = IllegalArgumentException.class)
    public void getEntranceWrong() {
        house.getEntrance(0);
        house.getEntrance(-1);
    }

    @Test
    public void getLevel() {
        assertTrue(house.getLevel(1) == 1);
        assertTrue(house.getLevel(36) == 9);
        assertTrue(house.getLevel(37) == 1);
        assertTrue(house.getLevel(72) == 9);
    }

    @Test (expected = IllegalArgumentException.class)
    public void getLevelWrong() {
        house.getLevel(0);
        house.getLevel(-1);
    }
}