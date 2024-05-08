package com.icortex.common_problem;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckSubsetOrNot {

    public static boolean isSubset(int []arr1,int []arr2){
        Set<Integer> st = new HashSet<>();
        for(int i = 0; i < arr1.length; i++){
            st.add(arr1[i]);
        }

        for(int i = 0; i < arr2.length; i++){
            if(!st.contains(arr2[i])){
                return false;
            }
        }
        return true;
    }

    public static boolean isSubsetUsingTwoPointer(int []arr1,int []arr2){

        int n = arr1.length;
        int m = arr2.length;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int index1 = 0;
        int index2 = 0;

        while(index1 < n && index2 < m){
            if(arr1[index1] == arr2[index2]){
                index1++;
                index2++;
            }else{
                index1++;
            }
        }

        return index2 != m ? false : true;
    }

    public static void main(String[] args) {
        int arr1[] = { 11, 1, 13, 21, 3, 7 };
        int arr2[] = { 11, 3, 7, 1 };
        System.out.println(isSubset(arr1,arr2));
        System.out.println(isSubsetUsingTwoPointer(arr1,arr2));
    }
}
