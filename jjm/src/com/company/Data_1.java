package com.company;

public class Data_1 {


    private static void letsChangeAB(int a, int b) {
        a = b;
    }

    private static int letsChangeABC(int a, int b, int c) {
        c = a * b - c;
        return c;
    }

    public static void main(String[] args) {
        int a = 12;
        int b = 15;
        int c = -7;

        a = letsChangeABC(a, b, c);
        letsChangeAB(a, b);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
