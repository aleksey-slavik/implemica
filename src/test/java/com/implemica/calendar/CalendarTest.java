package com.implemica.calendar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Testcases for Calendar class.
 * @author Slavik Aleksey V.
 * @version v.1.0
 */
public class CalendarTest {

    private Calendar calendar;

    @Before
    public void init() {
        calendar = new Calendar(Day.FRIDAY);
    }

    @After
    public void tearDown() {
        calendar = null;
    }

    @Test
    public void getDayOfYear() throws Exception {
        assertTrue(calendar.getDayOfYear(Month.JANUARY, 1) == Day.FRIDAY);
        assertTrue(calendar.getDayOfYear(Month.FEBRUARY, 23) == Day.TUESDAY);
        assertTrue(calendar.getDayOfYear(Month.MARCH, 8) == Day.TUESDAY);
        assertTrue(calendar.getDayOfYear(Month.MAY, 9) == Day.MONDAY);
        assertTrue(calendar.getDayOfYear(Month.AUGUST, 23) == Day.TUESDAY);
        assertTrue(calendar.getDayOfYear(Month.SEPTEMBER, 1) == Day.THURSDAY);
        assertTrue(calendar.getDayOfYear(Month.DECEMBER, 31) == Day.SATURDAY);
    }

    @Test (expected = IllegalArgumentException.class)
    public void wrongInputData() {
        calendar.getDayOfYear(Month.JANUARY, 0);
        calendar.getDayOfYear(Month.JANUARY, -1);
        calendar.getDayOfYear(Month.FEBRUARY, 30);
        calendar.getDayOfYear(Month.APRIL, 31);
        calendar.getDayOfYear(Month.JUNE, 31);
        calendar.getDayOfYear(Month.SEPTEMBER, 31);
        calendar.getDayOfYear(Month.NOVEMBER, 31);
    }
}