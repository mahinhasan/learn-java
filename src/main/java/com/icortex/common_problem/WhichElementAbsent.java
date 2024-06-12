package com.icortex.common_problem;

import java.util.HashMap;
import java.util.Map;

public class WhichElementAbsent {

    public static int findWhichElementIsAbsent(int []arr,int []arr1){
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }

        for(int i = 0; i < arr1.length; i++){
            if(mp.containsKey(arr1[i])){
                mp.put(arr1[i],mp.get(arr1[i])-1);
            }
        }

        for(int n : mp.keySet()){
            if(mp.get(n) != 0){
                return n;
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        int []arr1 = {1,2,3,4,5};
        int []arr2 = {1,2,3,5};
        System.out.println(findWhichElementIsAbsent(arr1,arr2));
    }
}
