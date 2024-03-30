package com.icortex.lambda;

interface MyNumber{
    double getValue();
}
public class LambdaDemo {
    public static void main(String[] args) {
        MyNumber myNumber;

        myNumber = () -> 123.45;
        System.out.println("A fixed value : "+myNumber.getValue());
    }
}
