package com.intellekta;

public class Cubist extends Client { // наследуемый класс

    // конструктор
    public Cubist(String lastName, String firstName, String secondName, int amountOfBoughtDrawings, int fortune) {
        // вызываем конструктор из родительского класса, передаем параметры
        super(lastName, firstName, secondName, amountOfBoughtDrawings, fortune);
    }

    @Override // переопределяем метод
    public String preferredStyleOfDrawings() {
        return "I prefer cubism"; // клиенты этого класса любят кубизм
    }
}