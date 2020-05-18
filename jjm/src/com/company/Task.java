package com.company;

public class Task {

    public static void main(String[] args) {
        Planes thingOne = Planes.BOEING;
        Planes thingTwo = Planes.IL90;
        Planes thingThree = Planes.TU153;
        System.out.println(thingOne.speed());
        System.out.println(thingTwo.speed());
        System.out.println(thingThree.speed());
        System.out.println(maxSpeed());
    }

    enum Planes{ // создаем перечисление
        BOEING(8000, 10), // Боинг
        IL90(5400, 0), // Ил90
        TU153(14000, 15); // Ту153

        public final int distance; // объявляем поле расстояния
        public final int time; // объявляем поле времени

        Planes(int distance, int time) // конструктор принимает целочисленные расстояние и время
        {
            this.distance = (distance > 0) ? (distance) : 0; // параметр расстояния, обнуляет отрицательные значения
            this.time = (time > 0) ? (time) : 0; // параметр времени, обнуляет отрицательные значения
        }

        public int speed() {
            if (time == 0) { // если время 0
                System.out.println("Incorrect data"); // сообщение об ошибке
                return 0; // возвращаем ноль
            } else { // иначе
                return distance/time; // возвращаем вычисление скорости
            }
        }
    }

    public static int maxSpeed() {
        Planes[] everyPlanes = Planes.values(); // создаем массив для всех перечислений
        int maxSpeed = 0; // переменная для хранения максимальной скорости
        for (Planes thing : everyPlanes) { // для каждого элемента из массива
            if (thing.time == 0) { // если время равно 0
                System.out.println("Incorrect data"); // сообщение об ошибке
                return 0; // возвращаем 0
            } else { // иначе
                int speed = thing.distance/thing.time; // переменная со счетом скорости
                if (speed > maxSpeed) { // если скорость выше максимальной
                    maxSpeed = speed; // назначаем ее максимальной
                }
            }
        }
        return maxSpeed; // вовзращаем максимальную скорость
    }
}
