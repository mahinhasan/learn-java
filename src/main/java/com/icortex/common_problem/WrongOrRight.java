package com.icortex.common_problem;

import java.util.Arrays;

public class WrongOrRight {

    public static void main(String[] args) {
        int []arr = new int[10];
        Arrays.fill(arr,1);
        int []arr1 = new int[100];
        Arrays.fill(arr1,2);

        arr = arr1;
    }
}
