package com.icortex.introduction;

public class Box {
    double height;
    double weight;
    double depth;

    void volume(){
        System.out.println("Volume is  : ");
        System.out.println(height * weight * depth);
    }
}
