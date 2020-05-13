package com.company;

public class Wrapper_classes_3 {
    public static void main(String[] args) {
//        int[] dataInt = {3, 5, 4, 2, 1};
//        Double[] dataDouble = {9.0, null, 5.3, 7.2, null, 1.2, 1.9};
//        int[] dataInt;
        Double[] dataDouble;
//        printDataInt(dataInt);
//        printDataDouble(dataDouble);
//        SortingUtil.sortInts(dataInt);
//        SortingUtil.sortDoubles(dataDouble);
//        printDataInt(dataInt);
//        printDataDouble(dataDouble);
    }

    private static void printDataInt(int[] data) {
        System.out.printf("{");
        for (int i = 0; i < data.length; i++) {
            if (i != data.length-1) {
                System.out.printf("%s, ", data[i]);
            } else {
                System.out.printf("%s", data[i]);
            }
        }
        System.out.printf("}%n");
    }

    private static void printDataDouble(Double[] data) {
        System.out.printf("{");
        for (int i = 0; i < data.length; i++) {
            if (i != data.length-1) {
                System.out.printf("%s, ", data[i]);
            } else {
                System.out.printf("%s", data[i]);
            }
        }
        System.out.printf("}%n");
    }

    public static class SortingUtil {

        public static void sortInts(int[] array) {
            if (array == null || array.length == 0) {
                System.out.println("Empty data");
            } else {
                int maxData; // служебная для сортировки пузырьком
                for (int i = 1; i < array.length; ++i) { // сортировка, первый прогон
                    // сортируем первый элемент, смотрим на 0 позицию в каждом вложенном массиве
                    for (int j = 0; j < array.length - i; ++j) {
                        if (array[j] > array[j + 1]) { // сравнение со следующим элементом, если меньше
                            maxData = array[j]; // тогда в maxData записываем текущее значение из data
                            array[j] = array[j + 1]; // текущее значение из data меняем на следующее (которое больше)
                            array[j + 1] = maxData; // в следующее значение из data записываем значение из maxData
                        }
                    }
                }
            }
        }

        public static void sortDoubles(Double[] array) {
            if (array == null || array.length == 0) {
                System.out.println("Empty data");
            } else {
                Double maxData; // служебная для сортировки пузырьком
                for (int i = 1; i < array.length; ++i) { // сортировка, первый прогон
                    // сортируем первый элемент, смотрим на 0 позицию в каждом вложенном массиве
                    for (int j = 0; j < array.length - i; ++j) {
                        if (array[j] == null || (array[j+1] != null && array[j] > array[j + 1])) { // сравнение со следующим элементом, если меньше
                            maxData = array[j]; // тогда в maxData записываем текущее значение из data
                            array[j] = array[j + 1]; // текущее значение из data меняем на следующее (которое больше)
                            array[j + 1] = maxData; // в следующее значение из data записываем значение из maxData
                        }
                    }
                }
            }
        }
    }
}

