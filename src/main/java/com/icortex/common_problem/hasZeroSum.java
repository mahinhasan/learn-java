package com.icortex.common_problem;

import java.util.HashSet;
import java.util.Set;

public class hasZeroSum {

    public static boolean hasZeroSum(int[] arr) {
        int sum = 0;

        Set<Integer> st = new HashSet<>();
        st.add(0);

        for(int num : arr){
            sum += num;

            if(st.contains(sum)){
                return true;
            }

            st.add(sum);
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println("Sub Array Exists :"+hasZeroSum(new int[]{4, -6, 3, -1, 4, 2, 7}));
    }
}
