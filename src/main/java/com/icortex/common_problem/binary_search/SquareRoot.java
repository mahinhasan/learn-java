package com.icortex.common_problem.binary_search;

public class SquareRoot {

    public static int squareRoot(int n){
        int res = 0;

        if(n < 2){
            return n;
        }

        int start = 1;
        int end = n / 2;

        while(start <= end){
            int mid = (start + end) / 2;
            long sqr = mid * mid;

            if(sqr == n){
                return mid;
            }

            else if(sqr < n){
                start = mid + 1;
                res = mid;
            }else{
                end = mid - 1;
            }
        }

        return res;

    }

    public static void main(String[] args) {

        int n = 25;
        System.out.println(squareRoot(n));
    }
}
