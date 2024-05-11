package com.icortex.common_problem;

import java.util.Arrays;

public class SortArrayWaveForm {

    public void swap(int []arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public void sortWaveForm(int []arr){
        Arrays.sort(arr);
        for(int i = 0; i < arr.length - 1; i = i + 2){
            swap(arr,i,i+1);
        }
    }

    public void print(int []arr){

        for(int i = 0; i < arr.length; i++){
            System.out.printf(arr[i] + " ");
        }
    }


    public static void main(String[] args) {
        SortArrayWaveForm st = new SortArrayWaveForm();

        int arr[] = {10, 90, 49, 2, 1, 5, 23};
        System.out.println("Before sorting: ");
        for(int i = 0; i < arr.length; i++){
            System.out.printf(arr[i] + " ");
        }
        System.out.println("\nAfter sorting: ");
        st.sortWaveForm(arr);
        st.print(arr);
    }
}
