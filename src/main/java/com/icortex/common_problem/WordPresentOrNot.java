package com.icortex.common_problem;

import java.util.HashSet;
import java.util.Set;

public class WordPresentOrNot {

    public static boolean checkPresentOrNOt(String sentence,String word){

        Set<String> st = new HashSet<>();
        String []strings = sentence.split("\\s+");

        for(String str : strings){
            if (str.equals(word)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkPresentOrNOt("I am mahin","mahina"));
    }
}
