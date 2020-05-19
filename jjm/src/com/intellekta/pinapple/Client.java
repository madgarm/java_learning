package com.intellekta.pinapple;

public class Client {
    long id; // id
    String type; // тип
    String name; // имя
    double sum; // сумма покупок
    static final String typeInstitution = "institution"; // константа типа
    static final String typeIndividual = "individual"; // константа типа

    public Client(long id, String type, String name, double sum) { // конструктор класса с 4 входными параметрами
        this.id = (id <= 100_000_000_000L) ? (100_000_000_000L) : id; // с проверкой на значение
        if (type == null) { // если null, то "institution"
            this.type = typeInstitution;
        } else if (type.equals(typeIndividual)) { // если соответствует "individual", то "individual"
            this.type = typeIndividual;
        } else { // во всех иных, то "institution"
            this.type = typeInstitution;
        }
        this.name = (name != null) ? (name) : "Default"; // проверка на null
        this.sum = (sum < 0) ? (0) : sum; // проверка на положительность
    }
}
