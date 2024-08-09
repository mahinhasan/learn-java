package com.icortex.exceptions;

public class NestedTry {
    public static void main(String[] args) {
        try {
            int a = args.length;
            int b = 42 /a;

            try {
                if(a == 1){
                    a = a / (a- a);
                }
                if(a == 2){
                    int c[] = {2};
                    c[42] = 900;
                }
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Array index out of bound!");
            }
        }catch (ArithmeticException e){
            System.out.println("Divided by 0 : "+e);
        }
    }
}
