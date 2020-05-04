package com.company;

public class Data_3 {
    public static void method1(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void method2(String str) {
        str = "123";
        method3();
    }

    public static int method3() {
        int a = 0, b = 1;
        method1(a, b);
        return a;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        String str = "Hello";
        a = method3();
        method1(a, b);
        method2(str);

        System.out.println(a);
        System.out.println(b);
        System.out.println(str);
    }
}
