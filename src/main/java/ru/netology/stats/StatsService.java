package ru.netology.stats;

public class StatsService {
    long sum(long[] sales) {
        long totalsale = 0;
        for (long sale : sales) {
            totalsale += sale;
        }
        return totalsale;
    }

    long average(long[] sales) {
        return sum(sales) / sales.length;
    }

    int calaMonthMaximumSale(long[] sales) {
        int monthMaxSele = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMaxSele]) {
                monthMaxSele = i;
            }
        }
        return monthMaxSele + 1;
    }

    int calaMonthMinimumSale(long[] sales) {
        int monthMinSele = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMinSele]) {
                monthMinSele = i;
            }
        }
        return monthMinSele + 1;
    }

    int calcMonthBelowAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale)
                counter++;
        }
        return counter;
    }

    int calcMohthAboveAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale)
                counter++;
        }
        return counter;
    }

}
