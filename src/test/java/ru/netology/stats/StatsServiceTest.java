package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {
    @Test
    void shouldTotalAmount() {

        StatsService service = new StatsService();
        int[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.totalAmount(values);
        int expected = 180;
        System.out.println(actual);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMonthAmount() {
        StatsService service = new StatsService();
        int[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.monthAmount(values);
        int expected = 15;
        System.out.println(actual);
        assertEquals(expected, actual);

    }

    @Test
    void shouldMaxSalesPerMonth() {
        StatsService service = new StatsService();
        int[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.maxSalesPerMonth(values);
        int expected = 8;
        System.out.println(actual);
        assertEquals(expected, actual);

    }



    @Test
    void shouldMinSalesPerMonth() {
        StatsService service = new StatsService();
        int[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.minSalesPerMonth(values);
        int expected = 9;
        System.out.println(actual);
        assertEquals(expected, actual);


    }



    @Test
    void shouldMonthsBelowAvg() {
        StatsService service = new StatsService();
        int[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.monthsBelowAvg(values);
        int expected = 5;
        System.out.println(actual);
        assertEquals(expected, actual);


    }
    @Test
    void  shouldMonthsAboveAvg() {

        StatsService service = new StatsService();
        int[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.monthsAboveAvg(values);
        int expected = 5;
        System.out.println(actual);
        assertEquals(expected, actual);

    }




}
