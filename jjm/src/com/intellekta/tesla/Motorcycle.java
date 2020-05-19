package com.intellekta.tesla;

final public class Motorcycle extends Vehicle {

    private int speed;

    public Motorcycle(int power, int speed) {
        super(power);
        this.speed = (speed >=0 && speed <=300) ? speed : 200;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void printSpecification() {
        super.printSpecification();
        System.out.printf("Moto speed: %d%n", speed);
    }
}