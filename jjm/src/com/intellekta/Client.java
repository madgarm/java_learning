package com.intellekta;

public class Client {

    String lastName; //фамилия клиента;
    String firstName; // имя клиента;
    String secondName; // отчество клиента;
    int amountOfBoughtDrawings; // общее число купленных картин;
    int fortune; // финансовое состояние клиента (в миллионах долларов США)
    static final String defaultLastName = "default"; // фамилия по умолчанию
    static final String defaultFirstName = "client"; // имя по умолчанию
    static final String defaultSecondName = "absolute"; // отчество по умолчанию

    public Client(String lastName, String firstName, String secondName, int amountOfBoughtDrawings, int fortune) {
        this.lastName = (lastName == null) ? defaultLastName : lastName; // поле фамилии с проверкой на null
        this.firstName = (firstName == null) ? defaultFirstName : firstName; // поле имени с проверкой на null
        this.secondName = (secondName == null) ? defaultSecondName : secondName; // поле отчества с проверкой на null
        // поле количества картин с проверкой на отрицательность
        this.amountOfBoughtDrawings = (amountOfBoughtDrawings < 0) ? 0 : amountOfBoughtDrawings;
        this.fortune = (fortune < 0) ? 0 : fortune; // поле состояния клиента с проверкой на отрицательность
    }

    public String preferredStyleOfDrawings() { // метод возвращает предпочтение клиента
        return "No preferred style"; // клиенты родительского класс не имеют особых пердпочтений
    }

    @Override // переопределяем метод из стандартного пакета
    public String toString() { // возвращаем все по маске
        return "Name: " + lastName + " " + firstName + " "+ secondName + "\n" + // \n - символ перевода на новую строку
                "Amount of bought drawings: " + amountOfBoughtDrawings + "\n" +
                "Fortune:" + fortune + "\n" +
                "Style: " + preferredStyleOfDrawings(); // и вызываем тут же метод с предпочтением клиента
    }
}