package com.intellekta.microwavecc; // пакет общий для всех

abstract public class DeviceFunction implements DeviceMode { // абстрактный использует интерфейс

    public void printHeatingMode() { // метод для сообщения о режиме нагрева
        System.out.println("The device is in heating mode"); // сообщение
    }

    public void deviceOn() { // метод для вывода сообщения о включении
        System.out.println("Device is ON"); // сообщение
    }

    abstract public void deviceOff(); // абстрактный метод для вывода сообщения о выключении

}