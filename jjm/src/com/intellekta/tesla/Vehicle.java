package com.intellekta.tesla;

public class Vehicle {

    private int power; // мощность двигателя

    public Vehicle(int power) { // конструктор класса
        this.power = (power >= 1 && power <= 3000) ? power : 1; // поле мощности двигателя, проверка на принадлежность диапазону
    }

    public int getPower() {
        return power;
    } // геттер мощности

    void printSpecification() { // метод для вывода характеристик
        System.out.printf("Vehicle power: %d%n", power); // выводим по маске
    }
}