package com.icortex.principles.solid;

class PrintService{
    void printPassbook(){
        System.out.println("Passbook printed!");
    }
}

class LoanService{
    public void getLoanInterestInfo(String loanType){
        if(loanType.equalsIgnoreCase("Home")){
            System.out.println("Home loan");
        }else if(loanType.equalsIgnoreCase("Personal")){
            System.out.println("Personal loan");
        }else {
            System.out.println("Invalid loan type");
        }
    }
}

class NotificationService{
    public void sendOtp(String medium){

        if(medium.equalsIgnoreCase("email")){
            System.out.println("OTP sent In email");
        }

    }
}


public class singleResponsibility {
    // This is single responsibility
}
