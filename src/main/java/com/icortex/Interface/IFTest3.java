package com.icortex.Interface;

/*
    Create an interface variable and
    access stack throw it;
 */

public class IFTest3 {
    public static void main(String[] args) {
        IntStack myStack; // Create a interface reference variable

        DynamicStack dynamicStack = new DynamicStack(5);
        FixedStack fixedStack = new FixedStack(8);

        myStack = dynamicStack; // load dynamic stack;

        for (int i = 0; i < 12; i++){
            myStack.push(i);
        }

        myStack = fixedStack; // load fixed stack

        for (int i = 0; i < 8; i++){
            myStack.push(i);
        }

        // out from dynamic stack
        for (int i = 0; i < 12; i++){
            System.out.println("Dynamic stack!");
            System.out.print(myStack.pop());
        }

    }
}
