package com.icortex.leetcode;

public class MovesZeros {

    public static void moves_Zeros(int []arr){
        int index = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                arr[index++] = arr[i];
            }
        }

        for(int i = index; i < arr.length; i++){
            arr[index++] = 0;
        }

        for(int n : arr){
            System.out.printf(String.valueOf(n) + " ");
        }

    }

    public static void main(String[] args) {
        int []arr = {1,2,0,0,3,4,5,0,9};
        moves_Zeros(arr);
    }
}
