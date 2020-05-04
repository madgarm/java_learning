package com.company;

public class OOP_2 {
    public static void main(String[] args) {
        Person firstMan = new Person("Ivanov", 1990);
        printData(firstMan);
    }

    public static void printData(Person man) { // метод, передаем экземпляр класса Person
        System.out.println(man.getSalaryByDayRate(500)); // вывод на экран рез-та метода с заданным знач параметров
        System.out.println(man.getSalaryByDayRate(625.5)); // вывод на экран рез-та метода с заданным знач параметров
        man.getSalaryByDayRate(400, 6000); // вывод на экран рез-та метода с заданным знач параметров
    }

    public static class Person {
        String surname; // фамилия
        double height, weight; // рост в см, вес в кг
        int year; // год рождения

        public Person(String surname, int year) { // конструктор класса с 2 параметрами
            this.surname = surname; // параметр фамилия
            this.year = year; // параметр год рождения
        }

        public Person(String surname, double height, double weight, int year) { // конструктор класса с 4 параметрами
            this.surname = surname; // параметр фамилия
            this.height = height; // параметр рост
            this.weight = weight; // параметр вес
            this.year = year; // параметр
        }

        public int getSalaryByDayRate(int dayRate) { // метод подсчета зп за 21 день в целых
            return (dayRate > 0) ? (dayRate * 21) : 0; // с проверкой на положительность, иначе - 0
        }

        public double getSalaryByDayRate(double dayRate) { // метод подсчета зп за 21 день в вещественных
            return (dayRate > 0) ? (dayRate * 21) : 0; // с проверкой на положительность, иначе - 0
        }

        public void getSalaryByDayRate(int salary, int premium) { // метод подсчета зп с премией
            int result; // объявляем переменную для результата счета
            result = (salary < 0 & premium < 0) ? 0: (salary * 21 + premium); // проверка на положительность, иначе - 0
                System.out.printf("Работник %s получил за месяц %d%n", surname, result); // вывод на экран
        }
    }
}
