package com.implemica.house;

/**
 * Finding number of level and number of entrance of house for given apartment number.
 * @author Slavik Aleksey V.
 * @version 1.0
 */
public class House {

    private int levels, flats;

    public House(int levels, int flats) {
        this.levels = levels;
        this.flats = flats;
    }

    /**
     * Finding number of entrance of house for given apartment number.
     * @param apart
     * @return
     */
    public int getEntrance(int apart) {
        return (apart - 1) / (levels * flats) + 1;
    }

    /**
     * Finding number of level of house for given apartment number.
     * @param apart
     * @return
     */
    public int getLevel(int apart) {
        return (apart - 1) % (levels * flats) / 4 + 1;
    }

    @Override
    public String toString() {
        return "levels = " + levels + ", flats = " + flats;
    }
}
