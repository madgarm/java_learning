package com.intellekta.pinapple;

public class ClientClassifier {

    public static void main(String[] args) {
        Client one = new Client(-1, "institution", "one", 150);
        Client two = new Client(2, "institution", "two", -1000);
        Client three = new Client(100_000_000_001L, "individual", "three", 2300);
        Client four = new Client(100_000_000_003L, "institution", "four", 3300);
        Client[] clients = new Client[4];
        clients[0] = one;
        clients[1] = two;
        clients[2] = three;
        clients[3] = four;
        Client[] results = new Client[8];
        getClientsByType(clients, "institution", results);
        printClients(results);
    }

    public static void getClientsByType(Client[] clients, String type, Client[] result) { // метод для отбора клиентов
        if (clients == null || clients.length == 0) { // проверка массива клиентов на null и пустоту
            System.out.println("Clients array is null or empty"); // сообщение об ошибке
        } else if (result == null || result.length == 0) { // проверка массива клиентов на null и пустоту
            System.out.println("Result array is null or empty"); // сообщение об ошибке
        } else { // иначе - работаем
            int count = 0; // счетчик для индекса в массиве результатов
            String needType = type.intern();
            for (int i = 0; i < clients.length; i++) { // проверяем всех клиентов
                // если искомый по типу и есть место в результатах (строчки интернируем)
                if (clients[i].type == needType && count < result.length) {
                    result[count] = clients[i]; // записываем в результаты текущего клиента
                    count += 1; // переходим к следующему
                } else if (count < result.length) { // если тип не тот, но место в результатах еще есть
                    count += 1; // переходим к следующему
                } else { // если место кончилось
                    System.out.println("Result array length exceeded"); // сообщение об этом
                    break; // выходим из цикла, не нужно проверять остальных клиентов
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
