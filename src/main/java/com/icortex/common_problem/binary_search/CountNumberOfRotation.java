package com.icortex.common_problem.binary_search;
class CountNumberOfRotation {
    public static int findRotationCount(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] <= nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        int[] nums = { 8, 9, 10, 1, 2, 3, 4, 5, 6, 7 };
        System.out.println("Array is rotated " + findRotationCount(nums) + " times");
    }
}
