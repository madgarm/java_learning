package com.intellekta.creditbank;

import java.util.Scanner;

public class CreditCalculator {

    String lastName, firstName, secondName; // объявляем поля имя, фамилия, отчество
    double sum, interestRate; // объявляем поля суммы кредита, годовой ставки
    int loanMaturity; // объявляем полесрока кредита в месяцах

    public CreditCalculator() { // констуруктор класса без параметров
        Scanner scanner = new Scanner(System.in); // создаем сканер

        // присваиваем параметр имя
        do {
            System.out.print("Lastname: "); // предлагаем ввести имя
            this.lastName = scanner.nextLine(); // читаем строку из ввода
            if (this.lastName.intern() == "") { // проверяем на пустоту
                System.out.println("Lastname is incorrect. It must be not empty string"); // сообщение об ошибке
            }
        } while (this.lastName.intern() == ""); // добиваемся нормального ввода

        // присваиваем параметр фамилия
        do {
            System.out.print("Firstname: "); // предлагаем ввести фамилию
            this.firstName = scanner.nextLine(); // читаем строку из ввода
            if (this.firstName.intern() == "") { // проверяем на пустоту
                System.out.println("Firstname is incorrect. It must be not empty string"); // сообщение об ошибке
            }
        } while (this.firstName.intern() == ""); // добиваемся нормального ввода

        // присваиваем параметр отчество, не важно, что там вводят
        System.out.print("Secondname: "); // предлагаем ввести отчество
        this.secondName = scanner.nextLine(); // читаем строку из ввода

        // присваиваем параметр процентной ставки
        do {
            System.out.print("Interest rate: "); // предлагаем ввести процентную ставку
            this.interestRate = scanner.nextDouble(); // читаем действительное число из ввода
            if (this.interestRate < 0.0) { // проверяем на положительность
                System.out.println("Interest rate is incorrect. It must be strictly positive number"); // сообщение об ошибке
            }
        } while (this.interestRate < 0.0); // добиваемся нормального ввода

        // присваиваем параметр суммы кредита
        do {
            System.out.print("Credit amount: "); // предлагаем ввести сумму кредита
            this.sum = scanner.nextDouble(); // читаем действительное число из ввода
            if (this.sum < 0.0) { // проверяем на положительность
                System.out.println("Credit amount is incorrect. It must be strictly positive number"); // сообщение об ошибке
            }
        } while (this.sum < 0.0); // добиваемся нормального ввода

        // присваиваем параметр срока кредита
        double inputLoanMaturity; // переменная для временного хранения вводаимого числа
        do {
            System.out.print("Loan maturity: "); // предлагаем ввести срок кредита
            inputLoanMaturity = scanner.nextDouble(); // читаем действительное число из ввода
            if (inputLoanMaturity % 1 != 0.0 || inputLoanMaturity < 0) { // проверяем на целочисленность и положительность
                System.out.println("Loan maturity is incorrect. It must be strictly positive int"); // сообщение об ошибке
            } else { // если все ок
                this.loanMaturity = (int) inputLoanMaturity; // присваиваем параметру ввод, переведенный в целое число
            }
        } while (inputLoanMaturity % 1 != 0.0 || inputLoanMaturity < 0); // добиваемся нормального ввода
    }

    public void printCreditAgreement() { // метод подсчета аннуитетного платежа и вывода его на экран
        // считаем по формуле
        double payment = (sum * interestRate / 12 / 100) / (1 - Math.pow(1 + interestRate / 12 / 100, (-loanMaturity)));
        System.out.printf("%.2f", payment); // выводим с форматированием - 2 знака после запятой
    }
}
