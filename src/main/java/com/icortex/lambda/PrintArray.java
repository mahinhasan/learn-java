package com.icortex.lambda;

import java.util.Arrays;
import java.util.List;

public class PrintArray {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        numbers.forEach((value)-> System.out.println(value));
    }
}
