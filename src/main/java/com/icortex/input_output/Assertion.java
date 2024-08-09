package com.icortex.input_output;

public class Assertion {
    static int num = 3;
    static int getNum(){
        return num--;
    }

    public static void main(String[] args) {

        int n;
        for(int i = 0; i < 10; i++){
            n = getNum();
            assert  n > 0;
            System.out.println("N is : "+n);
        }
    }
}
