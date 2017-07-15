package com.implemica.calendar;

/**
 * Months of year.
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

    /**
     * Count of days in February
     */
    private static final int FEBRUARY_COUNT = 29;

    /**
     * Count of days in April, June, September and November
     */
    private static final int LOW_COUNT = 30;

    /**
     * Count of days in January, March, May, July, August, October and December
     */
    private static final int HIGH_COUNT = 31;

    /**
     * Return the number of day of current month
     *
     * @return count of days for current month
     */
    public int daysCount() {
        if (this == FEBRUARY) {
            return FEBRUARY_COUNT;
        } else if (this == APRIL || this == JUNE || this == SEPTEMBER || this == NOVEMBER) {
            return LOW_COUNT;
        }

        return HIGH_COUNT;
    }

}