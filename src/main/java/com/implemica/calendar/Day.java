package com.implemica.calendar;

/**
 * Days of week with necessary methods.
 * @author Slavik Aleksey V.
 * @version 1.1
 */
public enum Day {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    /**
     * Array of numbers of days of the week
     */
    private static final Day[] dayList = Day.values();

    /**
     * Number of the last day of the week in array
     */
    private static final int END_OF_WEEK = 6;

    /**
     * Return day of the week for given number.
     * Day numbers must be in range from 0 to 6.
     * @param day   number of day of the week
     * @return      enum object for given number of day of the week
     */
    public static Day getDay(int day) {
        if (day < 0 || day > END_OF_WEEK) {
            throw new IllegalArgumentException();
        }

        return dayList[day];
    }
}
