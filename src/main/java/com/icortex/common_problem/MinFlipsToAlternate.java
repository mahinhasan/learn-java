package com.icortex.common_problem;

public class MinFlipsToAlternate {

    public static int minFlip(String str){
        int count = 0;
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == str.charAt(i-1)){
                count++;
            }
        }

        return count / 2;
    }

    public static int minFlipNeed(String str){
        int flip0 = 0;
        int flip1 = 0;
        int flag0 = 0;
        int flag1 = 1;

        for(int i = 0; i< str.length(); i++){
            if(flag0 != str.charAt(i) - '0'){
                flip0++;
            }
            flag0 = 1 - flag0;
        }

        for(int i = 0; i< str.length(); i++){
            if(flag1 != str.charAt(i) - '0'){
                flip1++;
            }
            flag1 = 1 - flag1;
        }

        return flip0  > flip1  ? flip1 : flip0;
    }

    public static void main(String[] args) {
        System.out.println(minFlipNeed("1001"));
    }
}
