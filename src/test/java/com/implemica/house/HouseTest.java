package com.implemica.house;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Testcases for House class
 * @author Slavik Aleksey V.
 * @version 1.0
 */
public class HouseTest {

    /**
     * Check correct work of methods getEntrance() and getLevel().
     * This methods return numbers of enter and level for given apartment number and house data(number of levels and number of flats per level)
      */
    @Test
    public void validateOutputData() {
        //House with 9 levels and 4 flats per level
        correctWorkTest(9,4,1,1,1);
        correctWorkTest(9,4,4,1,1);
        correctWorkTest(9,4,5,1,2);
        correctWorkTest(9,4,8,1,2);
        correctWorkTest(9,4,9,1,3);
        correctWorkTest(9,4,12,1,3);
        correctWorkTest(9,4,13,1,4);
        correctWorkTest(9,4,16,1,4);
        correctWorkTest(9,4,17,1,5);
        correctWorkTest(9,4,20,1,5);
        correctWorkTest(9,4,21,1,6);
        correctWorkTest(9,4,24,1,6);
        correctWorkTest(9,4,25,1,7);
        correctWorkTest(9,4,28,1,7);
        correctWorkTest(9,4,29,1,8);
        correctWorkTest(9,4,32,1,8);
        correctWorkTest(9,4,33,1,9);
        correctWorkTest(9,4,35,1,9);
        correctWorkTest(9,4,36,1,9);
        correctWorkTest(9,4,37,2,1);
        correctWorkTest(9,4,40,2,1);
        correctWorkTest(9,4,72,2,9);
        correctWorkTest(9,4,73,3,1);
        correctWorkTest(9,4,108,3,9);
        correctWorkTest(9,4,109,4,1);
        correctWorkTest(9,4,144,4,9);
        correctWorkTest(9,4,145,5,1);
        correctWorkTest(9,4,180,5,9);
        correctWorkTest(9,4,2147483647,59652324,5);

        //House with 4 levels and 3 flats per level
        correctWorkTest(4,3,1,1,1);
        correctWorkTest(4,3,3,1,1);
        correctWorkTest(4,3,4,1,2);
        correctWorkTest(4,3,6,1,2);
        correctWorkTest(4,3,7,1,3);
        correctWorkTest(4,3,9,1,3);
        correctWorkTest(4,3,10,1,4);
        correctWorkTest(4,3,12,1,4);
        correctWorkTest(4,3,13,2,1);
        correctWorkTest(4,3,24,2,4);
        correctWorkTest(4,3,25,3,1);
        correctWorkTest(4,3,36,3,4);

        //House with 1 level and 1 flat per level
        correctWorkTest(1,1,1,1,1);
        correctWorkTest(1,1,3,3,1);
        correctWorkTest(1,1,45,45,1);
        correctWorkTest(1,1,836,836,1);
        correctWorkTest(1,1,3453,3453,1);
        correctWorkTest(1,1,456744,456744,1);
        correctWorkTest(1,1,2147483647,2147483647,1);

        //House with 1 level and 2147483647 flats per level (levels * flats equal maximum of integer)
        correctWorkTest(1,2147483647,1,1,1);
        correctWorkTest(1,2147483647,10,1,1);
        correctWorkTest(1,2147483647,746,1,1);
        correctWorkTest(1,2147483647,3622,1,1);
        correctWorkTest(1,2147483647,933321,1,1);
        correctWorkTest(1,2147483647,2147483647,1,1);

        //House with 2147483647 levels and 1 flat per level (levels * flats equal maximum of integer)
        correctWorkTest(2147483647,1,1,1,1);
        correctWorkTest(2147483647,1,34,1,34);
        correctWorkTest(2147483647,1,836,1,836);
        correctWorkTest(2147483647,1,6654,1,6654);
        correctWorkTest(2147483647,1,984773,1,984773);
        correctWorkTest(2147483647,1,2147483647,1,2147483647);

        //House with 214748364 levels and 10 flats per level (levels * flats neither than maximum of integer)
        correctWorkTest(214748364,10,1,1,1);
        correctWorkTest(214748364,10,10,1,1);
        correctWorkTest(214748364,10,11,1,2);
        correctWorkTest(214748364,10,20,1,2);
        correctWorkTest(214748364,10,21,1,3);
        correctWorkTest(214748364,10,30,1,3);
        correctWorkTest(214748364,10,2147483631,1,214748364);
        correctWorkTest(214748364,10,2147483640,1,214748364);
        correctWorkTest(214748364,10,2147483641,2,1);
        correctWorkTest(214748364,10,2147483647,2,1);

        //House with 10 levels and 214748364 flats per level (levels * flats neither than maximum of integer)
        correctWorkTest(10,214748364,1,1,1);
        correctWorkTest(10,214748364,214748364,1,1);
        correctWorkTest(10,214748364,214748365,1,2);
        correctWorkTest(10,214748364,429496728,1,2);
        correctWorkTest(10,214748364,429496729,1,3);
        correctWorkTest(10,214748364,644245092,1,3);
        correctWorkTest(10,214748364,1932735277,1,10);
        correctWorkTest(10,214748364,2147483640,1,10);
        correctWorkTest(10,214748364,2147483641,2,1);
        correctWorkTest(10,214748364,2147483647,2,1);
    }

