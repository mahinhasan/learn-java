package com.icortex.Interface;

abstract class Incomplete implements Callback{
    int a;
    int b;
    void show(){
        System.out.println(a + " "+b);
    }
}
