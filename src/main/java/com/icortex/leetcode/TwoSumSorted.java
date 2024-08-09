package com.icortex.leetcode;

public class TwoSumSorted {

    public static int[] towSumSorted(int []arr,int target){
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int sum = arr[start] + arr[end];
            if(sum < target){
                start++;
            }else if(sum > target){
                end--;
            }else {
                return new int[]{start,end};
            }
        }

        return null;
    }


    public static void main(String[] args) {
        int target = 9;
        int []arr = {2,7,11,15};
        int []res = towSumSorted (arr,target);
        System.out.println(res[1]);
    }
}
