package com.intellekta.InvestTrade;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task {

    public static double[] findAllWinners(double[] data) { // принимает массив с отработанными часами всех сотрудников
        if (data == null || data.length == 0) { // проверки на null и пустоту
            return new double[0]; // возвращаем пустой массив
        } else if (data.length == 1) { // если сотрудник один
            return data; // возвращаем только его
        } else { // если же все ок с входными данными
            int countOfEmployees = data.length - 1; // число сотрудников
            int countOfWinners = 0; // счетчик для победивших сотрудников
            double[] resultsForEmployees = Arrays.copyOf(data, data.length); // массив для результатов сотрудников
            double[] winners = new double[countOfEmployees]; // массив для победителей
            Arrays.sort(resultsForEmployees); // сортируем по возрастанию

            // цикл для перебора сотрудников, для заполнения 3 призовых мест
            for (int countOfWinPlaces = 0; countOfWinPlaces < 3; countOfWinPlaces++) {
                do { // внутренний цикл с постусловием
                    // записываем в массив победителей сотрудников с победным временем
                    Array.setDouble(winners, countOfWinners++, (Array.getDouble(resultsForEmployees, countOfEmployees)));
                } while (Array.getDouble(resultsForEmployees, countOfEmployees) == Array.getDouble(resultsForEmployees, --countOfEmployees));
            }

            return Arrays.copyOfRange(winners, 0, countOfWinners); // возвращаем массив, состоящий только из победителей
        }
    }

    public static int peopleChoiceAward(double[] data, int countOfWinners) {
        // проверки массива на null и пустоту, количество победителей на адекватность
        if (data == null || data.length == 0 || countOfWinners > data.length || countOfWinners < 0) {
            return -1; // возвращаем -1 как показатель
        } else { // если же все ок с входными данными
            int[] indexOfEmployees = new int[data.length]; // массив с номерами сотрудников в изначальном массиве
            for (int i = 0; i < indexOfEmployees.length; i++) {
                Array.setInt(indexOfEmployees, i, i); // заполняем номерами
            }

            // синхронно сортируем массив с результатами сотрудников и их номерами в изначальном массиве, пузырьком
            for (int i = 1; i < data.length; i++) {
                for (int j = 0; j < data.length - i; j++) {
                    if (data[j] > data[j + 1]) { // обнаружив больший элемент
                        double maxTime = data[j]; // записываем в максимум по результатам текущий
                        int maxId = indexOfEmployees[j]; // записываем в максимум по индексам текущий
                        data[j] = data[j + 1]; // в текущий по результатами пишем следующий
                        data[j + 1] = maxTime; // в следующий по результатами пишем максимальный
                        indexOfEmployees[j] = indexOfEmployees[j + 1]; // в текущий по индексам пишем следующий
                        indexOfEmployees[j + 1] = maxId; // в следующий по индексам пишем максимальный
                    }
                }
            }

            // массив с сотрудниками, которые не стали победителями
            double[] notWinners = Arrays.copyOfRange(data, 0, data.length - countOfWinners);
            int winnerId = Arrays.binarySearch(notWinners, 1500); // пытаемся найти элемент со значением 1500
            if (winnerId >= 0) { // если нашелся (>=0)
                // для поиска первого сотрудника с таким результатом (в случае, если их несколько) проверяем условие с префиксным декрементом
                while (notWinners[winnerId] == notWinners[--winnerId]) {
                }
                return indexOfEmployees[++winnerId]; // возвращаем индекс такого участника
            } else { // если не нашлось
                return -1; // возвращем -1 как показатель
            }
        }
    }
}