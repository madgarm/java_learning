package com.company;

public class Wrapper_classes_1 {
    public static void main(String[] args) {
        Long one = 1223452L;
        TypeSelector qwe = new TypeSelector();
        System.out.println(qwe.selectClass(one));
    }

    public static class TypeSelector {

        public static Class selectClass(Long instance) {
            if (instance == null) {
                return Object.class;
            } else {
                if (instance >= -Math.pow(2, 7) && instance <= Math.pow(2, 7) - 1) {
                    return Byte.class;
                } else if (instance >= -Math.pow(2, 15) && instance <= Math.pow(2, 15) - 1) {
                    return Short.class;
                } else if (instance >= -Math.pow(2, 32) && instance <= Math.pow(2, 32) - 1) {
                    return Integer.class;
                } else if (instance >= -Math.pow(2, 63) && instance <= Math.pow(2, 63) - 1) {
                    return Long.class;
                } else {
                    return Object.class;
                }
            }
        }
    }
}

