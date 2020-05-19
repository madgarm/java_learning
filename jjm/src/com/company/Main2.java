package com.company; // пакет company

import animals.Species; // импортируем из пакета animals класс species

public class Main2 {
    public static void main(String[] args) {
        // создаем экземпляр класса species, передаем параметры
        Species lion = new Species("Eukaryota", "Animalia", "Chordata", "Mammalia", "Carnivora", "Pantherinae", "Panthera");
    }
}