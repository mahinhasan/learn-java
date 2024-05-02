package com.icortex.principles.solid;

class DebitCard{

    public void doTransaction(Object o){
        System.out.println("Payment done with debit card!");
    }
}

class CreditCard{

    public void doTransaction(){
        System.out.println("Payment done with credit card!");
    }
}

class ShopingMall{
    private DebitCard debitCard;
    public ShopingMall(DebitCard debitCard){
        this.debitCard = debitCard;
    }

    public void doPayment(Object order,int amount){
        debitCard.doTransaction(order);
    }
}

public class BadDependencyInversion {

    public static void main(String[] args) {
        DebitCard debitCard = new DebitCard();
        ShopingMall shopingMall = new ShopingMall(debitCard);
        shopingMall.doPayment(debitCard,1000);
        // This is wrong design of code. Shopingmall is tightly coupled.
        //now there is some error in your debit card and user want to go with
        // Credit card then this won’t be possible because ShoppingMall is tightly couple with Debit Card
    }

}


