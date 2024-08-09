package com.icortex.Interface;

public class IFTest {

    public static void main(String[] args) {
        FixedStack fixedStack = new FixedStack(5);

        for (int i = 0; i < 5; i++) {
            fixedStack.push(i);
        }

        System.out.println(fixedStack.pop());
    }
}
