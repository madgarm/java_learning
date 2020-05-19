package com.intellekta.tesla;

public class Car extends Vehicle{

    private String model;
    static final String defaultType = "default";

    public Car(int power, String model) {
        super(power);
        this.model = (model == null) ? defaultType : model;
    }

    public String getModel() {
        return model;
    }

    @Override
    void printSpecification() {
        super.printSpecification();
        System.out.printf("Car model: %s%n", model);
    }
}