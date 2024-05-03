package com.icortex.common_problem;

public class RangeSum {
    public static void main(String[] args) {
        int []arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int from = 2;
        int to = 5;

        int []preSum = new int[arr.length];
        preSum[0] = arr[0];

        for(int i = 1; i < arr.length; i++){
            preSum[i] = preSum[i-1] + arr[i];
        }

        int sum = preSum[to] - preSum[from];
        System.out.println(sum);
    }
}
