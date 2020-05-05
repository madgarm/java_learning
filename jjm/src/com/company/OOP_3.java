package com.company;

public class OOP_3 {
    public static void main(String[] args) {
        Detail first = new Detail("First", 1, 100);
        Detail second = new Detail("Second", 1, 200);
        System.out.println("total=" + Detail.total);
        System.out.println("status=" + Detail.status);
        first.printDetail(first);
        second.printDetail(second);
        first.sell(10);
        second.sell(300);
        first.printDetail(first);
        second.printDetail(second);
        System.out.println("total=" + Detail.total);
        System.out.println("status=" + Detail.status);
    }

    public static class Detail {
        String name; // имя детали
        int quantity, number; // количество деталей на складе, номер партии
        static int total; // общее число деталей на складе
        static String status = "Need to buy some details"; // общее состояние склада
        static final int TOTAL_MIN = 100; // минимальное количество деталей на складе
        static final int TOTAL_MAX = 1000; // максимальное количество деталей на складе

        public Detail(String name, int number, int quantity) { // конструктор класса с 3 параметрами
            this.name = (name != null) ? (name) : "default"; // параметр имени детали
            this.number = (number != 0) ? (number) : 0; // параметр номера партии
            this.quantity = (quantity != 0) ? (quantity) : 0; // параметр количества деталей в партии
            total += quantity; // при инициализации увеличиваем общее число деталей на складе
            if (TOTAL_MIN <= total & total <= TOTAL_MAX) { // сравниваем total с пределами, если в пределах -
                status = "OK"; // то ОК
            } else if (total > TOTAL_MAX) { // если превышает верхний предел -
                status = "Not enough storage space"; // - то не ОК
            }
        }

        public boolean sell(int toSell) { // метод sell, передается количество деталей на продажу

            if (toSell > quantity | toSell < 0 | toSell > total) { // проверяем на возможность продажи, если не ОК -
                return false; // вовзращаем false
            } else { // если же все адекватно
                quantity -= toSell; // списываем из количества этих деталей
                total -= toSell; // списываем с общего количества деталей на складе
                if (total < TOTAL_MIN) { // проверяем общее число деталей по нижней границе
                    status = "Need to buy some details"; // изменяем статус
                } else if (total > TOTAL_MAX) { // по верхней границе
                    status = "Not enough storage space"; // изменяем на статус
                } else if (TOTAL_MIN <= total & total <= TOTAL_MAX) { // если же все в пределах
                    status = "OK"; // то ОК
                }
                return true; // после списания, возвращаем true
            }
        }

        public void printDetail(Detail thing) { // метод для красивой печати
            System.out.printf("%s %d: %d%n", thing.name, thing.number, thing.quantity);
        }

    }
}
