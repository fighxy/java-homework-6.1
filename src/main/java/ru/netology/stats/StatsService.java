package ru.netology.stats;

public class StatsService {
    public int totalAmount(int[] values) {

        int amount = 0;

        for (int value : values) {

            amount = amount + value;

        }
        return amount;

    }

    public int monthAmount(int[] values) {


        int numberOfMonth = 0;
        int avgSalesPerMonth = 0;

        for (int value : values) {

            numberOfMonth = numberOfMonth + 1;

            avgSalesPerMonth = totalAmount(values) / numberOfMonth;

        }
        return avgSalesPerMonth;


    }

    public int maxSalesPerMonth(int[] values) {

        int currentMax = values[0];
        int numberOfMonth = 0;
        int maxSalesNumberMonth = 0;

        for (int value : values) {

            numberOfMonth += 1;
            if (currentMax <= value) {
                currentMax = value;
                maxSalesNumberMonth = numberOfMonth;

            }
        }
        return maxSalesNumberMonth;
    }

    public int minSalesPerMonth(int[] values) {

        int currentMin = values[0];
        int numberOfMonth = 0;
        int minSalesNumberMonth = 0;

        for (int value : values) {

            numberOfMonth += 1;
            if (currentMin >= value) {
                currentMin = value;
                minSalesNumberMonth = numberOfMonth;

            }
        }
        return minSalesNumberMonth;
    }


    public int monthsBelowAvg(int[] values) {

        int countOfMonth = 0;

        for (int value : values) {

            if (value < monthAmount(values)) {
                countOfMonth += 1;

            }

        }
        return countOfMonth;
    }

    public int  monthsAboveAvg(int[] values) {

        int countOfMonth = 0;

        for (int value : values) {

            if (value > monthAmount(values)) {
                countOfMonth += 1;

            }

        }
        return countOfMonth;
    }
}

