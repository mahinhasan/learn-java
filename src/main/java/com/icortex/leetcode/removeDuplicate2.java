package com.icortex.leetcode;

public class removeDuplicate2 {
    public static int remove_duplicate_2(int []arr){
        int index = 2;

        for(int i = 2; i < arr.length; i++){
            if(arr[i] != arr[i-2]){
                arr[index++] = arr[i];
            }
        }

        return  index;
    }

    public static void main(String[] args) {
        int []arr = {1,1,2,3,4,4,5};
        System.out.println(remove_duplicate_2(arr));
        System.out.println();
        for (int n : arr){
            System.out.print(n);
        }
    }
}
