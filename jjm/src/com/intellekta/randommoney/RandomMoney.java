package com.intellekta.randommoney;

import java.util.Random;

public class RandomMoney {

    public static void main(String[] args) {
        RandomMoney thing = new RandomMoney(1000);
        thing.sale(5, 10);
        thing.testSale();
    }

    private double price; // объявляем поле цены

    RandomMoney(double price) { // в конструктор передаем цену
        this.price = (price < 0) ? 0: price; // сброс до ноля для отрицательных значений
    }

    RandomMoney() { // конструктор без параметров
        this.price = 0; // по умолчанию
    }

    public double getPrice() { // геттер для цены
        return price;
    }

    public void setPrice(double price) { // сеттер для цены
        this.price = (price < 0) ? 0: price; // сброс до ноля для отрицательных значений
    }

    public void sale(int quantity, double time) { // передаем количество и время
        if (quantity <= 0 || time < 0) { // проверка на положительность значений
            System.out.println("Error"); // сообщение об ошибке
        } else { // если все ок
            double price = (5 * Math.sin(0.5 * time)); // считаем стоиомость продажи акций по формуле
            this.price = price; // задаем параметру класса результат вычислений
            double finResult = quantity * price; // считаем финансовый результат как произведение количества на стоимость
            if (finResult > 0) { // если больше 0
                System.out.printf("The company has earned %.2f USD", finResult); // выводим результат
            } else if (finResult == 0) { // если равно 0
                System.out.printf("The company did not earn anything and did not lose on the sale"); // сообщение
            } else { // в иных случаях - если меньше 0
                System.out.printf("The company has lost %.2f USD", Math.abs(finResult)); // выводим результат
            }
            System.out.println(); // перевод на новую строку
        }
    }

    public void testSale() {
        Random generator = new Random(); // создаем рандомизатор
        for (int i = 0; i < 3; i++) { // три раза
            // вызываем метод sale со случайным целочисленным количеством и случайным вещественным от 0 до 50 временем
            sale(generator.nextInt(), (generator.nextDouble() * 50));
        }
    }
}
