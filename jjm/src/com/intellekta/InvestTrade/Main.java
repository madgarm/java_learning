package com.intellekta.InvestTrade;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        double[] times = {1111.34, 1298.9, 1298.9, 1634.7, 1500, 1633.73, 1111.34, 1634.7, 1000.47, 1890.7, 1890.7};
        double[] times = {1111.34, 1298.9, 1633.73, 1500.1, 1634.7, 1000.47, 1890.7};
//        double[] times = {1633.73, 1634.7, 1890.7, 1633.73, 1634.7, 1890.7, 1000.0};
//        double[] times = {1633.73};
//        double[] times = {1633.73, 1634.7, 1890.7, 1633.73, 1634.7, 1890.7, 1000.0};
//        double[] times = {1633.73, 1633.73, 1633.73, 1633.73, 1633.73, 1633.73, 1890.7, 1000.0};
        double[] result;



        double[] ex = Arrays.copyOf(times, times.length);
        for (int i = 0; i < ex.length; i++) {
            System.out.printf("%s ", ex[i]);
        }
        System.out.println();

        Arrays.sort(ex);
        for (int i = 0; i < ex.length; i++) {
            System.out.printf("%s ", ex[i]);
        }
        System.out.println();

        result = Task.findAllWinners(times);
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%s ", result[i]);
        }
        System.out.println();

//        int winner = Task.peopleChoiceAward(times, Task.unikWinners);
//        int winner = Task.peopleChoiceAward(times, 3);
//        System.out.println(winner);
    }


}
