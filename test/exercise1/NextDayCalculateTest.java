package exercise1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculateTest {

    @Test
    void calculateNextDay1_1_2018() {
        int day = 1;
        int month = 1;
        int year = 2018;

        int[] actual = NextDayCalculate.calculateNextDay(day, month, year);
        int[] expected = {2, 1, 2018};

        assertArrayEquals(expected, actual);
    }

    @Test
    void calculateNextDay31_1_2018() {
        int day = 31;
        int month = 1;
        int year = 2018;

        int[] actual = NextDayCalculate.calculateNextDay(day, month, year);
        int[] expected = {1, 2, 2018};

        assertArrayEquals(expected, actual);
    }

    @Test
    void calculateNextDay30_4_2018() {
        int day = 30;
        int month = 4;
        int year = 2018;

        int[] actual = NextDayCalculate.calculateNextDay(day, month, year);
        int[] expected = {1, 5, 2018};

        assertArrayEquals(expected, actual);
    }

    @Test
    void calculateNextDay28_2_2018() {
        int day = 28;
        int month = 2;
        int year = 2018;

        int[] actual = NextDayCalculate.calculateNextDay(day, month, year);
        int[] expected = {1, 3, 2018};

        assertArrayEquals(expected, actual);
    }

    @Test
    void calculateNextDay29_2_2020() {
        int day = 29;
        int month = 2;
        int year = 2020;

        int[] actual = NextDayCalculate.calculateNextDay(day, month, year);
        int[] expected = {1, 3, 2020};

        assertArrayEquals(expected, actual);
    }

    @Test
    void calculateNextDay31_12_2018() {
        int day = 31;
        int month = 12;
        int year = 2018;

        int[] actual = NextDayCalculate.calculateNextDay(day, month, year);
        int[] expected = {1, 1, 2019};

        assertArrayEquals(expected, actual);
    }

}