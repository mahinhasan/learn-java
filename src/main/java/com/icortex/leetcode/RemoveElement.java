package com.icortex.leetcode;

public class RemoveElement {

    public static int removeElement(int []arr,int target){
        int index = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != target){
                arr[index++] = arr[i];
            }
        }


        return index;
    }

    public static void main(String[] args) {
        int []arr = {1,2,3,4,4,4,5,6};
        System.out.println(removeElement(arr,4));
    }
}
