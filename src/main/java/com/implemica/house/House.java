package com.implemica.house;

/**
 * Finding number of level and number of entrance of house for given apartment number.
 * @author Slavik Aleksey V.
 * @version 1.1
 */
public class House {

    /**
     * Count of levels in house
     */
    private int levels;

    /**
     * Count of flats per level in house
     */
    private int flats;

    /**
     * Create House object with verification of input data
     * @param levels    count of levels in house
     * @param flats     count of flats per level in house
     */
    public House(int levels, int flats) {
        if (levels < 1 || flats < 1) {
            throw new IllegalArgumentException("Levels (" + levels + ") and flats per level (" + flats + ") must be positive numbers");
        }

        if ((long)(levels) * (long)(flats) > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Product of levels (" + levels + ") and flats per level (" + flats + ") are more than 2147483647");
        }

        this.levels = levels;
        this.flats = flats;
    }

    public int getLevels() {
        return levels;
    }

    public int getFlats() {
        return flats;
    }

    /**
     * Finding number of entrance of house for given apartment number.
     * @param apart number of apartment
     * @return      number of enter for given apartment in current house
     */
    public int getEntrance(int apart) {
        if (apart < 1) {
            throw new IllegalArgumentException("Can`t evaluate enter number for apartment " + apart + ". Number of apartment must be positive integer");
        }

        return (apart - 1) / (levels * flats) + 1;
    }

    /**
     * Finding number of level of house for given apartment number.
     * @param apart number of apartment
     * @return      number of level for given apartment in current house
     */
    public int getLevel(int apart) {
        if (apart < 1) {
            throw new IllegalArgumentException("Can`t evaluate level number for apartment " + apart + ". Number of apartments must be positive integer");
        }

        return (apart - 1) % (levels * flats) / flats + 1;
    }

    @Override
    public String toString() {
        return "levels = " + levels + ", flats = " + flats;
    }
}