package com.icortex.enumeration.autoboxing;

public class UnboxingError {
    public static void main(String[] args) {
        Integer ob = 1000;
        int i = ob.byteValue();
        System.out.println(i);
    }
}
