package com.icortex.common_problem;

import java.util.ArrayList;
import java.util.List;

public class FindNthFibo {

    private static int findFibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    private static int findFiboRecursion(int n, int[] dp) {
        if (n == 0 || n == 1) {
            return n;
        }

        if (dp[n] != 0) {
            return dp[n];
        }

        dp[n] = findFiboRecursion(n - 1, dp) + findFiboRecursion(n - 2, dp);

        return dp[n];
    }

    private static List<Integer> firstNfibo(int n) {
        List<Integer> res = new ArrayList<>();
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            res.add(findFiboRecursion(i, dp));
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(findFibo(10));
        System.out.println(findFiboRecursion(10, new int[11]));
        System.out.println("First n fibo : " + firstNfibo(10));
    }
}
