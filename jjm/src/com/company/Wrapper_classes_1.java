package com.company;

public class Wrapper_classes_1 {
    public static void main(String[] args) {
        Long one = 1200008L;
        TypeSelector qwe = new TypeSelector();
        System.out.println(qwe.selectClass(one));
    }

    public static class TypeSelector {

        public static Object selectClass(Long instance) {
            if (instance == null) {
                Object result = instance;
                return result;
            } else {
                if (instance >= -Math.pow(2, 7) && instance <= Math.pow(2, 7) - 1) {
                    Byte result = instance.byteValue();
                    System.out.println(result.getClass());
                    return result;
                } else if (instance >= -Math.pow(2, 15) && instance <= Math.pow(2, 15) - 1) {
                    Short result = instance.shortValue();
                    System.out.println(result.getClass());
                    return result;
                } else if (instance >= -Math.pow(2, 32) && instance <= Math.pow(2, 32) - 1) {
                    Integer result = instance.intValue();
                    System.out.println(result.getClass());
                    return result;
                } else if (instance >= -Math.pow(2, 63) && instance <= Math.pow(2, 63) - 1) {
                    Long result = instance.longValue();
                    System.out.println(result.getClass());
                    return result;
                } else {
                    Object result = instance;
                    return result;
                }
            }
        }
    }
}

