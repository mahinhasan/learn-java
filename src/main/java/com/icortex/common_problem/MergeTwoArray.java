package com.icortex.common_problem;

public class MergeTwoArray {

    public static void mergeTwoArray(int []arr1,int []arr2){
        int n = arr1.length;
        int m = arr2.length;
        int first = n - 1;
        int end = m - 1;
        int index = n + m - 1;
        while(first >= 0 && end >= 0){
            if(arr1[first] >= arr2[end]){
                arr1[index--] = arr1[first--];
            }else{
                arr1[index--] = arr2[end--];
            }
        }


        while(end >= 0){
            arr1[index--] = arr2[end--];
        }

        print(arr1);
    }

    public static void print(int []arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        mergeTwoArray(new int[]{1,2,5,8,0,0,0,0},new int[]{3,4,6,7});
    }
}
