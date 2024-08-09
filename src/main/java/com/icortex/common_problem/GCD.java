package com.icortex.common_problem;

public class GCD {

    public static int gcd(int n1,int n2){
        if(n2 == 0){
            return n1;
        }
        return gcd(n2,n1 % n2);
    }

    public static void main(String[] args) {
        System.out.println(gcd(2,6));
    }
}
