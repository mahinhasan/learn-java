package com.icortex.principles.solid;

interface BankCard{

    public void doTransaction(int amount);
}

class DebitCardNew implements BankCard{

    @Override
    public void doTransaction(int amount) {
        System.out.println("Payment done with debitCard");
    }
}

class CreditCardNew implements BankCard{

    @Override
    public void doTransaction(int amount) {
        System.out.println("Payment done with credit card!");
    }
}

class ShopingMallNew {

    private BankCard bankCard;

    public ShopingMallNew(BankCard bankCard){
        this.bankCard = bankCard;
    }

    public void doPayment(Object order,int amount){
        bankCard.doTransaction(amount);
    }
}

public class DependencyInversion {

    public static void main(String[] args) {
        BankCard bankCard = new CreditCardNew();
        ShopingMallNew shopingMall = new ShopingMallNew(bankCard);
        shopingMall.doPayment(bankCard,1000);
    }
}
