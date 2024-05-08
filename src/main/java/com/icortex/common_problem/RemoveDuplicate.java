package com.icortex.common_problem;

public class RemoveDuplicate {

    public static void removeDuplicate(int []arr){
        int index = 1;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i-1]){
                arr[index++] = arr[i];
            }
        }

        print(arr,index);
    }

    public static void print(int []arr,int index){
        for (int i = 0; i < index; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        removeDuplicate(new int[]{1,2,2,3,4,5,5});
    }
}
