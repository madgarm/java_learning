package com.company;

public class Null {

    public static void main(String[] args) {
        int[][] data = {{0, 0, 2}, {1, 1, 5}, {3, 3, 4}, {2, 2, 17}};
        sort(data);
        printData(data);
    }

    // метод для красивой печати массивов с двумя размерностями
    private static void printData(int[][] data) {
        System.out.print("{");
        for (int i = 0; i < data.length; i++) {
            System.out.print("{");
            for (int j = 0; j < data[i].length; j++) {
                if (j == data[i].length - 1) {
                    System.out.print(data[i][j]);
                } else {
                    System.out.print(data[i][j] + ", ");
                }
            }
            System.out.print("}, ");
        }
        System.out.println("\b\b}");
    }

    // метод сортировки массива с двумя размерностями в порядке убыванию по 0-у элементу каждого вложенного массива
    private static void sort(int[][] data) {
        // первоначальная проверка входного массива на null
        if (data == null) { // если null
            System.out.println("Empty data"); // сообщение об ошибке, иначе основная часть программы
        } else {
            boolean nullError = false; // служебная, по умолчанию ошибки с null нет
            boolean rangeError = false; // служебная, по умолчанию ошибки с размерностью нет
            int nullErrorID = 0; // служебный, запоминает index элемента, где обнаружена ошибка с null
            int rangeErrorID = 0; // служебный, запоминает index элемента, где обнаружена ошибка с размерностью
            // проверка на наличие null, не должно быть, иначе - сообщение об ошибке
            for (int i = 0; i < data.length; i++) { // перебираем все вложенные массивы
                if (data[i] == null) { // на наличие элементов с null
                    nullError = true; //  ошибка с null обнаружена
                    nullErrorID = i; // в этом элементе
                }
            }
            if (!nullError) { // если в предыдущем блоке НЕ обнаружена ошибка с null
                // проверка на размерность каждого внутреннего массива, должна быть равна 3, иначе - сообщение об ошибке
                for (int i = 0; i < data.length; i++) { // перебираем все вложенные массивы
                    if (data[i].length != 3) { // на размерность
                        rangeError = true; // ошибка с размерностью обнаружена
                        rangeErrorID = i; // в эторм элементе
                    }
                }
                if (!rangeError) { // если в предыдущем блоке НЕ онбаружена ошибка с размерностью
                    int[] minData; // служебная для сортировки пузырьком
                    for (int i = 1; i < data.length; ++i) { // сортировка, первый прогон
                        // сортируем первый элемент, смотрим на 0 позицию в каждом вложенном массиве
                        for (int j = 0; j < data.length - i; ++j) {
                            if (data[j][0] < data[j + 1][0]) { // сравнение со следующим иэлементом, если меньше
                                minData = data[j]; // тогда в minData записываем текущее значение из data
                                data[j] = data[j + 1]; // текущее значение из data меняем на следующее (которое больше)
                                data[j + 1] = minData; // в следующее значение из data записываем значение из minData
                            }
                        }
                    }
                } else { // если же онбаружена ошибка с размерностью
                    System.out.println("Unavailable data at index " + rangeErrorID); // выводится сообщение об ошибке
                }
            } else { // если же онбаружена ошибка null
                System.out.println("Empty data at index " + nullErrorID); // выводится сообщение об ошибке
            }
        }
    }
}
