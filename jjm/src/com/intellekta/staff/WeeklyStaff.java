package com.intellekta.staff;

public class WeeklyStaff extends MonthlyStaff implements Staff { // класс использует интерфейс, наследуется от класса

    private int workWeeks; // приватное поле рабочих недель

    // конструктор
    public WeeklyStaff(int workDays, int premium, int workWeeks) {
        super(workDays, premium); // вызываем конструктор из родительского класса, передаем параметры
        this.workWeeks = (workWeeks >= 2 && workWeeks <= 4) ? workWeeks : 0;
    }

    public int getWorkWeeks() { // геттер рабочих недель
        return workWeeks;
    }

    @Override // переопределяем метод
    public int calculateSalary(int salary) { // метод подсчета зарплаты
        return (salary * workWeeks); // по формуле
    }

    public void printYearSalary(int salary) { // метод вывода
        System.out.println(workWeeks * salary * 26); // по формуле
    }
}