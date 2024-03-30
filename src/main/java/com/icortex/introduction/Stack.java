package com.icortex.introduction;

public class Stack {
    int [] stack = new int[10];
    int tos;
    Stack(){
        tos = -1;
    }

    void push(int i){
        if(tos == 9){
            System.out.println("Stack is full");
        }else{
            stack[tos++] = i;
        }
    }
    int pop(){
        if(tos < 0){
            System.out.println("Stack is empyt");
            return 0;
        }else{
            return stack[tos--];
        }
    }
}
