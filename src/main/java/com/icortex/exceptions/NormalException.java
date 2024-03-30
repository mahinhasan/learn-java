package com.icortex.exceptions;


class Exc1{
    static void subroutine(){
        try {
            int d = 0;
            int a = 20 / d;
        }catch (ArithmeticException e){
            System.out.println("Division by zero error !");
        }

    }
}
public class NormalException {
    public static void main(String[] args) {
        Exc1.subroutine();
    }
}
