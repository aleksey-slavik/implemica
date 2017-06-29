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

    private static final Day[] dayList = Day.values();

    /**
     * Return the day of month object for given number
     * @param day
     * @return
     */
    public static Day getDay(int day) {
        if (day < 0 || day > 7)
            throw new IllegalArgumentException();
        return dayList[day];
    }
}
