package com.intellekta;

public class Impressionist extends Client { // наследуемый класс

    // конструктор
    public Impressionist(String lastName, String firstName, String secondName, int amountOfBoughtDrawings, int fortune) {
        // вызываем конструктор из родительского класса, передаем параметры
        super(lastName, firstName, secondName, amountOfBoughtDrawings, fortune);
    }

    @Override // переопределяем метод
    public String preferredStyleOfDrawings() {
        return "I prefer impressionism"; // клиенты этого класса любят импрессионизм
    }
}