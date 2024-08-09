package com.icortex.common_problem.binary_search;

public class FindInRotatedArray {

    public static int find(int[] arr, int target) {
        if (arr == null || arr.length == 0) return -1;
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            System.out.println(arr[mid]);
            if (arr[mid] == target) return mid;
            if(arr[mid] >= arr[start]){
                if(arr[mid] >= target && arr[start] <= target){
                    System.out.println("Mid : " + arr[mid] +" "+"start : " + arr[start] +" "+"end : " + arr[end]);
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                System.out.println("Mid : " + arr[mid] +" "+"start : " + arr[start] +" "+"end : " + arr[end]);

                if(arr[mid] <= target && arr[end] >= target ){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int []nums = {4,5,6,7,0,1,2,3};
        int target = 0;
        System.out.println(find(nums, target));
    }
}
