package com.intellekta.checks;

public class Transaction {

    private double price;
    private double tax=1.2;

    public Transaction(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    double dealPrice() {
        return price*tax;
    }

    private void printCheck(double price) {
        System.out.println(String.format("price: %.2f", price));
//        System.out.printf("price: %.2f", price);
    }

    public void printCheck() {
        System.out.print("Order ");
        printCheck(price);
        System.out.print("Total ");
        printCheck(tax*price);
    }

    public class TransactionItem extends ProductInfo  {

        private String name; // название товара
        private double price; // цена единицы товара
        static final String defaultName = "Default"; // название по умолчанию


        public TransactionItem(String name, double price) {
            this.name = (name == null || name.equals("")) ? defaultName : name;
            this.price = (price < 0) ? 0 : price;
            Transaction.this.price += price;
        }

        Transaction getTransaction() {
            return Transaction.this;
        }

        void printInfo() {
            System.out.printf("Item: %s, ", name);
            Transaction.this.printCheck(price);
        }
    }
}