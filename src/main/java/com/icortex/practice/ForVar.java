package com.icortex.practice;

public class ForVar {
    public static void main(String[] args) {
        int i ;
        boolean done = false;
        i = 0;
        for(;!done;){
            System.out.println("I is :"+ i);
            if(i == 10){
                done = true;
            }
            i++;
        }

        String str = null;
        System.out.println(str instanceof String);
    }
}
