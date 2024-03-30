package com.icortex.generics;


class TwoGen<T,V>{
    T ob1;
    V ob2;

    TwoGen(T o,V v){
        this.ob1 = o;
        this.ob2 = v;
    }

    T getOb1(){
        return ob1;
    }

    V getOb2(){
        return ob2;
    }

    void showType(){
        System.out.println("Type of T :"+ob1.getClass().getName());
        System.out.println("Type of V :"+ob2.getClass().getName());
    }
}
public class TwoGenDemo {
    public static void main(String[] args) {
        TwoGen<Integer,String> tgobj = new TwoGen<>(99,"mahin");
        tgobj.showType();

        int t = tgobj.getOb1();
        String v = tgobj.getOb2();
        System.out.println(t +" : "+v);
    }
}
