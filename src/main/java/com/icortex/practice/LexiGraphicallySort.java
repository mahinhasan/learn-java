package com.icortex.practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class LexiGraphicallySort {
    public static void main(String[] args) {
        int []nums = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        String []strs = new String[nums.length];

        for(int i = 0; i < nums.length; i++){
            strs[i] = Integer.toString(nums[i]);
        }

        Arrays.sort(strs, Comparator.naturalOrder());

        for (String str : strs){
            System.out.println(str);
        }

    }
}
