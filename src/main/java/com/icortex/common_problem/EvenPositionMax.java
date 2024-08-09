package com.icortex.common_problem;

import java.util.Arrays;

public class EvenPositionMax {

    public static void evenPositionMax(int []arr){

        Arrays.sort(arr);
        int []res = new int[arr.length];
        int index = 0;
        int index1 = arr.length - 1;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] % 2 == 0){
                res[i] = arr[index1--];
            }else{
                res[i] = arr[index++];
            }
        }
    }


    public static void main(String[] args) {
        int []arr = {2,1,3,4,5};
        evenPositionMax(arr);
        for(int n : arr){
            System.out.printf(n + " ");
        }
    }
}
