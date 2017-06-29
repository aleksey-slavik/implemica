package com.implemica;

import com.implemica.calendar.Calendar;
import com.implemica.calendar.Day;
import com.implemica.calendar.Month;
import com.implemica.changer.Changer;
import com.implemica.fibonacci.Fibonacci;
import com.implemica.gcd.GCD;
import com.implemica.house.House;

/**
 * Demonstration of work of all tasks.
 * @author Slavik Aleksey V.
 * @version v.1.1
 */
public class Main {

    /**
     * Entry point in app
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Change of two numbers demo");
        Changer changer = new Changer(2,-4);
        System.out.println("Initial data");
        System.out.println(changer);
        changer.change();
        System.out.println("Change numbers");
        System.out.println(changer);
        changer.changeXOR();
        System.out.println("Change numbers with XOR");
        System.out.println(changer);
        System.out.println("==================================================");
        System.out.println("GCD of four numbers demo");
        System.out.println("gcd(18, 48, 54, 30) = " + GCD.gcd(18, 48, 54, 30));
        System.out.println("gcd(18, 48, -54, 30) = " + GCD.gcd(18, 48, -54, 30));
        System.out.println("gcd(18, 0, 54, 30) = " + GCD.gcd(18, 0, 54, 30));
        System.out.println("==================================================");
        System.out.println("Fibonacci demo");
        for (int i = 0; i < 10; i++)
            System.out.print(Fibonacci.getValueAt(i + 1) + " ");
        System.out.println("\n==================================================");
        System.out.println("House demo");
        House house = new House(9,4);
        System.out.println(house);
        System.out.println("Entrance of apartment number 1 is " + house.getEntrance(1));
        System.out.println("Entrance of apartment number 36 is " + house.getEntrance(36));
        System.out.println("Entrance of apartment number 37 is " + house.getEntrance(37));
        System.out.println("Entrance of apartment number 72 is " + house.getEntrance(72));
        System.out.println("Level of apartment number 1 is " + house.getLevel(1));
        System.out.println("Level of apartment number 36 is " + house.getLevel(36));
        System.out.println("Level of apartment number 37 is " + house.getLevel(37));
        System.out.println("Level of apartment number 72 is " + house.getLevel(72));
        System.out.println("==================================================");
        System.out.println("Calendar demo");
        Calendar calendar = new Calendar(Day.FRIDAY);
        System.out.println(calendar);
        System.out.println("Day of week of the 1 January is " + calendar.getDayOfYear(Month.JANUARY, 1));
        System.out.println("Day of week of the 23 February is " + calendar.getDayOfYear(Month.FEBRUARY, 23));
        System.out.println("Day of week of the 8 March is " + calendar.getDayOfYear(Month.MARCH, 8));
        System.out.println("Day of week of the 9 May is " + calendar.getDayOfYear(Month.MAY, 9));
        System.out.println("Day of week of the 23 August is " + calendar.getDayOfYear(Month.AUGUST, 23));
        System.out.println("Day of week of the 1 September is " + calendar.getDayOfYear(Month.SEPTEMBER, 1));
        System.out.println("Day of week of the 31 December is " + calendar.getDayOfYear(Month.DECEMBER, 31));
    }
}
