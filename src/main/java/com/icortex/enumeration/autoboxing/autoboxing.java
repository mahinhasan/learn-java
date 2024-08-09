package com.icortex.enumeration.autoboxing;

public class autoboxing {
    static int m(Integer m){
        return m;
    }

    public static void main(String[] args) {
        Integer iob = m(100);
        System.out.println(iob);
    }
}
