package com.company;

public class Algo1 {

    public static void main(String[] args) {
        String[] names = {"China", "Russia", "USA", "Japan", "Spain", "Belarus", "Ukraine"};
        double[] data = {14.14, 1000.0, 3520.73, 1249.9, 500.15, 2345.12, 21345.9};

        sortSales(names, data);
        printData(names, data);
    }

    private static void printData(String[] names, double[] data) {
        System.out.print("{");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + ": " + data[i] + ", ");
        }
        System.out.println("\b\b}");
    }

    private static void sortSales(String[] names, double[] data) {
        int m = 0;
        if (names.length != data.length) {
            System.out.println("Corrupted Data");
        } else {
            for (int i = 0; i < names.length; i++) {
                if ((names[i] == "") && (data[i] == 0)) {
                    m += 1;
                }
            }
            if (m == names.length) {
                System.out.println("Empty Data");
            }

            double minData;
            String minNames;

            for (int i = 1; i < data.length; ++i) {
                for (int j = 0; j < data.length - i; ++j) {
                    if (data[j] < data[j + 1]) {
                        minData = data[j];
                        minNames = names[j];
                        data[j] = data[j + 1];
                        names[j] = names[j + 1];
                        data[j + 1] = minData;
                        names[j + 1] = minNames;
                        printData(names, data);
                    }
                }
            }

        }
    }
}
