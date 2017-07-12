package com.implemica.calendar;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Testcases for Calendar class.
 * @author Slavik Aleksey V.
 * @version v.1.0
 */
public class CalendarTest {

    /**
     * Check work of method getDayOfYear(nyDay, month, day).
     * Method return day of week for given date(month and day) and New Year day of the year
     */
    @Test
    public void getDayOfYear() {
        //New Year day is friday. For example, 2016
        dayOfYearTest(Day.FRIDAY, Month.JANUARY, 1, Day.FRIDAY);
        dayOfYearTest(Day.FRIDAY, Month.JANUARY, 31, Day.SUNDAY);
        dayOfYearTest(Day.FRIDAY, Month.FEBRUARY, 1, Day.MONDAY);
        dayOfYearTest(Day.FRIDAY, Month.FEBRUARY, 22, Day.MONDAY);
        dayOfYearTest(Day.FRIDAY, Month.FEBRUARY, 28, Day.SUNDAY);
        dayOfYearTest(Day.FRIDAY, Month.FEBRUARY, 29, Day.MONDAY);
        dayOfYearTest(Day.FRIDAY, Month.MARCH, 6, Day.SUNDAY);
        dayOfYearTest(Day.FRIDAY, Month.MARCH, 7, Day.MONDAY);
        dayOfYearTest(Day.FRIDAY, Month.APRIL, 1, Day.FRIDAY);
        dayOfYearTest(Day.FRIDAY, Month.APRIL, 17, Day.SUNDAY);
        dayOfYearTest(Day.FRIDAY, Month.MAY,1,Day.SUNDAY);
        dayOfYearTest(Day.FRIDAY, Month.MAY, 9, Day.MONDAY);
        dayOfYearTest(Day.FRIDAY, Month.MAY, 31, Day.TUESDAY);
        dayOfYearTest(Day.FRIDAY, Month.JUNE, 5, Day.SUNDAY);
        dayOfYearTest(Day.FRIDAY, Month.JUNE, 6, Day.MONDAY);
        dayOfYearTest(Day.FRIDAY, Month.JULY, 11, Day.MONDAY);
        dayOfYearTest(Day.FRIDAY, Month.JULY, 17, Day.SUNDAY);
        dayOfYearTest(Day.FRIDAY, Month.AUGUST, 1, Day.MONDAY);
        dayOfYearTest(Day.FRIDAY, Month.AUGUST,31, Day.WEDNESDAY);
        dayOfYearTest(Day.FRIDAY, Month.SEPTEMBER, 13, Day.TUESDAY);
        dayOfYearTest(Day.FRIDAY, Month.SEPTEMBER, 22, Day.THURSDAY);
        dayOfYearTest(Day.FRIDAY, Month.OCTOBER, 8, Day.SATURDAY);
        dayOfYearTest(Day.FRIDAY, Month.OCTOBER, 31, Day.MONDAY);
        dayOfYearTest(Day.FRIDAY, Month.NOVEMBER, 9, Day.WEDNESDAY);
        dayOfYearTest(Day.FRIDAY, Month.NOVEMBER, 27, Day.SUNDAY);
        dayOfYearTest(Day.FRIDAY, Month.DECEMBER, 1, Day.THURSDAY);
        dayOfYearTest(Day.FRIDAY, Month.DECEMBER, 31, Day.SATURDAY);

        //New Year day is sunday. For example, 2012
        dayOfYearTest(Day.SUNDAY, Month.JANUARY,1, Day.SUNDAY);
        dayOfYearTest(Day.SUNDAY, Month.JANUARY, 2, Day.MONDAY);
        dayOfYearTest(Day.SUNDAY, Month.JANUARY, 8, Day.SUNDAY);
        dayOfYearTest(Day.SUNDAY, Month.JANUARY,25, Day.WEDNESDAY);
        dayOfYearTest(Day.SUNDAY, Month.JANUARY, 31, Day.TUESDAY);
        dayOfYearTest(Day.SUNDAY, Month.FEBRUARY, 6, Day.MONDAY);
        dayOfYearTest(Day.SUNDAY, Month.FEBRUARY, 12, Day.SUNDAY);
        dayOfYearTest(Day.SUNDAY, Month.MARCH,11, Day.SUNDAY);
        dayOfYearTest(Day.SUNDAY, Month.MARCH, 12, Day.MONDAY);
        dayOfYearTest(Day.SUNDAY, Month.APRIL, 1, Day.SUNDAY);
        dayOfYearTest(Day.SUNDAY, Month.APRIL, 30, Day.MONDAY);
        dayOfYearTest(Day.SUNDAY, Month.MAY, 1, Day.TUESDAY);
        dayOfYearTest(Day.SUNDAY, Month.MAY, 31, Day.THURSDAY);
        dayOfYearTest(Day.SUNDAY, Month.JUNE, 13, Day.WEDNESDAY);
        dayOfYearTest(Day.SUNDAY, Month.JUNE, 23, Day.SATURDAY);
        dayOfYearTest(Day.SUNDAY, Month.JULY, 24, Day.TUESDAY);
        dayOfYearTest(Day.SUNDAY, Month.JULY, 31, Day.TUESDAY);
        dayOfYearTest(Day.SUNDAY, Month.AUGUST, 10, Day.FRIDAY);
        dayOfYearTest(Day.SUNDAY, Month.AUGUST, 25, Day.SATURDAY);
        dayOfYearTest(Day.SUNDAY, Month.SEPTEMBER, 2, Day.SUNDAY);
        dayOfYearTest(Day.SUNDAY, Month.SEPTEMBER, 3, Day.MONDAY);
        dayOfYearTest(Day.SUNDAY, Month.OCTOBER, 1, Day.MONDAY);
        dayOfYearTest(Day.SUNDAY, Month.OCTOBER,8, Day.MONDAY);
        dayOfYearTest(Day.SUNDAY, Month.OCTOBER, 31, Day.WEDNESDAY);
        dayOfYearTest(Day.SUNDAY, Month.NOVEMBER, 17, Day.SATURDAY);
        dayOfYearTest(Day.SUNDAY, Month.NOVEMBER, 27, Day.TUESDAY);
        dayOfYearTest(Day.SUNDAY, Month.DECEMBER,1, Day.SATURDAY);
        dayOfYearTest(Day.SUNDAY, Month.DECEMBER,31, Day.MONDAY);

        //New Year day is tuesday. For example, 2008
        dayOfYearTest(Day.TUESDAY, Month.JANUARY,1, Day.TUESDAY);
        dayOfYearTest(Day.TUESDAY, Month.JANUARY,31, Day.THURSDAY);
        dayOfYearTest(Day.TUESDAY, Month.FEBRUARY,1, Day.FRIDAY);
        dayOfYearTest(Day.TUESDAY, Month.FEBRUARY,29, Day.FRIDAY);
        dayOfYearTest(Day.TUESDAY, Month.MARCH, 8, Day.SATURDAY);
        dayOfYearTest(Day.TUESDAY, Month.MARCH, 31, Day.MONDAY);
        dayOfYearTest(Day.TUESDAY, Month.APRIL, 1, Day.TUESDAY);
        dayOfYearTest(Day.TUESDAY, Month.APRIL, 21, Day.MONDAY);
        dayOfYearTest(Day.TUESDAY, Month.MAY, 9, Day.FRIDAY);
        dayOfYearTest(Day.TUESDAY, Month.MAY, 31, Day.SATURDAY);
        dayOfYearTest(Day.TUESDAY, Month.JUNE, 1, Day.SUNDAY);
        dayOfYearTest(Day.TUESDAY, Month.JUNE, 30, Day.MONDAY);
        dayOfYearTest(Day.TUESDAY, Month.JULY, 6, Day.SUNDAY);
        dayOfYearTest(Day.TUESDAY, Month.JULY, 7, Day.MONDAY);
        dayOfYearTest(Day.TUESDAY, Month.JULY, 31, Day.THURSDAY);
        dayOfYearTest(Day.TUESDAY, Month.AUGUST, 24, Day.SUNDAY);
        dayOfYearTest(Day.TUESDAY, Month.AUGUST, 25, Day.MONDAY);
        dayOfYearTest(Day.TUESDAY, Month.SEPTEMBER, 15, Day.MONDAY);
        dayOfYearTest(Day.TUESDAY, Month.SEPTEMBER, 30, Day.TUESDAY);
        dayOfYearTest(Day.TUESDAY, Month.OCTOBER, 8, Day.WEDNESDAY);
        dayOfYearTest(Day.TUESDAY, Month.OCTOBER, 17, Day.FRIDAY);
        dayOfYearTest(Day.TUESDAY, Month.NOVEMBER, 1, Day.SATURDAY);
        dayOfYearTest(Day.TUESDAY, Month.NOVEMBER, 30, Day.SUNDAY);
        dayOfYearTest(Day.TUESDAY, Month.DECEMBER, 1, Day.MONDAY);
        dayOfYearTest(Day.TUESDAY,Month.DECEMBER,31,Day.WEDNESDAY);

        //New Year day is thursday. For example, 2004
        dayOfYearTest(Day.THURSDAY, Month.JANUARY, 1, Day.THURSDAY);
        dayOfYearTest(Day.THURSDAY, Month.JANUARY, 31, Day.SATURDAY);
        dayOfYearTest(Day.THURSDAY, Month.FEBRUARY, 1, Day.SUNDAY);
        dayOfYearTest(Day.THURSDAY, Month.FEBRUARY, 2, Day.MONDAY);
        dayOfYearTest(Day.THURSDAY, Month.FEBRUARY, 8, Day.SUNDAY);
        dayOfYearTest(Day.THURSDAY, Month.FEBRUARY, 29, Day.SUNDAY);
        dayOfYearTest(Day.THURSDAY, Month.MARCH, 1, Day.MONDAY);
        dayOfYearTest(Day.THURSDAY, Month.MARCH, 7, Day.SUNDAY);
        dayOfYearTest(Day.THURSDAY, Month.APRIL, 13, Day.TUESDAY);
        dayOfYearTest(Day.THURSDAY, Month.APRIL, 24, Day.SATURDAY);
        dayOfYearTest(Day.THURSDAY, Month.MAY, 9, Day.SUNDAY);
        dayOfYearTest(Day.THURSDAY, Month.MAY, 31, Day.MONDAY);
        dayOfYearTest(Day.THURSDAY, Month.JUNE, 13, Day.SUNDAY);
        dayOfYearTest(Day.THURSDAY, Month.JUNE, 14, Day.MONDAY);
        dayOfYearTest(Day.THURSDAY, Month.JULY, 1, Day.THURSDAY);
        dayOfYearTest(Day.THURSDAY, Month.JULY, 31, Day.SATURDAY);
        dayOfYearTest(Day.THURSDAY, Month.AUGUST, 11, Day.WEDNESDAY);
        dayOfYearTest(Day.THURSDAY, Month.AUGUST, 24, Day.TUESDAY);
        dayOfYearTest(Day.THURSDAY, Month.SEPTEMBER, 15, Day.WEDNESDAY);
        dayOfYearTest(Day.THURSDAY, Month.SEPTEMBER, 27, Day.MONDAY);
        dayOfYearTest(Day.THURSDAY, Month.OCTOBER, 8, Day.FRIDAY);
        dayOfYearTest(Day.THURSDAY, Month.OCTOBER, 23, Day.SATURDAY);
        dayOfYearTest(Day.THURSDAY, Month.NOVEMBER, 9, Day.TUESDAY);
        dayOfYearTest(Day.THURSDAY, Month.NOVEMBER, 25, Day.THURSDAY);
        dayOfYearTest(Day.THURSDAY, Month.DECEMBER,1 , Day.WEDNESDAY);
        dayOfYearTest(Day.THURSDAY, Month.DECEMBER, 31, Day.FRIDAY);

        //New Year day is saturday. For example, 2000
        dayOfYearTest(Day.SATURDAY, Month.JANUARY, 1, Day.SATURDAY);
        dayOfYearTest(Day.SATURDAY, Month.JANUARY, 31, Day.MONDAY);
        dayOfYearTest(Day.SATURDAY, Month.FEBRUARY, 6, Day.SUNDAY);
        dayOfYearTest(Day.SATURDAY, Month.FEBRUARY, 7, Day.MONDAY);
        dayOfYearTest(Day.SATURDAY, Month.MARCH, 8, Day.WEDNESDAY);
        dayOfYearTest(Day.SATURDAY, Month.MARCH, 31, Day.FRIDAY);
        dayOfYearTest(Day.SATURDAY, Month.APRIL, 25, Day.TUESDAY);
        dayOfYearTest(Day.SATURDAY, Month.APRIL, 30, Day.SUNDAY);
        dayOfYearTest(Day.SATURDAY, Month.MAY, 1, Day.MONDAY);
        dayOfYearTest(Day.SATURDAY, Month.MAY, 31, Day.WEDNESDAY);
        dayOfYearTest(Day.SATURDAY, Month.JUNE, 13, Day.TUESDAY);
        dayOfYearTest(Day.SATURDAY, Month.JUNE, 23, Day.FRIDAY);
        dayOfYearTest(Day.SATURDAY, Month.JULY, 16, Day.SUNDAY);
        dayOfYearTest(Day.SATURDAY, Month.JULY, 17, Day.MONDAY);
        dayOfYearTest(Day.SATURDAY, Month.AUGUST, 13, Day.SUNDAY);
        dayOfYearTest(Day.SATURDAY, Month.AUGUST, 24, Day.THURSDAY);
        dayOfYearTest(Day.SATURDAY, Month.SEPTEMBER, 15, Day.FRIDAY);
        dayOfYearTest(Day.SATURDAY, Month.SEPTEMBER, 20, Day.WEDNESDAY);
        dayOfYearTest(Day.SATURDAY, Month.OCTOBER, 8, Day.SUNDAY);
        dayOfYearTest(Day.SATURDAY, Month.OCTOBER, 24, Day.TUESDAY);
        dayOfYearTest(Day.SATURDAY, Month.NOVEMBER, 17, Day.FRIDAY);
        dayOfYearTest(Day.SATURDAY, Month.NOVEMBER, 20, Day.MONDAY);
        dayOfYearTest(Day.SATURDAY, Month.DECEMBER, 1, Day.FRIDAY);
        dayOfYearTest(Day.SATURDAY, Month.DECEMBER, 31, Day.SUNDAY);

        //New Year day is monday. For example, 1996
        dayOfYearTest(Day.MONDAY, Month.JANUARY, 1, Day.MONDAY);
        dayOfYearTest(Day.MONDAY, Month.JANUARY, 31, Day.WEDNESDAY);
        dayOfYearTest(Day.MONDAY, Month.FEBRUARY, 6, Day.TUESDAY);
        dayOfYearTest(Day.MONDAY, Month.FEBRUARY, 23, Day.FRIDAY);
        dayOfYearTest(Day.MONDAY, Month.MARCH, 10, Day.SUNDAY);
        dayOfYearTest(Day.MONDAY, Month.MARCH, 11, Day.MONDAY);
        dayOfYearTest(Day.MONDAY, Month.APRIL, 1, Day.MONDAY);
        dayOfYearTest(Day.MONDAY, Month.APRIL, 7, Day.SUNDAY);
        dayOfYearTest(Day.MONDAY, Month.MAY, 9, Day.THURSDAY);
        dayOfYearTest(Day.MONDAY, Month.MAY, 17, Day.FRIDAY);
        dayOfYearTest(Day.MONDAY, Month.JUNE, 13, Day.THURSDAY);
        dayOfYearTest(Day.MONDAY, Month.JUNE, 30, Day.SUNDAY);
        dayOfYearTest(Day.MONDAY, Month.JULY, 1, Day.MONDAY);
        dayOfYearTest(Day.MONDAY, Month.JULY, 27, Day.SATURDAY);
        dayOfYearTest(Day.MONDAY, Month.AUGUST, 7, Day.WEDNESDAY);
        dayOfYearTest(Day.MONDAY, Month.AUGUST, 31, Day.SATURDAY);
        dayOfYearTest(Day.MONDAY, Month.SEPTEMBER, 1, Day.SUNDAY);
        dayOfYearTest(Day.MONDAY, Month.SEPTEMBER, 30, Day.MONDAY);
        dayOfYearTest(Day.MONDAY, Month.OCTOBER, 8, Day.TUESDAY);
        dayOfYearTest(Day.MONDAY, Month.OCTOBER, 31, Day.THURSDAY);
        dayOfYearTest(Day.MONDAY, Month.NOVEMBER, 4, Day.MONDAY);
        dayOfYearTest(Day.MONDAY, Month.NOVEMBER, 10, Day.SUNDAY);
        dayOfYearTest(Day.MONDAY, Month.NOVEMBER, 11, Day.MONDAY);
        dayOfYearTest(Day.MONDAY, Month.DECEMBER, 1, Day.SUNDAY);
        dayOfYearTest(Day.MONDAY, Month.DECEMBER, 25, Day.WEDNESDAY);
        dayOfYearTest(Day.MONDAY, Month.DECEMBER, 31, Day.TUESDAY);

        //New Year day is wednesday. For example, 1992
        dayOfYearTest(Day.WEDNESDAY, Month.JANUARY, 1, Day.WEDNESDAY);
        dayOfYearTest(Day.WEDNESDAY, Month.JANUARY, 31, Day.FRIDAY);
        dayOfYearTest(Day.WEDNESDAY, Month.FEBRUARY, 6, Day.THURSDAY);
        dayOfYearTest(Day.WEDNESDAY, Month.FEBRUARY, 23, Day.SUNDAY);
        dayOfYearTest(Day.WEDNESDAY, Month.MARCH, 8, Day.SUNDAY);
        dayOfYearTest(Day.WEDNESDAY, Month.MARCH,9,Day.MONDAY);
        dayOfYearTest(Day.WEDNESDAY, Month.APRIL, 13, Day.MONDAY);
        dayOfYearTest(Day.WEDNESDAY, Month.APRIL, 19, Day.SUNDAY);
        dayOfYearTest(Day.WEDNESDAY, Month.MAY, 4, Day.MONDAY);
        dayOfYearTest(Day.WEDNESDAY, Month.MAY, 31, Day.SUNDAY);
        dayOfYearTest(Day.WEDNESDAY, Month.JUNE, 14, Day.SUNDAY);
        dayOfYearTest(Day.WEDNESDAY, Month.JUNE, 15, Day.MONDAY);
        dayOfYearTest(Day.WEDNESDAY, Month.JUNE, 21, Day.SUNDAY);
        dayOfYearTest(Day.WEDNESDAY, Month.JULY, 21, Day.TUESDAY);
        dayOfYearTest(Day.WEDNESDAY, Month.JULY, 30, Day.THURSDAY);
        dayOfYearTest(Day.WEDNESDAY, Month.AUGUST, 1,Day.SATURDAY);
        dayOfYearTest(Day.WEDNESDAY, Month.AUGUST, 31, Day.MONDAY);
        dayOfYearTest(Day.WEDNESDAY, Month.SEPTEMBER, 15, Day.TUESDAY);
        dayOfYearTest(Day.WEDNESDAY, Month.SEPTEMBER, 21, Day.MONDAY);
        dayOfYearTest(Day.WEDNESDAY, Month.OCTOBER, 8, Day.THURSDAY);
        dayOfYearTest(Day.WEDNESDAY, Month.OCTOBER, 31, Day.SATURDAY);
        dayOfYearTest(Day.WEDNESDAY, Month.NOVEMBER, 13, Day.FRIDAY);
        dayOfYearTest(Day.WEDNESDAY, Month.NOVEMBER, 30, Day.MONDAY);
        dayOfYearTest(Day.WEDNESDAY, Month.DECEMBER, 1, Day.TUESDAY);
        dayOfYearTest(Day.WEDNESDAY, Month.DECEMBER, 31, Day.THURSDAY);
    }

