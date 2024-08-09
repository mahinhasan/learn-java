package com.icortex.principles.solid;

interface UPIPayments{
    public void payMoney();
    public void getScratchCard();
    public void getCashBackCreditBank();
}

class GooglePay implements UPIPayments{

    @Override
    public void payMoney() {
        System.out.println("GooglePay support paymoney!");
    }

    @Override
    public void getScratchCard() {
        System.out.println("Google Pay support getScratchCard!");
    }

    @Override
    public void getCashBackCreditBank() {
        System.out.println("Google pay support CashBack!");
    }
}


class PayTm implements UPIPayments{

    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchCard() {

    }

    @Override
    public void getCashBackCreditBank() {
        // but paytm doesn't support cashback.This is forcing paytm class to implements this method.
    }
}

public class BadInterfaceSegregation {
}
