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
     * Check correct work of method getMonth()
     */
    @Test
    public void getMonth() {
        monthTest(0,Month.JANUARY);
        monthTest(1,Month.FEBRUARY);
        monthTest(2,Month.MARCH);
        monthTest(3,Month.APRIL);
        monthTest(4,Month.MAY);
        monthTest(5,Month.JUNE);
        monthTest(6,Month.JULY);
        monthTest(7,Month.AUGUST);
        monthTest(8,Month.SEPTEMBER);
        monthTest(9,Month.OCTOBER);
        monthTest(10,Month.NOVEMBER);
        monthTest(11,Month.DECEMBER);
    }

    /**
     * Check wrong input values for method getMonth()
     */
    @Test
    public void wrongMonth() {
        monthFail(-2147483648);
        monthFail(-775);
        monthFail(-62);
        monthFail(-1);
        monthFail(12);
        monthFail(566);
        monthFail(8766);
        monthFail(2147483647);
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

    /**
     * Testcase for check correct work of method getMonth()
     * @param number    number of month
     * @param month     actual month
     * @see Month
     */
    private void monthTest(int number, Month month) {
        assertEquals(month, Month.getMonth(number));
    }

    /**
     * Testcase for check wrong input values for method getMonth()
     * @param value     number of month
     */
    private void monthFail (int value) {
        try {
            Month.getMonth(value);
            fail("Number " + value + " of month must be in range from 0 to 11");
        } catch (IllegalArgumentException e) {
            //expected
        }
    }
}