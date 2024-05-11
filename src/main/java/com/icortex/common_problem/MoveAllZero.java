package com.icortex.common_problem;

public class MoveAllZero {

    public static void movesZeros(int []arr){

        int index = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index++] = temp;
            }
        }

    }

    public static void main(String[] args) {
        int []arr = {2,0,22,3,5,0,0,21,4};

        movesZeros(arr);
        for (int n : arr){
            System.out.printf(n + " ");
        }
    }
}
