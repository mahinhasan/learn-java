package com.icortex.design_pattern.creational;

interface Bank{
    String getBankName();
}

class HDFC implements Bank{

    private final  String bankName;
    public HDFC() {
        this.bankName = "HDFC BANK";
    }
    @Override
    public String getBankName() {
        return bankName;
    }
}


class IFIC implements Bank{

    private final  String bankName;
    public IFIC() {
        bankName = "IFIC Bank";
    }
    @Override
    public String getBankName() {
        return bankName;
    }
}

abstract class Loan{
    protected double rate;
    abstract void getInterestRate(double r);

    public void calculateLoanPayment(double loanAmount,int years){
        double EMI;
        int n;
        n=years*12;
        rate=rate/1200;
        EMI=((rate*Math.pow((1+rate),n))/((Math.pow((1+rate),n))-1))*loanAmount;

        System.out.println("your monthly EMI is "+ EMI +" for the amount "+loanAmount+" you have borrowed");
    }
}

class HomeLoan extends Loan{

    @Override
    public void getInterestRate(double r) {
        rate = r;
    }
}

class EducationLoan extends Loan{
    public void getInterestRate(double r){
        rate=r;
    }
}

abstract class BankHandler{
    public abstract Bank getBank(String bank);
    public abstract Loan getLoan(String loan);
}


class BankFactory extends BankHandler{

    @Override
    public Bank getBank(String bank) {
        if(bank == null){
            return  null;
        }
        if(bank.equalsIgnoreCase("HDFC")){
            return new HDFC();
        }else if(bank.equalsIgnoreCase("IFIC")){
            return new IFIC();
        }else {
            return null;
        }
    }

    @Override
    public Loan getLoan(String loan) {
        return null;
    }
}

class LoanFactory extends BankHandler {

    @Override
    public Bank getBank(String bank) {
        return null;
    }

    @Override
    public Loan getLoan(String loan) {
        if(loan == null){
            return null;
        }
        if(loan.equalsIgnoreCase("Home")){
            return new HomeLoan();
        } else if(loan.equalsIgnoreCase("Education")){
            return new EducationLoan();
        }
        return null;
    }
}

class FactoryCreator {
    public static BankHandler getFactory(String choice){
        if(choice.equalsIgnoreCase("Bank")){
            return new BankFactory();
        }else{
            return new LoanFactory();
        }
    }
}

public class AbstractFactory {
    public static void main(String[] args) {
        BankHandler bankFactory = FactoryCreator.getFactory("Bank");
        Bank bank = bankFactory.getBank("HDFC");
        System.out.println("Bank Name: " + bank.getBankName());

        BankHandler loanFactory = FactoryCreator.getFactory("Loan");
        Loan loan = loanFactory.getLoan("Home");
        System.out.println("Loan Type: " + loan.getClass().getSimpleName());
    }
}
