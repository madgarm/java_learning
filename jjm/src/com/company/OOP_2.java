package com.company;

public class OOP_2 {
    public static void main(String[] args) {
        Person firstMan = new Person("Ivanov", 1990);
        printData(firstMan);
    }

    public static void printData(Person man) { // метод, передаем экземпляр класса Person
        if (man != null) { // если передан нормальный экземпляр
            System.out.println(man.getSalaryByDayRate(500)); // вывод на экран рез-та метода с заданным знач параметров
            System.out.println(man.getSalaryByDayRate(625.5)); // вывод на экран рез-та метода с заданным знач параметров
            man.getSalaryByDayRate(400, 6000); // вывод на экран рез-та метода с заданным знач параметров
        } else {
            System.out.println("Incorrect data"); // иначе - сообщение об ошибке
        }
    }

    public static class Person {
        String surname; // фамилия
        double height, weight; // рост в см, вес в кг
        int year; // год рождения

        public Person(String surname, int year) { // конструктор класса с 2 параметрами
            this.surname = (surname != null) ? (surname) : ""; // параметр фамилия, проверка на null
            this.year = (year > 0) ? (year) : 0; // параметр, проверка на отрицательное значение
        }

        public Person(String surname, double height, double weight, int year) { // конструктор класса с 4 параметрами
            this.surname = (surname != null) ? (surname) : ""; // параметр фамилия, проверка на null
            this.height = (height > 0) ? (height) : 0; // параметр рост, проверка на отрицательное значение
            this.weight = (weight > 0) ? (weight) : 0; // параметр вес, проверка на отрицательное значение
            this.year = (year > 0) ? (year) : 0; // параметр, проверка на отрицательное значение
        }

        public int getSalaryByDayRate(int dayRate) { // метод подсчета зп за 21 день в целых
            return (dayRate > 0) ? (dayRate * 21) : 0; // с проверкой на положительность, иначе - 0
        }

        public double getSalaryByDayRate(double dayRate) { // метод подсчета зп за 21 день в вещественных
            return (dayRate > 0) ? (dayRate * 21) : 0; // с проверкой на положительность, иначе - 0
        }

        public void getSalaryByDayRate(int salary, int premium) { // метод подсчета зп с премией
            int result; // объявляем переменную для результата счета
            int salaryAfterCheck = (salary < 0) ? 0 : (salary); // переменная для "правильной" платы за день
            int premiumAfterCheck = (premium < 0) ? 0 : (premium);  // переменная для "правильной" премии
            result = salaryAfterCheck * 21 + premiumAfterCheck; // считаем ЗП
            System.out.printf("Работник %s получил за месяц %d%n", surname, result); // вывод на экран
        }
    }
}
