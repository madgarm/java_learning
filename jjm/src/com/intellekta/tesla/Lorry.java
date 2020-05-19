package com.intellekta.tesla;

public class Lorry extends Car {

    private int capacity;

    public Lorry(int power, String model, int capacity) {
        super(power, model);
        this.capacity = (capacity >=500 && capacity <=10000) ? capacity : 2500;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void printSpecification() {
        super.printSpecification();
        System.out.printf("Capacity: %d%n", capacity);
    }
}