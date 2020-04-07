package com.company;

public class Upr4 {

    public static void main(String[] args) {
        double[] weights = {0.052, 0.048, 0.052, 0.043, 0.050, 0.048, 0.049, 0.054, 0.048, 0.045};
        checkWeight(weights);
    }

    public static void checkWeight(double[] weights) {
        int i = 0; // служебная переменная-счетчик для цикла
        double sumOfWeights = 0; // переменная типа double для общей суммы весов таблеток
        double refWeight = 0.050; // переменная типа double с эталонным значением веса таблетки
        double deviationWeight = 0.10; // переменная типа double с допустимым отклонением веса таблетки в долях
        String messageForWalterWhite = "OK"; // предустановленное сообщение для Уолтера, что все ОК

        if (weights.length!=0)  { // проверяем массив весов таблеток на наличие содержимого
            while (i < weights.length) { // пока счетчик меньше длины массива (прогоняем все элементы)
                sumOfWeights += weights[i]; // прибавляем текущий элемент к сумме
                i++; // увеличиваем счетчик на 1 (переходим к следующему элементу)
            }

            if ((sumOfWeights / i / refWeight) <= (1 - deviationWeight)) {
                // если средний вес таблеток меньше допустимого значения
                messageForWalterWhite = "Not enough substance";
                // тогда заменяем предустановленное сообщение для Уолтера на сообщение о недостаточности веса таблеток
            }

            System.out.println(messageForWalterWhite); // выводим сообщение для Уолтера
        } else { // в ином случае (пустой массив)
            System.out.println("Not enough substance"); // выводим сообщение об этом
        }
    }
}
