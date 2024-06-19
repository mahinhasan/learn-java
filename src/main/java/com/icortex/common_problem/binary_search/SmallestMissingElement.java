package com.icortex.common_problem.binary_search;

public class SmallestMissingElement {

    public static int findSmallestMissing(int[] arr,int left,int right) {

        while(left <= right) {
            int mid = (left + right) / 2;
            if(arr[mid] == mid) {
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args)
    {
        int[] nums = { 0, 1, 2, 3, 4, 5, 6 };

        int left = 0, right = nums.length - 1;
        System.out.println("The smallest missing element is "
                + findSmallestMissing(nums, left, right));
    }
}
