package com.icortex.introduction;

public class BoxDemo {
    double height,weight,depth;
    BoxDemo(double height,double weight,double depth){
        this.height = height;
        this.weight = weight;
        this.depth = depth;
    }

    public double volume(){
        return height * weight * depth;
    }
}
