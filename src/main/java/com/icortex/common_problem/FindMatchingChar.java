package com.icortex.common_problem;

public class FindMatchingChar {

    public static String matchingChar(String str1,String str2){
        String res = "";

        for(int i = 0; i < str1.length(); i++){
            char ch = str1.charAt(i);
            if(str2.contains(String.valueOf(ch))){
                res += ch;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(matchingChar("mahin","ahin"));

        System.out.println("mahin".contains(String.valueOf('a')));
    }
}
