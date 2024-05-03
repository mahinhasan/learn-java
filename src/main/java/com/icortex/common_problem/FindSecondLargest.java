package com.icortex.common_problem;

import java.util.PriorityQueue;

public class FindSecondLargest {

    private static int secondLargestNumber(int[] arr) {
        PriorityQueue pq = new PriorityQueue();

        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
            if(pq.size() > 2) {
                pq.poll();
            }
        }
        return (int) pq.peek();
    }

    public static void main(String[] args) {
        System.out.println(secondLargestNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
    }
}
