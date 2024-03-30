package com.icortex.controling_execution;

public class WhileTest {
    static boolean condition(){
        boolean res = Math.random() < 0.99;
        System.out.print(res +" " );
        return res;
    }
    public static void main(String[] args) {
        int x =0;
        while(condition()){
            System.out.println("Inside while loop!");
        }

        System.out.println("Now out!");
    }
}
