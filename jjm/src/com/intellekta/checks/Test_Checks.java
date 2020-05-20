package com.intellekta.checks;

public class Test_Checks {

    public static void main(String[] args) {


        ProductInfo[] productInfo = new ProductInfo[2];
        Transaction trans = new Transaction(0);
        Transaction.TransactionItem item1 = trans.new TransactionItem("one", 1);
        Transaction.TransactionItem item2 = trans.new TransactionItem("two", 2);
        productInfo[0]=item1;
        productInfo[1]=item2;
        Receipt.printReceipt(productInfo);
//        trans.printCheck();




//        Transaction trans = new Transaction(100);
//        trans.printCheck();
//        System.out.println();
//        Transaction.TransactionItem item1 = trans.new TransactionItem("one", 200);
//        item1.printInfo();
//        System.out.println();
//        trans.printCheck();
//        System.out.println();
//        Receipt.printTransactionInfo(item1);


//        trans.TransactionItem item1 = product.new



    }
}
