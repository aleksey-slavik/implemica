package com.implemica.calendar;

/**
 * Days of week with necessary methods.
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
        return dayList[day];
    }
}
