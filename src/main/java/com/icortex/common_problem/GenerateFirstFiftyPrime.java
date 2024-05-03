package com.icortex.common_problem;

import java.util.ArrayList;
import java.util.List;

public class GenerateFirstFiftyPrime {

    public static List<Integer> generateFirstFiftyPrime(int limit) {
        List<Integer> primes = new ArrayList<>();

        boolean []isPrime = new boolean[limit+1];

        for(int i = 2; i <= limit; i++) {
            isPrime[i] = true;
        }


        for(int p = 2; p * p <= limit; p++){
            if(isPrime[p]){
                for(int q = p*p; q <= limit; q += p){
                    isPrime[q] = false;
                }
            }
        }

        for(int i = 2; i <= limit; i++) {
            if(isPrime[i]){
                primes.add(i);
            }
        }

        return primes;
    }

    public static void main(String[] args) {

        List<Integer> primes = generateFirstFiftyPrime(1000);

        for(int i = 0; i < 50; i++){
            System.out.println(primes.get(i));
        }

    }
}
