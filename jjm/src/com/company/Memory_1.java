package com.company;

public class Memory_1 {
    public static void main(String[] args) {
        final String HELLO = "Hello";
        String hello1 = HELLO;
        String hello2 = "Hello";
        String hello3 = "Hell" + "o";
        String hello4 = "Hell";
        hello4 += "o";

        System.out.println(hello1.equals(HELLO));
        System.out.println(hello2.equals(HELLO));
        System.out.println(hello3.equals(HELLO));
        System.out.println(hello4.equals(HELLO));
    }
}


