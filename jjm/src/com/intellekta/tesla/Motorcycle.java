package com.intellekta.tesla;

final public class Motorcycle extends Vehicle { // наследуемый класс без возможности наследовать от него

    private int speed; // приватное поле скорости

    public Motorcycle(int power, int speed) { // конструктор
        super(power); // вызываем конструктор из родительского класса, передаем параметры
        this.speed = (speed >=0 && speed <=300) ? speed : 200; // поле скорости с проверкой по диапазону
    }

    public int getSpeed() {
        return speed;
    } // геттер скорости

    @Override // переопределяем метод
    public void printSpecification() { // метод для вывода характеристик
        super.printSpecification(); // берем за основу из родительского класса
        System.out.printf("Moto speed: %d%n", speed); // выводим по маске скорость
    }
}