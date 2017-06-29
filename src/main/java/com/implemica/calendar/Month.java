package com.implemica.calendar;

/**
 * Months with necessary methods.
 * @author Slavik Aleksey V.
 * @version 1.1
 */
public enum Month {

    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    private static final Month[] monthList = Month.values();

    /**
     * Return the number of day of current month
     * @return
     */
    public int daysCount() {
        switch (this) {
            case FEBRUARY:
                return 29;
            case APRIL:
            case JUNE:
            case SEPTEMBER:
            case NOVEMBER:
                return 30;
            default:
                return 31;
        }
    }

    /**
     * Return the month object for given number
     * @param month
     * @return
     */
    public static Month getMonth(int month) {
        if (month < 0 || month > 12)
            throw new IllegalArgumentException();
        return monthList[month];
    }
}
