package com.intellekta.staff;

public class Test_Int {
    public static void main(String[] args) {
        HourlyStaff hour = new HourlyStaff(6);
        MonthlyStaff month = new MonthlyStaff(15, 5000);
        WeeklyStaff week = new WeeklyStaff(50, 10001, 4);

        System.out.println(hour.calculateSalary(-100));
        System.out.println(month.calculateSalary(-5));
        System.out.println(week.calculateSalary(-50));
        week.printYearSalary(-35);
    }
}
