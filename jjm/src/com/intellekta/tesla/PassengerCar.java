package com.intellekta.tesla;

public class PassengerCar extends Car { // наследуемый класс

    private int seats; // приватное поле количества мест

    public PassengerCar(int power, String model, int seats) { // конструктор
        super(power, model); // вызываем конструктор из родительского класса, передаем параметры
        this.seats = (seats >=2 && seats <=8) ? seats : 5; // поле количества мест с проверкой по диапазону
    }

    public int getSeats() {
        return seats;
    } // геттер количества мест

    @Override // переопределяем метод
    public void printSpecification() { // метод для вывода характеристик
        super.printSpecification(); // берем за основу из родительского класса
        System.out.printf("Seats count: %d%n", seats); // выводим по маске количество мест
    }
}