    /**
     * Check wrong input day of month
     */
    @Test
    public void wrongInputData() {
        //New Year day is friday. For example, 2016
        dayOfYearFail(Day.FRIDAY, Month.JANUARY, -1);
        dayOfYearFail(Day.FRIDAY, Month.JANUARY, 0);
        dayOfYearFail(Day.FRIDAY, Month.FEBRUARY, 30);
        dayOfYearFail(Day.FRIDAY, Month.AUGUST, -23655);
        dayOfYearFail(Day.FRIDAY, Month.SEPTEMBER, -2147483648);
        dayOfYearFail(Day.FRIDAY, Month.NOVEMBER, 2147483647);

        //New Year day is monday. For example, 1996
        dayOfYearFail(Day.MONDAY, Month.FEBRUARY, 30);
        dayOfYearFail(Day.MONDAY, Month.APRIL, 31);
        dayOfYearFail(Day.MONDAY, Month.MAY, -345);
        dayOfYearFail(Day.MONDAY, Month.JUNE, 31);
        dayOfYearFail(Day.MONDAY, Month.AUGUST, 7888);
        dayOfYearFail(Day.MONDAY, Month.SEPTEMBER, 2147483647);
        dayOfYearFail(Day.MONDAY, Month.NOVEMBER, -2147483648);

        //New Year day is wednesday. For example, 1992
        dayOfYearFail(Day.WEDNESDAY, Month.JANUARY, -8766);
        dayOfYearFail(Day.WEDNESDAY, Month.FEBRUARY, 30);
        dayOfYearFail(Day.WEDNESDAY, Month.MAY, -2147483648);
        dayOfYearFail(Day.WEDNESDAY, Month.SEPTEMBER, 31);
        dayOfYearFail(Day.WEDNESDAY, Month.NOVEMBER, 31);
        dayOfYearFail(Day.WEDNESDAY, Month.DECEMBER, 2147483647);

        //New Year day is sunday. For example, 2012
        dayOfYearFail(Day.SUNDAY, Month.FEBRUARY, 30);
        dayOfYearFail(Day.SUNDAY, Month.MAY, -2147483648);
        dayOfYearFail(Day.SUNDAY, Month.AUGUST, 677);
        dayOfYearFail(Day.SUNDAY, Month.NOVEMBER, 2147483647);
        dayOfYearFail(Day.SUNDAY, Month.DECEMBER, -223);

        //New Year day is tuesday. For example, 2008
        dayOfYearFail(Day.TUESDAY, Month.FEBRUARY, 30);
        dayOfYearFail(Day.TUESDAY, Month.MAY, 123);
        dayOfYearFail(Day.TUESDAY, Month.JUNE, 2147483647);
        dayOfYearFail(Day.TUESDAY, Month.JULY, -2147483648);
        dayOfYearFail(Day.TUESDAY, Month.NOVEMBER, 0);

        //New Year day is saturday. For example, 2000
        dayOfYearFail(Day.SATURDAY, Month.FEBRUARY, 30);
        dayOfYearFail(Day.SATURDAY, Month.JUNE, 2147483647);
        dayOfYearFail(Day.SATURDAY, Month.AUGUST, -2147483648);
        dayOfYearFail(Day.SATURDAY, Month.NOVEMBER, 6677);
        dayOfYearFail(Day.SATURDAY, Month.DECEMBER, -22);

        //New Year day is thursday. For example, 2004
        dayOfYearFail(Day.THURSDAY, Month.JANUARY, 56778);
        dayOfYearFail(Day.THURSDAY, Month.FEBRUARY, 30);
        dayOfYearFail(Day.THURSDAY, Month.JUNE, 2147483647);
        dayOfYearFail(Day.THURSDAY, Month.SEPTEMBER, -2147483648);
        dayOfYearFail(Day.THURSDAY, Month.DECEMBER, 0);
    }

