package com.implemica.calendar;

/**
 * Finding the day of week for given day of week of New Year day and given date.
 * @author Slavik Aleksey V.
 * @version 1.1
 */
public class Calendar {

    Day newYearDay;

    public Calendar(Day newYearDay) {
        this.newYearDay = newYearDay;
    }

    /**
     * Return the day of week of given date represented by month and day
     * @param month
     * @param day
     * @return
     */
    public Day getDayOfYear(Month month, int day) {
        if (day < 1 || day > month.daysCount())
            throw new IllegalArgumentException();
        int daysCount = day + newYearDay.ordinal() - 1;
        for (int i = 0; i < month.ordinal(); i++)
            daysCount += Month.getMonth(i).daysCount();
        return Day.getDay(daysCount % 7);
    }

    @Override
    public String toString() {
        return "New Year day = " + newYearDay;
    }
}
