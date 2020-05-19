package com.intellekta.staff;

public class Test_Int {
    public static void main(String[] args) {
        HourlyStaff hour = new HourlyStaff(5);
        MonthlyStaff month = new MonthlyStaff(5, 500);
        WeeklyStaff week = new WeeklyStaff(10, 600, 4);

        System.out.println(hour.calculateSalary(100));
        System.out.println(month.calculateSalary(500));
        System.out.println(week.calculateSalary(1000));
        week.printYearSalary(1000);
    }
}
