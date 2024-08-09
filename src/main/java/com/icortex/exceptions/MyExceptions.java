package com.icortex.exceptions;

public class MyExceptions extends Exception{
    private int details;
    public MyExceptions(int a){
        this.details = a;
    }

    public String toString(){
        return "MyException ["+details+"]";
    }
}
