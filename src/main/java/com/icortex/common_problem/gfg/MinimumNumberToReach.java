package com.icortex.common_problem.gfg;

public class MinimumNumberToReach {

    public static int minimumNumberNeed(int n,int curr){
        if(curr == n){
            return 0;
        }

        if(curr > n){
            return Integer.MAX_VALUE;
        }

        int byAdd = minimumNumberNeed(n,curr+1);
        int byDouble = minimumNumberNeed(n,curr * 2);

        return Math.min(byAdd,byDouble);
    }


    public static void main(String[] args) {

    }
}
