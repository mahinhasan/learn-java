package com.icortex.principles.solid;

interface UPIPayments1{
    public void payMoney();
    public void getScratchCard();
}

interface CashBackManager{
    public void getCashBackCreditBank();
}

class GooglePay1 implements UPIPayments1,CashBackManager{

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
        System.out.println("Goople pay support Cashback!");
    }


}


class PayTm1 implements UPIPayments1{

    @Override
    public void payMoney() {
        System.out.println("Paytm support paymoney!");
    }

    @Override
    public void getScratchCard() {
        System.out.println("Paytm support Scratch card!");
    }


}


public class InterfaceSegregation
{
}
