package com.icortex.exceptions;

public class ExceptionDemo {
    static void compute(int a) throws MyExceptions{
        System.out.println("Called compute ("+a + ")");
        if(a > 10){
            throw new MyExceptions(a);
        }
        System.out.println("Normal Exit");
    }

    public static void main(String[] args) {
        try {
            compute(1);;
            compute(20);
        }catch (MyExceptions e){
            System.out.println("Caught : "+e);
        }
    }
}
