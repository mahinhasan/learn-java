package com.icortex.generics;


class MyClass<T extends Comparable<T>>implements MinMax<T>{
    T [] values;
    MyClass(T []o){
        values = o;
    }

    public T min(){
        T v = values[0];
        for(int i = 1; i < values.length; i++){
            if(values[i].compareTo(v) < 0){
                v = values[i];
            }
        }
        return v;
    }
}
public class GenericInterface {
    public static void main(String[] args) {
        Integer[] nums = {1,2,3,4,5,6};

        MyClass<Integer> ob = new MyClass<>(nums);
        System.out.println(ob.min());
    }
}
