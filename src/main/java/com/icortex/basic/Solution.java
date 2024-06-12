package com.icortex.basic;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int[][] cost = new int[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    cost[i][j] = scanner.nextInt();
                }
            }

            System.out.println(findMinCost(N, cost));
        }

        scanner.close();
    }

    private static int findMinCost(int N, int[][] cost) {
        int VISITED_ALL = (1 << N) - 1;
        int[][] dp = new int[N][1 << N];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return tsp(0, 1, N, cost, dp, VISITED_ALL);
    }

    private static int tsp(int city, int mask, int N, int[][] cost, int[][] dp, int VISITED_ALL) {
        if (mask == VISITED_ALL) {
            return cost[city][0];
        }

        if (dp[city][mask] != -1) {
            return dp[city][mask];
        }

        int minCost = Integer.MAX_VALUE;

        for (int nextCity = 0; nextCity < N; nextCity++) {
            if ((mask & (1 << nextCity)) == 0) {
                int newCost = cost[city][nextCity] + tsp(nextCity, mask | (1 << nextCity), N, cost, dp, VISITED_ALL);
                minCost = Math.min(minCost, newCost);
            }
        }

        dp[city][mask] = minCost;
        return minCost;
    }
}