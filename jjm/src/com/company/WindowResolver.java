package com.intellekta;

import java.util.Scanner;

public class WindowResolver {

    public static void main(String[] args) {

        int goToWindow; // объявляем целочисленную переменную для хранения номера окна, в которое пошлем посетителя

        for (; ; ) { // задаем бесконечный цикл, чтобы выйти можно ввести НЕ целочисленное значение
            // вызываем метод getUserInput(), возвращенное значение присваимваем переменной userInput
            int userInput = getUserInput();
            switch (userInput) { // задаем оператор выбора по переменной userInput
                case 1: // в случаях 1,4,7
                case 4:
                case 7:
                    goToWindow = 26; // окно для посетителя задаем согласно правилу из условия задачи (26)
                    break;
                case 2: // в случаях 2,3,5,6
                case 3:
                case 5:
                case 6:
                    goToWindow = 27; // окно для посетителя задаем согласно правилу из условия задачи (27)
                    break;
                case 8: // в случаях 8,9,10
                case 9:
                case 10:
                    goToWindow = 28; // окно для посетителя задаем согласно правилу из условия задачи (28)
                    break;
                default:
                    goToWindow = 30; // для всех иных случаев окно 30
            }
            // отправляем посетителя в нужное окно
            System.out.println("По вашему вопросу обратитесь в окно " + goToWindow);
        }
    }

    static Scanner in = new Scanner(System.in);

    private static int getUserInput() {
        return in.nextInt();
    }
}
