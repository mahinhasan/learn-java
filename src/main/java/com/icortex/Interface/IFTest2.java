package com.icortex.Interface;

public class IFTest2 {
    public static void main(String[] args) {
        DynamicStack dm = new DynamicStack(5);

        for (int i = 0; i < 10; i++) {
            dm.push(i);
        }

        System.out.println("Las element is : "+dm.pop());
    }
}
