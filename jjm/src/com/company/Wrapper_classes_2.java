package com.company;

public class Wrapper_classes_2 {
    public static void main(String[] args) {
        int inputData = 1550000000;
        NumberConverter test = new NumberConverter();
        test.printAll(inputData);
    }

    public static class NumberConverter {

        public static void printAll(int instance) {
            Integer intInstance = instance;
            System.out.printf("%d in BIN: %s%n", instance, Integer.toBinaryString(intInstance));
            System.out.printf("%d in OCT: %s%n", instance, Integer.toOctalString(intInstance));
            System.out.printf("%d in HEX: %s%n", instance, Integer.toHexString(intInstance));
        }
    }
}

