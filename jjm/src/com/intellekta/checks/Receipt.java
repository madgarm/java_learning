package com.intellekta.checks;

public class Receipt {

    public static void printReceipt(ProductInfo[] products) { // принимает массив из элементов класса ProductInfo
        Transaction transaction = new Transaction(0); // создаем экземпляр класса Transaction с нулевым стартовым значением
        for (int i = 0; i < products.length; i++) {
            // наполняем записями
            Transaction.TransactionItem anotherItem = transaction.new TransactionItem(products[i].name, products[i].price);
            anotherItem.printInfo(); // и параллельно выводим на экран
        }
        transaction.printCheck(); // выводим общий результат по заказу
    }

    public static void printTransactionInfo(Transaction.TransactionItem example) { // берет экземпляр класса TransactionItem
        example.getTransaction().printCheck(); // выводит на экран информацию по общей транзакции
    }
}