package com.icortex.principles.solid;

public class BadSingleResponsibility {
    public long deposit(long amount,String accountNo){
        return amount * accountNo.length();
    }

    public long withdraw(long amount,String accountNo){
        return amount - deposit(amount,accountNo);
    }

    public void printPassbook(){
        System.out.println("Passbook printed!");
    }

    public void getLoanInterestInfo(String loanType){
        if(loanType.equalsIgnoreCase("Home")){
            System.out.println("Home loan");
        }else if(loanType.equalsIgnoreCase("Personal")){
            System.out.println("Personal loan");
        }else {
            System.out.println("Invalid loan type");
        }
    }

    public void sendOtp(String medium){

        if(medium.equalsIgnoreCase("email")){
            System.out.println("OTP sent In email");
        }

    }
}
