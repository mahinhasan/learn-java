package com.icortex.generics;


class Gen<T>{
    T ob;
    Gen(T o){
        this.ob = o;
    }

    T getOb(){
        return ob;
    }

    void showType(){
        System.out.println("Type of T is :"+ob.getClass().getName());
    }
}
public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iob;

        iob = new Gen<>(5);
        iob.showType();

        Gen<String> iOb;
        iOb = new Gen<>("Mahin");
        iOb.showType();
    }
}
