package com.implemica.calendar;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Testcases for Day class.
 * @author Slavik Aleksey V.
 * @version v.1.0
 */
public class DayTest {

    @Test
    public void getDay() {
        assertTrue(Day.getDay(0) == Day.MONDAY);
        assertTrue(Day.getDay(1) == Day.TUESDAY);
        assertTrue(Day.getDay(2) == Day.WEDNESDAY);
        assertTrue(Day.getDay(3) == Day.THURSDAY);
        assertTrue(Day.getDay(4) == Day.FRIDAY);
        assertTrue(Day.getDay(5) == Day.SATURDAY);
        assertTrue(Day.getDay(6) == Day.SUNDAY);
    }

    @Test (expected = IllegalArgumentException.class)
    public void getWrongDay() {
        Day.getDay(-1);
        Day.getDay(7);
    }
}