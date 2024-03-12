package com.icortex.basic;

public class StringOperator {
    public static void main(String[] args) {
        int x = 0,y = 1,z = 2;
        Integer num = 5;
        String s = "";
        System.out.println("Instance of :"+(num instanceof Integer));
        System.out.println((s + x) instanceof String);

        int big = Integer.MAX_VALUE;
        System.out.println("Big integer : "+big);
        long bigger = big * 4;
        System.out.println("Bigger : "+bigger);
    }
}
