package com.intellekta.tesla;

public class Car extends Vehicle{ // наследуемый класс

    private String model; // приватное поле модели
    static final String defaultType = "default"; // константа для значения по умолчанию для модели

    public Car(int power, String model) { // конструктор
        super(power); // вызываем конструктор из родительского класса, передаем параметры
        this.model = (model == null) ? defaultType : model; // поле модели с проверкой на null
    }

    public String getModel() {
        return model;
    } // геттер модели

    @Override // переопределяем метод
    void printSpecification() { // метод для вывода характеристик
        super.printSpecification(); // берем за основу из родительского класса
        System.out.printf("Car model: %s%n", model); // выводим по маске модель
    }
}