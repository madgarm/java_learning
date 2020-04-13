package com.company;

public class Upr3 {

    public static void main(String[] args) {
        args = new String[]{"-u"};
        sayHello(args);
    }

    public static void sayHello(String[] args) {

        String name = System.getProperty("user.name"); // присваиваем переменной name значение имени пользователя
        String temp = ""; // объявляем временную переменную temp для перевода массива в строку

        if (args.length == 1) { // проверяем длину массива параметров, параметров должно быть не больше одного
            temp += args[0]; // берем 0-й элемент массива и прибавляем к пустой строке temp

            String sayHelloText = (temp.contains("-u")) ? ("Hello, " + name + "!") : "Hello!";
            /*
            в зависимости от условия - если переменная temp содержит -u, тогда присваиваем переменной sayHelloText
            значение приветствия с именем, в ином случае - просто приветствие
             */

            System.out.println(sayHelloText); // выводим значение переменной sayHelloText
        } else { // в ином случае (длина массива не равна 1)
            System.out.println("Или нет параметров или много параметров, нужен только один");
            // выводим значение переменной sayHelloText
        }
    }
}
