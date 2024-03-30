package com.icortex.introduction;

public class UseStatic {
    static int a = 4;
    static  int b;

    static void meth(int x){
        System.out.println("a is :"+a);
        System.out.println("b is :"+b);
        System.out.println("x is :"+x);
    }

    static  {
        System.out.println("I am third");
    }

    public static void main(String[] args) {
        System.out.println("I am first");
        meth(10);
    }
}
