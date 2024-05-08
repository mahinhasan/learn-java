package com.icortex.common_problem;

import java.util.PriorityQueue;

public class SmallestFinder {

    public static int findSmallest(int[] array) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i = 0; i < array.length; i++) {
            minHeap.add(array[i]);
        }
        return minHeap.peek();
    }

    public static int nthSmallest(int[] array,int n) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i = 0; i < array.length; i++) {
            minHeap.add(array[i]);
        }

        for(int i = 0; i < n; i++) {
            if(minHeap.size() > n) {
                minHeap.poll();
            }
        }

        return minHeap.peek();

    }

    public static void main(String[] args) {
        System.out.println("Smallest number is :"+findSmallest(new int[]{3,4,5,6,7,8,91,2}));
        System.out.println("Nth smallest number is : "+nthSmallest( new int[]{3,4,5,6,7,8,91,2},3));
    }
}
