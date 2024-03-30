package com.icortex.generics;

class NonGen{
    Object ob;
    NonGen(Object o){
        this.ob = 0;
    }

    Object getOb(){
        return ob;
    }

    void showType(){
        System.out.println("Type is :" + ob.getClass().getName());
    }
}

public class NonGenDemo {
    public static void main(String[] args) {
        NonGen nonGen;
        nonGen = new NonGen(99);

        nonGen.showType();

        int v = (Integer) nonGen.getOb();
        System.out.println(v);

        NonGen strType = new NonGen("String");
        strType.showType();


    }
}
