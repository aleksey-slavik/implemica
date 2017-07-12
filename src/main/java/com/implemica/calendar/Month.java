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

    /**
     * Array of numbers of months
     */
    private static final Month[] monthList = Month.values();

    /**
     * Number of the last month of year in array
     */
    private static final int END_OF_YEAR = 11;

    /**
     * Return the number of day of current month
     * @return  count of days for current month
     */
    public int daysCount() {
        if (this == FEBRUARY) {
            return 29;

        } else {

            if(this == APRIL || this == JUNE || this == SEPTEMBER || this == NOVEMBER) {
                return 30;
            }
        }

        return 31;
    }

    /**
     * Return the month object for given number
     * Month numbers must be in range from 0 to 11.
     * @param month number of month
     * @return      enum object for given number of month
     */
    public static Month getMonth(int month) {
        if (month < 0 || month > END_OF_YEAR) {
            throw new IllegalArgumentException();
        }

        return monthList[month];
    }
}
