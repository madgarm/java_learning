package com.company;

public class Algo3 {

    public static void main(String[] args) {
        String[] names = {"Two", "Four", "Five", "Six", "Seven", "Three", "One"};
        double[] data = {2.0, 4.0, 5.0, 6.0, 7.0, 3.0, 1.0};

        sortStoresSales(names, data);
        printData(names, data); // в конце каждой итерации выводим оба массива
    }

    private static void printData(String[] names, double[] data) {
        System.out.print("{");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + ": " + data[i] + ", ");
        }
        System.out.println("\b\b}");
    }

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
            }


            double[] leftArray = new double[data.length / 2];
            double[] rightArray = new double[data.length - leftArray.length];

            for (int i = 0; i < data.length; i++) {
                if (i < leftArray.length)
                    leftArray[i] = data[i];
                else
                    rightArray[i - leftArray.length] = data[i];
            }

            if (rightArray.length > 1) {
                sortStoresSales(names, leftArray);
                sortStoresSales(names, rightArray);
            }

            int leftId = 0;
            int rightId = 0;

            for (int i = 0; i < data.length; i++) {
                if (leftId == leftArray.length && rightId < rightArray.length)
                    data[i] = rightArray[rightId++];
                else if (rightId == rightArray.length && leftId < leftArray.length)
                    data[i] = leftArray[leftId++];
                else
                    data[i] = (leftArray[leftId] < rightArray[rightId]) ? leftArray[leftId++] : rightArray[rightId++];

            }

        }
    }
}
