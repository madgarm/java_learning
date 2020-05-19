package com.intellekta.tesla;

public class Lorry extends Car { // наследуемый класс

    private int capacity; // приватное поле грузоподъемности

    public Lorry(int power, String model, int capacity) { // конструктор
        super(power, model); // вызываем конструктор из родительского класса, передаем параметры
        this.capacity = (capacity >=500 && capacity <=10000) ? capacity : 2500; // поле грузоподъемности с проверкой по диапазону
    }

    public int getCapacity() {
        return capacity;
    } // геттер грузоподъемности

    @Override // переопределяем метод
    public void printSpecification() { // метод для вывода характеристик
        super.printSpecification(); // берем за основу из родительского класса
        System.out.printf("Capacity: %d%n", capacity); // выводим по маске грузоподъемность
    }
}