package com.implemica.house;

/**
 * Finding number of level and number of entrance of house for given apartment number.
 * @author Slavik Aleksey V.
 * @version 1.1
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
        if (!isValid(apart))
            throw new IllegalArgumentException();
        return (apart - 1) / (levels * flats) + 1;
    }

    /**
     * Finding number of level of house for given apartment number.
     * @param apart
     * @return
     */
    public int getLevel(int apart) {
        if (!isValid(apart))
            throw new IllegalArgumentException();
        return (apart - 1) % (levels * flats) / 4 + 1;
    }

    private boolean isValid(int value) {
        return value > 0 ? true : false;
    }

    @Override
    public String toString() {
        return "levels = " + levels + ", flats = " + flats;
    }
}
