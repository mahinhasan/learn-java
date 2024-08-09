package com.icortex.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> three_sum(int []arr){
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(arr);
        for(int i = 0; i < arr.length - 2; i++){
            if(i > 0 && arr[i] == arr[i-1]){
                continue;
            }

            int j = i + 1;
            int k = arr.length - 1;

            while(j < k){
                int sum = arr[i] + arr[j] + arr[k];

                if(sum < 0){
                    j++;
                    while(arr[j] == arr[j-1] && j < k) ++j;
                }else if(sum > 0){
                    k--;
                    while(arr[k] == arr[k+1] && j < k) --k;
                }else{
                    List<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(arr[k]);
                    j++;
                    k--;

                    while(j < k && arr[j] == arr[j-1]){
                        j++;
                    }

                    while(j < k && arr[k] == arr[k + 1]){
                        k--;
                    }
                    res.add(temp);
                }
            }
        }


        return res;
    }


    public static void main(String[] args) {
        int []S = {-1 ,0 ,1, 2 -1 -4};
        List<List<Integer>> res = three_sum(S);

        System.out.println(res);
    }
}
