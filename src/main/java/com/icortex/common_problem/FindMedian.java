package com.icortex.common_problem;

public class FindMedian {
    public static double findMedianSortedArray(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;

        int []merged = new int[m + n];
        int i = 0, j = 0,k = 0;
        while(i < m && j < n){
            if(nums1[i] <= nums2[j]){
                merged[k++] = nums1[i++];
            }else{
                merged[k++] = nums2[j++];
            }
        }

        while(i < m){
            merged[k++] = nums1[i++];
        }

        while(j < n){
            merged[k++] = nums1[j++];
        }

        int totalLen = m + n;

        if(totalLen % 2 == 0){
            return (merged[totalLen / 2 - 1] + merged[totalLen/2]) / 2.0 ;
        }else{
            return merged[totalLen/2];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5};
        int[] nums2 = {2, 4, 6};
        double median = findMedianSortedArray(nums1, nums2);
        System.out.println("Median: " + median);
    }
}
