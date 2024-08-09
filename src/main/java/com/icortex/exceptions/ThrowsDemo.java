package com.icortex.exceptions;

public class ThrowsDemo {

    static void demo() throws IllegalAccessException{
        System.out.println("Inside throw");
        throw new NullPointerException("demo");
    }

    public static void main(String[] args) {
        try {
            demo();
        }catch (IllegalAccessException e){
            System.out.println("Caught :"+e);
        }
    }
}
