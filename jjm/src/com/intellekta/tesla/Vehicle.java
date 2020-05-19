package com.intellekta.tesla;

public class Vehicle {

    private int power; // мощность двигателя

    public Vehicle(int power) {
        this.power = (power >=1 && power <= 3000) ? power : 1;
    }

    public int getPower() {
        return power;
    }

    void printSpecification() {
        System.out.printf("Vehicle power: %d%n", power);
    }
}