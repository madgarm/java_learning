package com.company;

public class Main {

    public static void main(String[] args) {
        args = new String[]{"-u", "-s"};
        sayHello(args);
    }

    public static void sayHello(String[] args) {
        String osName = System.getProperty("os.name"); // присваиваем переменной osName значение имени системы
        String name = System.getProperty("user.name"); // присваиваем переменной name значение имени пользователя
        String temp = ""; // объявляем временную переменную temp для перевода массива в строку

        for (String num : args) { // перебираем все элементы массива параметров
            temp += num; // каждый элемент массива переводим в строчный тип и добавляем к переменной temp
        }

        if (args.length <= 2) { // проверяем длину массива параметров, параметров должно быть не больше двух
            if (temp.contains("-s") && temp.contains("-u")) { // проверяем одновременное наличие символов -s и -u в temp
                System.out.println("Hello, " + name + " of " + osName + "!");
            } else if (temp.contains("-s")) { // проверяем наличие символов -s в temp
                System.out.println("Hello, " + osName + "!");
            } else if (temp.contains("-u")) { // проверяем наличие символов -u в temp
                System.out.println("Hello, " + name + "!");
            } else { // если ни -s, ни -u нет в temp
                System.out.println("Hello!");
            }
        } else { // если параметров больше 2
            System.out.println("Слишком много параметров, уважаемый! ");
        }
    }
}
