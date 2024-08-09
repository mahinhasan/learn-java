package com.icortex.lambda;

interface NumericTest{
    boolean test(int a,int b);
}
public class LambdaDemo2 {
    public static void main(String[] args) {
        NumericTest isFactor = (n,d)->(n % d) == 0;

        if(isFactor.test(10,2)){
            System.out.println("2 is a factor of 10");
        }
    }
}
