package com.icortex.common_problem;

public class reverseString {

    public static String reverseString(String str){
        if(str.isEmpty()){
            return str;
        }
        return  reverseString(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(reverseString("Hello World"));
    }

}
