package com.icortex.common_problem;

public class MissingNumber {

    public static int missingNumber(int []arr){
        int n = arr.length + 1;
        int actualSum = (n * (n + 1))/2;
        int sum = sumOfArray(arr,0);

        return actualSum - sum;
    }

    public static int sumOfArray(int[] arr,int index){
        if(index >= arr.length){

            return 0;
        }
        return sumOfArray(arr,index+1) + arr[index];
    }

    public static void main(String[] args) {
        System.out.println("Missing number :"+missingNumber(new int[]{1,2,4,5}));

    }
}
