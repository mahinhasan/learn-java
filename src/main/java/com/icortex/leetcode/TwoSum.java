package com.icortex.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int []findTwoSum(int []arr,int target){
        Map<Integer, Integer> mp = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            int num = target - arr[i];
            if(mp.containsKey(num)){
                return new int[]{mp.get(num),i};
            }
            mp.put(arr[i],i);
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        int target = 16;
        int []arr = {2, 7,14,11,9, 15};
        int []res = findTwoSum(arr,target);
        System.out.println(res[1]);
    }
}
