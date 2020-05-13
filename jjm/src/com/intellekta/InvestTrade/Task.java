package com.intellekta.InvestTrade;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task {

    static int unikWinners = 0; // счетчик уникальных победителей

    public static double[] findAllWinners(double[] data) { // принимает массив с отработнными часами всех сотрудников
        if (data == null || data.length == 0) { // проверка на null и пустоту
            double[] empty = new double[0]; // пустой массив
            return empty; // возвращаем пустой массив
        } else { // если же все ок с входными данными
            Arrays.sort(data); // сортируем по возрастанию входной массив
            int countOfWinners = 0; // переменная для хранения числа призовых мест
            while (countOfWinners != 3) { // целевой показатель - 3
                // сравниваем пару соседних показателей с конца, ищем отличные значения
                if (Array.getDouble(data, data.length - unikWinners - 1) != Array.getDouble(data, data.length - unikWinners - 2)) {
                    countOfWinners += 1; // каждая новая пара - еще одно призовое место
                    unikWinners += 1; // и новый призер
                } else {
                    unikWinners += 1; // иначе только лишь призер на уже выбранное призовое место
                }
            }
            // возвращаем срез отсортированного массива с конца длиной равной числу разных призеров
            return Arrays.copyOfRange(data, data.length - unikWinners, data.length);
        }
    }

    public static int peopleChoiceAward(double[] data, int countOfWinners) { // тот же массив исходный и число призеров
        if (data.length == 0) { // проверка на пустоту
            return -1; // возвращаем -1 как показатель
        } else { // если все ок
            Arrays.sort(data); // сортируем
            int winnerId = Arrays.binarySearch(data, 1500.00); // пытаемся найти запись на 1500 часов
            // если в отсортированном массиве его позиция раньше, чем позиции победителей, возвращаем его, иначе -1
            return (winnerId < data.length - countOfWinners) ? winnerId : -1;
        }
    }
}
