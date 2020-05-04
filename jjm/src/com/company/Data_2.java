package com.company;

public class Data_2 {

    private static void multiplication(int count_of_services, int count_of_debitores, double[] services, double[][] debitors, double[] result) {
        if (services.length == debitors[0].length) {
//            for (int j = 0; j < count_of_debitores; j++) {
//                double sum = 0;
//                for (int k = 0; k < count_of_services; k++) {
//                    sum += services[k] * debitors[k][j];
//                }
//                result[j] = sum;
//            }
            result = findDebitum(count_of_services, count_of_debitores, services, debitors);
            for (int l = 0; l < count_of_debitores; l++) {
                System.out.println(result[l]);
            }
        } else System.out.println("Cannot multiply matrix data!");
    }

    public static void main(String[] args) {

    }

    public static double[] findDebitum(int count_of_services, int count_of_debitores, double[] services, double[][] debitors) {
        double[] result = {};
        for (int j = 0; j < count_of_debitores; j++) {
            double sum = 0;
            for (int k = 0; k < count_of_services; k++) {
                sum += services[k] * debitors[k][j];
            }
            result[j] = sum;
        }
        return result;
    }
}
