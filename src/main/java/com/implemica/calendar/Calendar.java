package com.implemica.calendar;

/**
 * Finding the day of week for given day of week of New Year day and given date.
 * @author Slavik Aleksey V.
 * @version 1.1
 */
public class Calendar {

    /**
     * Day of the week of New Year day
     */
    private Day newYearDay;

    /**
     * Count of days of week
     */
    private final static int DAY_OF_WEEK_COUNT = 7;

    /**
     * Create Calendar object
     * @param newYearDay    new year day
     * @see Day
     */
    public Calendar(Day newYearDay) {
        this.newYearDay = newYearDay;
    }

    public Day getNewYearDay() {
        return newYearDay;
    }

    /**
     * Return the day of week for given date represented by month and day
     * @param month month of the year
     * @param day   day of month
     * @return      day of week for given date
     */
    public Day getDayOfYear(Month month, int day) {
        if (day < 1 || day > month.daysCount()) {
            throw new IllegalArgumentException();
        }

        int daysCount = day + newYearDay.ordinal() - 1;
        for (int i = 0; i < month.ordinal(); i++) {
            daysCount += Month.getMonth(i).daysCount();
        }

        return Day.getDay(daysCount % DAY_OF_WEEK_COUNT);
    }

    @Override
    public String toString() {
        return "New Year day = " + newYearDay;
    }
}
