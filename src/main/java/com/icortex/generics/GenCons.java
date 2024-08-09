package com.icortex.generics;

public class GenCons {
    private double val;
    <T extends Number> GenCons(T arg){
        val = arg.doubleValue();
    }

    void showVal(){
        System.out.println("Value is : "+val);
    }

    public static void main(String[] args) {
        GenCons g = new GenCons(100);
        GenCons g1 = new GenCons(123.0F);
        g.showVal();
        g1.showVal();
    }
}
