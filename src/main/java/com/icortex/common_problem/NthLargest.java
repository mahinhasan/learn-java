package com.icortex.common_problem;

import java.util.PriorityQueue;

public class NthLargest {

    public static int nthLargestNumber(int []nums,int n){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int num : nums){
            pq.add(num);
            if(pq.size() > n){
                pq.remove();;
            }
        }

        return pq.peek();
    }
}
