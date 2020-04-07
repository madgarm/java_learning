package com.company;

public class Upr7 {

    public static void main(String[] args) {
        double[] weights = {0.052, 0.048, 0.052, 0.043, 0.050, 0.048, 0.049, 0.054, 0.048, 0.045};
        checkWeight(weights);
    }

    public static void checkWeight(double[] weights) {

        double refWeight = 0.050; // переменная типа double с эталонным значением веса таблетки
        double deviationWeight = 0.10; // переменная типа double с допустимым отклонением веса таблетки в долях
        int indexOfQuality = 0; // служебная переменная, если равна 0, то все таблетки в норме, иначе - попались плохие

        if (weights.length!=0) { // проверяем массив весов таблеток на наличие содержимого
            for (double weight : weights) { // прогоняем по всем элементам массива

                if ((weight / refWeight) <= (1 - deviationWeight)) { //если вес таблеки меньше допустимого значения
                    System.out.println(weight); // тогда печатаем ее вес
                    indexOfQuality += 1; // и изменяем значение служебного параметра на 1
                }
            }
            if (indexOfQuality == 0) { // если не встретились "плохие" таблетки
                System.out.println("OK"); // печатаем сообщение, что все ОК
            }
        } else { // в ином случае (пустой массив)
            System.out.println("Not enough substance"); // выводим сообщение об этом
        }


    }
}