    /**
     * Check wrong input data for initializing House object
     */
    @Test
    public void initWrong() {
        //Testcases with zero number of flats per level
        initFail(-2147483648,0);
        initFail(-456,0);
        initFail(-12,0);
        initFail(0,0);
        initFail(10,0);
        initFail(2678,0);
        initFail(2147483647,0);

        //Testcases with zero number of levels
        initFail(0,-2147483648);
        initFail(0,-673);
        initFail(0,-34);
        initFail(0,10);
        initFail(0,349);
        initFail(0,7298);
        initFail(0,2147483647);

        //Testcases with negative values of levels and flats per level
        initFail(-1,-1);
        initFail(-23,-12);
        initFail(-938,-873);
        initFail(-2147483648,-6334);
        initFail(-377743,-2147483648);
        initFail(-2147483648,-2147483648);

        //Testcases with negative values of levels
        initFail(-1, 1);
        initFail(-23,46);
        initFail(-746, 56);
        initFail(-2147483648, 95565);
        initFail(-2147483648,2147483647);

        //Testcases with negative values of flats per level
        initFail(1,-1);
        initFail(73,-61);
        initFail(544,-379);
        initFail(7886,-2147483648);
        initFail(2147483647,-2147483648);

        //Testcases for input values, multiply of which is bigger than 2147483647
        initFail(2,2147483647);
        initFail(2,1073741824);
        initFail(10,214748365);
        initFail(11,214748364);
        initFail(214748364,11);
        initFail(214748365, 10);
        initFail(1073741824,2);
        initFail(2147483647,2);
    }

    /**
     * Check wrong input apartment value
     */
    @Test
    public void inputWrong() {
        apartFail(9,4,0);
        apartFail(9,4,-1);
        apartFail(1,1,-20);
        apartFail(2147483647,1,-334);
        apartFail(1,2147483647, -2147483648);
    }

    /**
     * Check correct work of toString() method
     */
    @Test
    public void toStringTest() {
        toStringTest(1, 1, "levels = 1, flats = 1");
        toStringTest(1, 23, "levels = 1, flats = 23");
        toStringTest(1, 1776, "levels = 1, flats = 1776");
        toStringTest(1, 9879877, "levels = 1, flats = 9879877");
        toStringTest(1, 2147483647, "levels = 1, flats = 2147483647");

        toStringTest(2, 1, "levels = 2, flats = 1");
        toStringTest(73,1, "levels = 73, flats = 1");
        toStringTest(672, 1, "levels = 672, flats = 1");
        toStringTest(87647,1, "levels = 87647, flats = 1");
        toStringTest(2147483647,1,"levels = 2147483647, flats = 1");

        toStringTest(93368854,23, "levels = 93368854, flats = 23");
        toStringTest(23, 93368854, "levels = 23, flats = 93368854");
        toStringTest(214748364, 10, "levels = 214748364, flats = 10");
        toStringTest(10,214748364, "levels = 10, flats = 214748364");
        toStringTest(136983, 15677, "levels = 136983, flats = 15677");

        toStringTest(78,33,"levels = 78, flats = 33");
        toStringTest(23877, 758,"levels = 23877, flats = 758");
        toStringTest(4557, 98775,"levels = 4557, flats = 98775");
        toStringTest(84338, 666,"levels = 84338, flats = 666");
        toStringTest(562, 87772,"levels = 562, flats = 87772");
    }

    /**
     * Testcase for check work of methods getEntrance() and getLevel()
     * @param lvls  count of levels in house
     * @param flats count of flats per level in house
     * @param apt   number of apartment
     * @param enter number of enter for given apartment
     * @param lvl   number of level for given apartment
     */
    private void correctWorkTest(int lvls, int flats, int apt, int enter, int lvl) {
        House house = new House(lvls, flats);
        assertEquals(lvls, house.getLevels());
        assertEquals(flats, house.getFlats());
        assertEquals(enter, house.getEntrance(apt));
        assertEquals(lvl, house.getLevel(apt));
    }

    /**
     * Testcase for check wrong input data for initializing House object
     * @param lvls  count of levels in house
     * @param flats count of flats per level in house
     */
    private void initFail(int lvls, int flats) {
        try {
            new House(lvls, flats);
            fail("Number of levels (" + lvls + ") or number flats per level (" + flats + ") of house is a negative integer." +
                    " Or product of levels and flats are more than 2147483647");
        } catch (IllegalArgumentException e) {
            //expected
        }
    }

    /**
     * Testcase for check wrong input apartment value
     * @param lvls  count of levels in house
     * @param flats count of flats per level in house
     * @param apt   number of apartment
     */
    private void apartFail(int lvls, int flats, int apt) {
        House house = new House(lvls, flats);
        try {
            house.getEntrance(apt);
            fail("Number " + apt + " of apartment must be a positive integer in method getEntrance()");
        } catch (IllegalArgumentException e) {
            //expected
        }
        try {
            house.getLevel(apt);
            fail("Number " + apt + " of apartment must be a positive integer in method getLevel()");
        } catch (IllegalArgumentException e) {
            //expected
        }
    }

    /**
     * Testcase for check correct work of toString() method
     * @param levels    count of levels in house
     * @param flats     count of flats per level in house
     * @param expectedMessage   expected message
     */
    private void toStringTest(int levels, int flats, String expectedMessage) {
        House house = new House(levels, flats);
        assertEquals(levels, house.getLevels());
        assertEquals(flats, house.getFlats());
        assertEquals(expectedMessage, house.toString());
    }
}