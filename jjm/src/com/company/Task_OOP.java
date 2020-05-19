package com.company;

import com.intellekta.tesla.Lorry;
import com.intellekta.tesla.Motorcycle;
import com.intellekta.tesla.PassengerCar;

public class Task_OOP {
    public static void main(String[] args) {
        PassengerCar car = new PassengerCar(300, "Model X", 5);
        Lorry lorry = new Lorry(620, "Semi", 6500);
        Motorcycle moto = new Motorcycle(170, 210);

        car.printSpecification();
        lorry.printSpecification();
        moto.printSpecification();
    }
}