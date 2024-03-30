package com.icortex.exceptions;

public class ThrowDemo {

    static void throwDemo(){
        try {
            throw  new NullPointerException("Demo");
        }catch (NullPointerException e){
            System.out.println("Caught inside throw demo");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            throwDemo();
        }catch (NullPointerException e){
            System.out.println("Recaught :"+e);
        }
    }
}
