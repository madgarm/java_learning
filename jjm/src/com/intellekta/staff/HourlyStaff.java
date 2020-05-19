package com.intellekta.staff;

public class HourlyStaff implements Staff { // класс использует интерфейс

    private int workTime; // приватное поле рабочего времени

    // конструктор
    public HourlyStaff(int workTime) {
        this.workTime = (workTime >= 4 && workTime <= 10) ? workTime : 0; // поле рабочего времени с проверкой на диапазон
    }

    public int getWorkTime() { // геттер рабочего времени
        return workTime;
    }

    public int calculateSalary(int salary) { // метод подсчета зарплаты
        if (salary < 0) { // проверка параметра на отрицательность
            return 0; // если отрицательное, возвращает 0
        } else { // если положительное значение
            return (salary * workTime); // по формуле
        }
    }
}