package com.intellekta.tesla;

public class PassengerCar extends Car {

    private int seats;

    public PassengerCar(int power, String model, int seats) {
        super(power, model);
        this.seats = (seats >=2 && seats <=8) ? seats : 5;
    }

    public int getSeats() {
        return seats;
    }

    @Override
    public void printSpecification() {
        super.printSpecification();
        System.out.printf("Seats count: %d%n", seats);
    }
}