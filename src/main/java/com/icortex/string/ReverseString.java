package com.icortex.string;

public class ReverseString {

    public static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static String reverseString2(String s){
        if(s == null || s.length() == 0) return s;
        char [] chars = s.toCharArray();
        String str = "";
        for(int i = chars.length - 1; i >= 0; i--){
            str += chars[i];
        }
        return str;
    }

    public static String reverseString3(char []s, int start, int end) {
        if(s == null || s.length == 0) return "";
        if(start >= end) return "";
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        reverseString3(s, start+1, end - 1);

        return new String(s);
    }

    public static void main(String[] args) {
        System.out.println("Reversed String is :"+reverseString("Mahin"));
        System.out.println("Reversed String is :"+reverseString2("Mahin"));
        System.out.println("Reversed String is :"+reverseString3("Mahin".toCharArray(),0,"mahin".length()-1));
    }
}
