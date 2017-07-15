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
     * Check correct day of the week numbers
     */
    @Test
    public void getDay() {
        assertEquals(0, Day.MONDAY.ordinal());
        assertEquals(1, Day.TUESDAY.ordinal());
        assertEquals(2, Day.WEDNESDAY.ordinal());
        assertEquals(3, Day.THURSDAY.ordinal());
        assertEquals(4, Day.FRIDAY.ordinal());
        assertEquals(5, Day.SATURDAY.ordinal());
        assertEquals(6, Day.SUNDAY.ordinal());
    }
}