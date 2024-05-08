package com.icortex.common_problem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class RemoveMinNumberOfElement {

    public static int removeMin(int[] arr1,int [] arr2) {
        Map<Integer, Integer> mp1 = new HashMap<>();
        Map<Integer, Integer> mp2 = new HashMap<>();

        for (int i = 0; i < arr1.length; i++) {
            if(mp1.containsKey(arr1[i])){
                mp1.put(arr1[i],mp1.get(arr1[i])+1);
            }else{
                mp1.put(arr1[i],1);
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            if(mp2.containsKey(arr2[i])){
                mp2.put(arr2[i],mp2.get(arr2[i])+1);
            }else{
                mp2.put(arr2[i],1);
            }
        }


        int res = 0;
        Set<Integer> st = mp1.keySet();

        for(int n : st){
            if(mp2.containsKey(n)){
                res += Math.min(mp1.get(n),mp2.get(n));
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4 };
        int b[] = { 2, 3, 4, 5, 8 };

        System.out.println(removeMin(a,b));

    }

}
