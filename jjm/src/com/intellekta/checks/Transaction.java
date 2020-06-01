package com.intellekta.checks;

public class Transaction {

    private double price; // поле цены
    private double tax = 1.2; // поле ставки налога

    public Transaction(double price) {  // конструктор с параметром цены
        this.price = price;
    }

    public Transaction() { // конструктор без параметров
        this.price = 0; // значение по умолчанию
    }

    public double getPrice() { // геттер
        return price;
    }

    double dealPrice() { // метод подсчета стоимости с учетом налога
        return price * tax;
    }

    private void printCheck(double price) { // метод для вывода на экран цены
        System.out.println(String.format("price: %.2f USD", price)); // по маске
    }

    public void printCheck() { // метод для вывода общей информации по заказу
        System.out.print("Order ");
        printCheck(price);
        System.out.print("Total ");
        printCheck(tax * price);
    }

    public class TransactionItem extends ProductInfo { // внутренний класс

        static final String defaultName = "Default"; // название по умолчанию

        public TransactionItem(String name, double price) { // конструктор с параметрами
            this.name = (name == null || name.equals("")) ? defaultName : name; // проверка на null и пустоту
            this.price = (price < 0) ? 0 : price; // проверка на отрицательность
            if (price > 0) { // если цена норм
                Transaction.this.price += price; // то меняем общий параметр цены
            }
        }

        Transaction getTransaction() { // геттер
            return Transaction.this;
        }

        void printInfo() { // метод вывода на экран названия
            System.out.printf("Item: %s, ", name);
            Transaction.this.printCheck(price);
        }
    }
}