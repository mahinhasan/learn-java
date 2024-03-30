package com.icortex.basic;
import java.util.ArrayList;
import java.util.List;

public class RemoveZeroSumSubarrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, -3, 1};
        int[] arr2 = {1, 2, 1};

        System.out.println("Result 1: " + removeZeroSumConsecutive(arr1));
        System.out.println("Result 2: " + removeZeroSumConsecutive(arr2));
    }

    public static List<Integer> removeZeroSumConsecutive(int[] arr) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            boolean foundZeroSum = false;

            for (int j = i + 1; j < arr.length; j++) {
                sum += arr[j];

                if (sum == 0) {
                    foundZeroSum = true;
                    i = j; // skip elements up to j
                    break;
                }
            }

            if (!foundZeroSum)
                result.add(arr[i]);
        }

        return result;
    }
}
