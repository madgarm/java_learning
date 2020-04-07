package com.company;

public class Upr6 {

    public static void main(String[] args) {
        double[] weights = {0.0351};
        checkWeight(weights);
    }

    public static void checkWeight(double[] weights) {

        double refWeight = 0.050; // переменная типа double с эталонным значением веса таблетки
        double deviationWeight = 0.10; // переменная типа double с допустимым отклонением веса таблетки в долях
        String messageForWalterWhite = "Ok"; // предустановленное сообщение для Уолтера, что все ОК

        if (weights.length!=0) { // проверяем массив весов таблеток на наличие содержимого
            for (int i = 0; i <= weights.length; i += 3) { // цикл со счетчиком от 0 до значения длины массива, шаг 3
                if ((weights[i] / refWeight) <= (1 - deviationWeight)) { // если вес таблеки меньше допустимого значения
                    messageForWalterWhite = "Not enough substance"; // тогда заменяем сообщение для Уолтера
                    System.out.println(messageForWalterWhite); // выводим сообщение
                    break; // выходим из цикла, как только находим первую бракованную таблетку
                }
            }

            if (messageForWalterWhite == "Ok") { // если сообщение для Уолтера не изменилось
                System.out.println(messageForWalterWhite); // тогда сообщаем, что все Ок
            }
        } else { // в ином случае (пустой массив)
            System.out.println("Not enough substance"); // выводим сообщение об этом
        }
    }
}
