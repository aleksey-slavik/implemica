package com.implemica.calendar;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Testcases for Day class.
 * @author Slavik Aleksey V.
 * @version v.1.0
 */
public class DayTest {

    /**
     * Check correct work of method getDay()
     */
    @Test
    public void getDay() {
        dayTest(0, Day.MONDAY);
        dayTest(1, Day.TUESDAY);
        dayTest(2, Day.WEDNESDAY);
        dayTest(3, Day.THURSDAY);
        dayTest(4, Day.FRIDAY);
        dayTest(5, Day.SATURDAY);
        dayTest(6, Day.SUNDAY);
    }

    /**
     * Check wrong input number of day of the week
     */
    @Test
    public void getWrongDay() {
        dayFail(-2147483648);
        dayFail(-456);
        dayFail(-23);
        dayFail(-1);
        dayFail(7);
        dayFail(63);
        dayFail(8993);
        dayFail(2147483647);
    }

    /**
     * Testcase for check correct work of method getDay()
     * @param number    number of day of the week
     * @param day       actual day of the week
     * @see Day
     */
    private void dayTest(int number, Day day) {
        assertEquals(day, Day.getDay(number));
    }

    /**
     * Testcase for check wrong input number of day of the week
     * @param value     number of day od the week
     */
    private void dayFail(int value) {
        try {
            Day.getDay(value);
            fail("Number " + value + " of day must be in range from 0 to 6");
        } catch (IllegalArgumentException e) {
            //expected
        }
    }
}