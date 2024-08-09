package com.icortex.common_problem;

import java.util.HashMap;
import java.util.Map;

public class RearrangeString {

    public static String rearrange(String str){
        Map<Character, Integer> mp = new HashMap<>();

        int sum = 0;

        for(char ch : str.toCharArray()){
            if(Character.isDigit(ch)){
                sum += ch - '0';
            }else{
                mp.put(ch,mp.getOrDefault(ch,0) + 1);
            }
        }
        StringBuilder res = new StringBuilder();
        for(char ch : mp.keySet()){
            for(int i = 0; i < mp.get(ch); i++){
                res.append(ch);
            }
        }

        res.append(sum);

        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(rearrange("XY3BFA9KA2"));
    }
}
