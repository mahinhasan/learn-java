package com.icortex.input_output;

class MyClass{
    int a;
    int b;

    MyClass(int a,int b){
        this.a = a;
        this.b = b;
    }

    MyClass(int a){
        this(a,a);
    }

    MyClass(){
        this(0);
    }
}

public class ThisExample {

    public static void main(String[] args) {
        MyClass m = new MyClass();
        System.out.println(m.a);
        System.out.println(m.b);
    }

}
