package com.company;

public class Algo3 {

    public static void main(String[] args) {
//        String[] names = {"", "", "", "", "", "", "", "",};
//        double[] data = {0, 0, 0, 0, 0, 0, 0, 0};
        String[] names = {"Four", "Two", "Six", "Five", "Seven", "Eight", "Three", "One"};
        double[] data = {4.0, 2.0, 6.0, 5.0, 7.0, 8.0, 3.0, 1.0};
//        String[] names = {"Four", "Two", "Six", "Five", "Seven", "Eight", "Three", "One"};
//        double[] data = {4.0, 2.0, 6.0, 5.0, 7.0, 8.0, 3.0, 1.0};

        sortStoresSales(names, data);

    }

    private static void printData(String[] names, double[] data) {
        System.out.print("{");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + ": " + data[i] + ", ");
        }
        System.out.println("\b\b}");
    }

    // метод сортировки двух массивов параллельно методом слияния

    private static void sortStoresSales(String[] names, double[] data) {

        int m = 0; // служебная переменная-счетчик для проверки на наличие данных в массивах (читай дальше)

        if (names.length != data.length) { // проверка на сопоставимость массивов, длина их должна быть одинакова
            System.out.println("Corrupted Data"); // если нет - выводим "Corrupted Data"
        } else { // если же длина совпадает
            for (int i = 0; i < names.length; i++) { // задаем цикл по массиву названий стран
                if ((names[i] == "") && (data[i] == 0)) { // если под одним и тем же индексом в обоих массивах пусто
                    m += 1; // тогда увеличиваем служебный счетчик на 1
                }
            }
            if (m == names.length) {
                // если счетчик накрутил до значения равного длине массивов, т.е. в каждом значении обоих массивов пусто
                System.out.println("Empty Data"); // выводим "Empty Data"
            } else {

                /*
                задаем массивы вещественных чисел для Показателей и строчек для Названий, на которые будем рекурсивно
                разбивать более большие массивы, длина левого вычисляет, правого - разница между длиной начального и левого
                 */
                double[] leftData = new double[data.length / 2];
                String[] leftNames = new String[names.length / 2];
                double[] rightData = new double[data.length - leftData.length];
                String[] rightNames = new String[names.length - leftNames.length];


                for (int i = 0; i < data.length; i++) { // перебираем все индексы начального массива Показателей
                    if (i < leftData.length) { // если индекс принадлежит будущему левому
                        leftData[i] = data[i]; // записываем значение начального массива Показателей в новый левый
                        leftNames[i] = names[i]; // записываем значение начального массива Названий в новый левый
                    } else {
                        // записываем значение начального массива Показателей в новый правый
                        rightData[i - leftData.length] = data[i];
                        // записываем значение начального массива Названий в новый правый
                        rightNames[i - leftData.length] = names[i];
                    }
                }

                // проверка по длине нового правого массива (он всегда длиней левого), если он длиней 1, то рекурсия
                if (rightData.length > 1) {
                    // передаем в метод новые массивы Названий и Показателей, левые и правые отдельно
                    sortStoresSales(leftNames, leftData);
                    sortStoresSales(rightNames, rightData);

                }

                // задаем начальные положения индексов, идем слева-направо
                int leftId = 0;
                int rightId = 0;

                // цикл по индексам переданного массива, собираем массив более высокого уровня
                for (int i = 0; i < data.length; i++) {
                    // граничное условие: достигли границ левого массива, но не достигли границ правого
                    if (leftId == leftData.length && rightId < rightData.length) {
                        data[i] = rightData[rightId]; // берем из правого массива Показателей
                        names[i] = rightNames[rightId]; // берем из правого массива Названий
                        rightId += 1; // переходим к следующему элементу правого массива
                        // граничное условие: достигли границ правого массива, но не достигли границ левого
                    } else if (rightId == rightData.length && leftId < leftData.length) {
                        data[i] = leftData[leftId]; // берем из левого массива Показателей
                        names[i] = leftNames[leftId]; // берем из левого массива Названий
                        leftId += 1; // переходим к следующему элементу левого массива
                        // для рядового случая
                    } else {
                        // если элемента левого массива меньше элемента правого
                        if (leftData[leftId] < rightData[rightId]) {
                            data[i] = leftData[leftId]; // берем из левого массива Показателей
                            names[i] = leftNames[leftId];  // берем из левого массива Названий
                            leftId += 1; // переходим к следующему элементу левого массива
                            // если элемента левого массива меньше элемента правого
                        } else {
                            data[i] = rightData[rightId]; // берем из правого массива Показателей
                            names[i] = rightNames[rightId]; // берем из правого массива Названий
                            rightId += 1; // переходим к следующему элементу правого массива
                        }
                    }
                }
                printData(names, data); // выводим после каждого слияния отсортированного массива
            }
        }
    }
}
