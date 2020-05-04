package com.company;

public class OOP_1 {
    public static void main(String[] args) {
        class Distance {
            String from, to; // названия жилых пунктов
            double km; // расстояние между ними

            public Distance() { // конструктор класса по умолчанию, без передачи параметров
                this.from = "Moskow"; // параметр from по умолчанию
                this.to = "Perm"; // параметр to по умолчанию
                this.km = 1500; // параметр km по умолчанию
            }

            public Distance(String from, String to, double km) { // конструктор класса с передачей параметров
                this.from = (from == null) ? "Moskow" : from; // параметр from, если не null, иначе - по умолчанию
                this.to = (to == null) ? "Perm" : to; // параметр to, если не null, иначе - по умолчанию
                this.km = (km < 0) ? 1500 : km; // параметр km, если не <0, иначе - по умолчанию
            }

            public void ml() { // метод ml
                System.out.printf("%.2f%n", km * 1.6); // выводит km в милях, переводит на новую строку
            }

            public void dist() { // метод dist
                System.out.printf("The number of miles from %s to %s is ", from, to); // выводит фразу
                ml(); // расстояние в милях
            }
        }
    }
}
