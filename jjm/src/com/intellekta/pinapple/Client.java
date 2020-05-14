package com.intellekta.pinapple;

public class Client {
    long id; // id
    String type; // тип
    String name; // имя
    double sum; // сумма покупок
    static final String typeInstitution = "institution"; // константа типа
    static final String typeIndividual = "individual"; // константа типа

    public Client(long id, String type, String name, long sum) { // конструктор класса с 4 входными параметрами
        this.id = (id <= 100_000_000_000L) ? (100_000_000_000L) : id; // с проверкой на значение
        this.type = (type != null && !type.equals(typeInstitution) && !type.equals(typeIndividual)) ? (typeInstitution) : type; // проверка
        this.name = (name != null) ? (name) : "Default"; // проверка на null
        this.sum = (sum < 0) ? (0) : sum; // пвоверка на положительность
    }
}
