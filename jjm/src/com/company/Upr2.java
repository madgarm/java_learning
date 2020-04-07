package com.company;

public class Upr2 {

    public static void main(String[] args) {
        args = new String[]{"-u"};
        sayHello(args);
    }

    public static void sayHello(String[] args) {
        String osName = System.getProperty("os.name"); // присваиваем переменной osName значение имени системы
        String name = System.getProperty("user.name"); // присваиваем переменной name значение имени пользователя
        String temp = ""; // объявляем временную переменную temp для перевода массива в строку

        for (String num : args) { // перебираем все элементы массива параметров
            temp += num; // каждый элемент массива переводим в строчный тип и добавляем к переменной temp
        }
        if (args.length <= 1) { // проверяем длину массива параметров, параметров должно быть не больше одного
            switch (temp) {
                case "-su":
                case "-us":
                    System.out.println("Hello, " + name + " of " + osName + "!");
                    break;
                case "-s":
                    System.out.println("Hello, " + osName + "!");
                    break;
                case "-u":
                    System.out.println("Hello, " + name + "!");
                    break;
                default:
                    System.out.println("Hello!");
            }
        } else { // если параметров больше 1
            System.out.println("Слишком много параметров, уважаемый! ");
        }
    }
}
