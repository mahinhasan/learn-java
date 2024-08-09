package com.icortex.leetcode;

public class removeDuplicate {

    public static int remove_duplicate(int []arr){
        int index = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i-1]){
                arr[index++] = arr[i];
            }
        }
        return index;
    }


    public static void main(String[] args) {
        int []arr = {1,1,2,3,4,4,5};
        System.out.println(remove_duplicate(arr));
        System.out.println();
        for (int n : arr){
            System.out.print(n);
        }


    }
}
