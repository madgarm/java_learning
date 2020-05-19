package com.intellekta.staff;

public class MonthlyStaff implements Staff { // класс использует интерфейс

    private int workDays; // приватное поле рабочих дней
    private int premium; // приватное поле премии

    // конструктор
    public MonthlyStaff(int workDays, int premium) {
        this.workDays = (workDays > 0 && workDays <= 30) ? workDays : 0; // поле рабочих дней с проверкой на диапазон
        this.premium = (premium >= 0 && premium <= 10000) ? premium : 0; // поле премии с проверкой на диапазон
    }

    public int getWorkDays() { // геттер рабочих дней
        return workDays;
    }

    public int getPremium() { // геттер премии
        return premium;
    }

    public int calculateSalary(int salary) { // метод подсчета зарплаты
        return (salary * workDays + premium); // по формуле
    }
}