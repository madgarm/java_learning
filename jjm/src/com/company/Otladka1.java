package com.company;

public class Otladka1 {

    public static void main(String[] args) {
        int[] line = {0, 1, -15, 2, 3, 4, 5};
        maxAboveAverage(line);
    }

    public static void maxAboveAverage(int[] data) {
        if (data.length > 0) {
            int max, sum = max = 0, average;
            for (int i = 0; i < data.length; i++) {
                if (data[i] >= max)
                    max = data[i];
                sum += data[i];
            }
            average = sum / data.length;
            System.out.println(max / average);
        } else
            System.out.println("Data Error");
    }
}
