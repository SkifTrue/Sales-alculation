package ru.netology.stats;

public class StatsService {

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;  // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxMonth]) {
                maxMonth = i; //
            }

        }

        return maxMonth + 1;
    }

    public int calculateAverageSales(int[] sales) {
        int averageSum = 0;  // Средняя
        for (int i : sales) {
            averageSum += i;
        }
        return averageSum / sales.length;
    }

    public int BelowAverage(int[] sales) {
        int averageMonth = calculateAverageSales(sales); // Среднее
        int belowAverage = 0; // Ниже среднего
        for (int i : sales) {
            if (i < averageMonth) {
                belowAverage = belowAverage + 1;
            }
        }
        return belowAverage;
    }

    public int HighAverage(int[] sales) {
        int averageMonth = calculateAverageSales(sales); // Среднее
        int highAverage = 0; // Выше среднего
        for (int i : sales) {
            if (i > averageMonth) {
                highAverage = highAverage + 1;
            }
        }
        return highAverage;
    }

    public int SumSales(int[] sales) {
        int sum = 0; // Сумма
        for (int i : sales) {
            sum = sum + i;
        }
        return sum;
    }

}
