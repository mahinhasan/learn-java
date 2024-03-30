package com.icortex.Interface;

public class Clint implements Callback{

    @java.lang.Override
    public void callback(int param) {
        System.out.println("callback called with "+param);
    }

    void nonIfaceMeth(){
        System.out.println("Class that implements interface "+"may also define others member too..");
    }
}
