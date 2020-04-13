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

    // алгоритм сортировки пузырьком в порядке убывания
    private static void sortSales(String[] names, double[] data) {

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

            double minData;
            // служебная переменная для хранения минимального значения из массива Показателей для алгоритма сортировки
            String minNames;
            // служебная переменная для хранения минимального значения из массива Названий для алгоритма сортировки

            // реализуется алгоритм сортировки пузырьком, сортировка по убыванию
            for (int i = 1; i < data.length; ++i) { // сортировка идет по массиву Показателей, оганизуем первый "прогон"
                for (int j = 0; j < data.length - i; ++j) { // сортируем первый элемент
                    if (data[j] < data[j + 1]) { // сравнение со следующим из внутреннего цикла, если меньше
                        minData = data[j]; // тогда в minData записываем текущее значение из data
                        minNames = names[j];
                        // в minNames записываем текущее значение из names (соответсвующее значению из data)
                        data[j] = data[j + 1]; // текущее значение из data меняем на следующее (которое больше)
                        names[j] = names[j + 1];
                        // текущее значение из names меняем на следующее (соответствующе большему)
                        data[j + 1] = minData; // в следующее значение из data записываем значение из minData
                        names[j + 1] = minNames;
                        // в следующее значение из names записываем значение из minNames (соответствующее меньшему)
                        printData(names, data); // выводим на каждом шаге перемещения "пузырька" оба массива
                    }
                }
            }
            printData(names, data); // в конце выводим оба массива

        }
    }
}
