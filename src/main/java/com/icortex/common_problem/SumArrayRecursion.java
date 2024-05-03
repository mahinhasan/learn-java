package com.icortex.common_problem;

public class SumArrayRecursion {

    public static int sumArray(int[] arr,int index) {
        if(index == arr.length) {
            return 0;
        }

        return arr[index] + sumArray(arr, index + 1);
    }

    public static void main(String[] args) {
        System.out.println(sumArray(new int[]{1,2,3,4,5}, 0));
    }
}
