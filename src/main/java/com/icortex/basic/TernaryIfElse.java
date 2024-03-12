package com.icortex.basic;

public class TernaryIfElse {
    public static int ternary(int x){
        return x > 10 ? x * 100 : x;
    }

    public static int standard(int x){
        if(x > 10){
            return x * 100;
        }else{
            return x;
        }
    }

    public static void main(String[] args) {
        System.out.println(ternary(11));
        System.out.println(standard(9));
    }
}