    /**
     * Check correct work of toString() method
     */
    @Test
    public void toStringTest() {
        toStringTest(Day.MONDAY, "New Year day = MONDAY");
        toStringTest(Day.TUESDAY, "New Year day = TUESDAY");
        toStringTest(Day.WEDNESDAY, "New Year day = WEDNESDAY");
        toStringTest(Day.THURSDAY, "New Year day = THURSDAY");
        toStringTest(Day.FRIDAY, "New Year day = FRIDAY");
        toStringTest(Day.SATURDAY, "New Year day = SATURDAY");
        toStringTest(Day.SUNDAY, "New Year day = SUNDAY");
    }

    /**
     * Testcase for check work of method getDayOfYear()
     * @param nyDay New Year day of the week
     * @param month month of given date
     * @param day   day of the month of given date
     * @param res   day of the week for given date
     * @see Day
     * @see Month
     */
    private void dayOfYearTest(Day nyDay, Month month, int day, Day res) {
        Calendar calendar = new Calendar(nyDay);
        assertEquals(nyDay, calendar.getNewYearDay());
        assertEquals(res, calendar.getDayOfYear(month, day));
    }

    /**
     * Testcase for check wrong input day of month
     * @param nyDay New Year day of week
     * @param month month of given date
     * @param day   day of month of given date
     */
    private void dayOfYearFail(Day nyDay, Month month, int day) {
        Calendar calendar = new Calendar(nyDay);
        try {
            calendar.getDayOfYear(month, day);
            fail(day + " is wrong count of days in " + month);
        } catch (IllegalArgumentException e) {
            //expected
        }
    }

    /**
     * Testcase for check correct work of toString() method
     * @param nyDay     day of the week of new year day
     * @param message   actual message
     * @see Day
     */
    private void toStringTest(Day nyDay, String message) {
        Calendar calendar = new Calendar(nyDay);
        assertEquals(nyDay, calendar.getNewYearDay());
        assertEquals(message, calendar.toString());
    }
}