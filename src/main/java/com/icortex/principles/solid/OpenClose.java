package com.icortex.principles.solid;
// create a interface so that everyone can extend it which have need

interface NotificationService3{
    void sendOTP(String medium);
    void SendTransactionNotification(String medium);
}

class EmailNotification implements NotificationService3{
    public void sendOTP(String medium){
        System.out.println("Send Email otp");
    }

    public void SendTransactionNotification(String medium){
        System.out.println("This is transactional otp bia email");
    }
}

class MobileNotification implements NotificationService3{
    public void sendOTP(String medium){
        System.out.println("Send Mobile otp");
    }

    public void SendTransactionNotification(String medium){
        System.out.println("This is transactional otp via Mobile");
    }
}

public class OpenClose {
}
