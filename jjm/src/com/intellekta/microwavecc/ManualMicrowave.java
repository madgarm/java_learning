package com.intellekta.microwavecc; // пакет общий для всех

// класс наследуемый от абстрактного и использующий интерфейс
public class ManualMicrowave extends DeviceFunction implements DeviceMode {

    public void deviceOff() { // метод для вывода сообщения о выключении
        System.out.println("Waiting for new task"); // сообщение
    }
}