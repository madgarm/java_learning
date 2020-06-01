package com.intellekta.pinapple;

public class ClientClassifier {

    public static void main(String[] args) {
        Client one = new Client(-1, "institution", "one", 150);
        Client two = new Client(2, "institution", "two", -1000);
        Client three = new Client(100_000_000_001L, null, "three", 2300);
        Client four = new Client(100_000_000_003L, "institution", "four", 3300);
        Client[] clients = new Client[4];
        clients[0] = one;
        clients[1] = two;
        clients[2] = three;
        clients[3] = four;
        Client[] results = new Client[3];
        getClientsByType(clients, "institution", results);
        System.out.println();
        printClients(results);
    }

    public static void getClientsByType(Client[] clients, String type, Client[] result) { // метод для отбора клиентов
        if (clients == null || clients.length == 0) { // проверка массива клиентов на null и пустоту
            System.out.println("Clients array is null or empty"); // сообщение об ошибке
        } else if (result == null || result.length == 0) { // проверка массива клиентов на null и пустоту
            System.out.println("Result array is null or empty"); // сообщение об ошибке
        } else { // иначе - работаем
            String needType = type.intern(); // интернируем искомую строку
            // организуем цикл, перебираем все элементы массива клиентов
            // i - для клиентов, j - для результатов, count - показатель заполненности массива результатов
            for (int i = 0, j = 0, count = 0; i < clients.length && count != 1; i++) {
                // если клиент подходит и есть место в результатах
                if (j < result.length && clients[i].type == needType) {
                    result[j] = clients[i]; // заполняем
                    j += 1; // переходим к следующей позиции в результатах
                // если клиент походит, но места уже нет
                } else if (clients[i].type == needType && j == result.length) {
                    System.out.println("Result array length exceeded"); // сообщаем об этом
                    count = 1; // переключаем показатель заполненности массива результатов
                }
            }
        }
    }

    public static void printClients(Client[] data) { // красивый вывод
        if (data != null && data.length != 0) { // проверка на null и пустоту
            for (int i = 0; i < data.length; i++) { // поэлементно
                if (data[i] != null) { // если элемент не null, вообще это не обязательно, но на тестах пригодилось
                    // выводим по маске
                    System.out.printf("%d; %s; %s; %f%n", data[i].id, data[i].name, data[i].type, data[i].sum);
                }
            }
        }
    }
}
