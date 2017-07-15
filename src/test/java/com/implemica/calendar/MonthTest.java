package com.implemica.calendar;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Testcases for Month class.
 * @author Slavik Aleksey V.
 * @version v.1.0
 */
public class MonthTest {

    /**
     * Check correct work of method daysCount()
     */
    @Test
    public void daysCount() {
        daysCountTest(Month.JANUARY, 31);
        daysCountTest(Month.FEBRUARY, 29);
        daysCountTest(Month.MARCH, 31);
        daysCountTest(Month.APRIL, 30);
        daysCountTest(Month.MAY, 31);
        daysCountTest(Month.JUNE, 30);
        daysCountTest(Month.JULY, 31);
        daysCountTest(Month.AUGUST, 31);
        daysCountTest(Month.SEPTEMBER, 30);
        daysCountTest(Month.OCTOBER, 31);
        daysCountTest(Month.NOVEMBER, 30);
        daysCountTest(Month.DECEMBER, 31);
    }

    /**
     * Check correct month numbers
     */
    @Test
    public void getMonth() {
        assertEquals(0, Month.JANUARY.ordinal());
        assertEquals(1, Month.FEBRUARY.ordinal());
        assertEquals(2, Month.MARCH.ordinal());
        assertEquals(3, Month.APRIL.ordinal());
        assertEquals(4, Month.MAY.ordinal());
        assertEquals(5, Month.JUNE.ordinal());
        assertEquals(6, Month.JULY.ordinal());
        assertEquals(7, Month.AUGUST.ordinal());
        assertEquals(8, Month.SEPTEMBER.ordinal());
        assertEquals(9, Month.OCTOBER.ordinal());
        assertEquals(10, Month.NOVEMBER.ordinal());
        assertEquals(11, Month.DECEMBER.ordinal());
    }

    /**
     * Testcase for check correct work of method daysCount()
     * @param month     month of year
     * @param days      count of days in given month
     * @see Month
     */
    private void daysCountTest(Month month, int days) {
        assertEquals(days, month.daysCount());
    }

}