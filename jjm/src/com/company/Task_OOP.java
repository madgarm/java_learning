package com.company;

import com.intellekta.tesla.Lorry; // импортируем класс Lorry
import com.intellekta.tesla.Motorcycle; // импортируем класс Motorcycle
import com.intellekta.tesla.PassengerCar; // импортируем класс PassengerCar

public class Task_OOP {
    public static void main(String[] args) {
        PassengerCar car = new PassengerCar(300, "Model X", 5); // создаем экземпляр PassengerCar
        Lorry lorry = new Lorry(620, "Semi", 6500); // создаем экземпляр Lorry
        Motorcycle moto = new Motorcycle(170, 210); // создаем экземпляр Motorcycle

        car.printSpecification(); // выводим характеристики
        lorry.printSpecification(); // выводим характеристики
        moto.printSpecification(); // выводим характеристики
    }
}