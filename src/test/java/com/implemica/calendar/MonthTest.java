package com.implemica.calendar;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Testcases for Month class.
 * @author Slavik Aleksey V.
 * @version v.1.0
 */
public class MonthTest {

    @Test
    public void daysCount() {
        assertTrue(Month.JANUARY.daysCount() == 31);
        assertTrue(Month.FEBRUARY.daysCount() == 29);
        assertTrue(Month.MARCH.daysCount() == 31);
        assertTrue(Month.APRIL.daysCount() == 30);
        assertTrue(Month.MAY.daysCount() == 31);
        assertTrue(Month.JUNE.daysCount() == 30);
        assertTrue(Month.JULY.daysCount() == 31);
        assertTrue(Month.AUGUST.daysCount() == 31);
        assertTrue(Month.SEPTEMBER.daysCount() == 30);
        assertTrue(Month.OCTOBER.daysCount() == 31);
        assertTrue(Month.NOVEMBER.daysCount() == 30);
        assertTrue(Month.DECEMBER.daysCount() == 31);
    }

    @Test
    public void getMonth() {
        assertTrue(Month.getMonth(0) == Month.JANUARY);
        assertTrue(Month.getMonth(1) == Month.FEBRUARY);
        assertTrue(Month.getMonth(2) == Month.MARCH);
        assertTrue(Month.getMonth(3) == Month.APRIL);
        assertTrue(Month.getMonth(4) == Month.MAY);
        assertTrue(Month.getMonth(5) == Month.JUNE);
        assertTrue(Month.getMonth(6) == Month.JULY);
        assertTrue(Month.getMonth(7) == Month.AUGUST);
        assertTrue(Month.getMonth(8) == Month.SEPTEMBER);
        assertTrue(Month.getMonth(9) == Month.OCTOBER);
        assertTrue(Month.getMonth(10) == Month.NOVEMBER);
        assertTrue(Month.getMonth(11) == Month.DECEMBER);
    }

    @Test (expected = IllegalArgumentException.class)
    public void wrongMonth() {
        Month.getMonth(-1);
        Month.getMonth(12);
    }
}