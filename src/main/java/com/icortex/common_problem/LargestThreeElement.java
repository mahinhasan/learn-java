package com.icortex.common_problem;

public class LargestThreeElement {

    public static void findLargest(int []arr){

        int first = 0;
        int second = 0;
        int third = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > first){
                third = second;
                second = first;
                first = arr[i];
            }else if(arr[i] < first && arr[i] != first){
                third = second;
                second = arr[i];
            }else if(arr[i] > third && arr[i] != second && arr[i] != first){
                third = arr[i];
            }
        }

        System.out.println("First :"+first);
        System.out.println("Second : "+second);
        System.out.println("Third :"+third);
    }

    public static void main(String[] args) {
        findLargest(new int[]{10,11,4,55,19,32});
    }
}
