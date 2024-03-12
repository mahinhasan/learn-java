package com.icortex.basic;

import java.util.Random;

public class CoinFliping {
    public static void main(String[] args) {
        Random rand = new Random();
        int res = rand.nextInt(2);
        System.out.println(res == 0 ? "Head" : "Tail");
    }
}
