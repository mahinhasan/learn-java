package com.icortex.principles.solid;

class NotificationService2{

    public void SendOTP(String medium){
        if(medium.equalsIgnoreCase("email")){
            System.out.println("Email otp sent");
        }
    }
}

public class BadOpenClose {
    /// now if i need to send other type of otp we need to change existing code thats violates the single responsibility too
    /// This also violates the OCP.
    // Solve this issue.
}
