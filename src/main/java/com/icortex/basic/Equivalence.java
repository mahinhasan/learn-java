package com.icortex.basic;

public class Equivalence {
    public static void main(String[] args) {
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        System.out.println(n1.equals(n2)); // Use equals() for value comparison
        System.out.println(!n1.equals(n2)); // Use equals() for value comparison
    }
}
