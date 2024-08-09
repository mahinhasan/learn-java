package com.icortex.leetcode;

public class NextParmutation {

    public static void nextPermutation(int []nums){
        find_next_permutation(nums,0,nums.length);
    }

    public static boolean find_next_permutation(int []nums,int begin,int end){

        int p = end - 2;
        while(p > -1 && nums[p] >= nums[p+1]){
            --p;
        }

        if(p == -1){
            reverse(nums,begin,end);
            return false;
        }

        int c = end - 1;
        while (c > 0 && nums[c] <= nums[p]){
            --c;
        }

        swap(nums,p,c);
        reverse(nums,p+1,end);
        return true;
    }

    public static void swap(int []nums,int start,int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    public static void reverse(int []nums,int start,int end){
        end--;
        while (start < end){
            swap(nums,start++,end--);
        }
    }

    public static void main(String[] args) {
        int []nums = {1,2,3};
        nextPermutation(nums);

        for(int i = 0; i < nums.length; i++){
            System.out.printf(nums[i]+" ");
        }
    }
}
