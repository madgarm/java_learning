package com.intellekta.microwavecc;

public class Test_micro {
    public static void main(String[] args) {
        AutomaticMicrowave auto = new AutomaticMicrowave();
        auto.printHeatingMode();
        auto.deviceOn();
        auto.deviceOff();
        ManualMicrowave manul = new ManualMicrowave();
        manul.printHeatingMode();
        manul.deviceOn();
        manul.deviceOff();
    }
}