package com.intellekta.checks;

public class Receipt {

    public static void printReceipt(ProductInfo[] products) {
        Transaction transaction = new Transaction(0);
        for (int i = 0; i < products.length; i++) {
            Transaction.TransactionItem anotherItem = transaction.new TransactionItem(products[i].name, products[i].price);
//            System.out.printf("name = %s%n", products[i].name);
//            System.out.printf("price = %f%n", products[i].price);
            anotherItem.printInfo();
        }
        transaction.printCheck();
    }

    public static void printTransactionInfo(Transaction.TransactionItem example) {
        example.getTransaction().printCheck();
    }
}