package com.company;

public class Strings_1 {


    public static void main(String[] args) {
        String data = "При*вет*, мой дорог*ой друг! К*ак тв*ои д*ела?";
        replace(data);
    }

    // удаляет указанный символ * и выводит в консоль без него
    private static void replace(String data) {

// можно и так, с использованием стандартных методов
//        System.out.println(data.replace("*",""));
        String newData = ""; // в эту строку будет записываться новая строка
        char ch = '\u002A'; // искомый символ для замены - *
        for (int i = 0; i < data.length(); i++) { // проверяем каждый символ в строке
            if (data.charAt(i) != ch) { // если он не соответствует искомому
                newData += data.charAt(i); // добавляем его в новую строку
            }
        }
        System.out.println(newData); // выводим в консоль новую строку
    }
}
