package com.icortex.common_problem;

public class NumberToWords {

    private static final String[] ones = {
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
    };

    private static final String[] teens = {
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    private static final String[] tens = {
            "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };
    public static String numberToWords(int n) {

        if(n == 0){
            System.out.println("Zero");
        }

        return convertToString(n).trim();
    }

    public static String convertToString(int n){
        String res = "";

        if(n < 10){
            res = ones[n];
        }else if(n < 20){
            res = teens[n - 10];
        }else if(n < 100){
            res = tens[n / 10] + " " + ones[n % 10];
        }else if(n < 1000){
            res = ones[n / 100] + " hundred "+convertToString(n % 100);
        }else if(n < 10000){
            res = ones[n / 1000] + " thousand "+convertToString(n % 1000);
        }

        return res;
    }


    public static void main(String[] args) {
        System.out.println(numberToWords(300));
    }
}
