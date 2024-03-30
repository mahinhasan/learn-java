package com.icortex.introduction;

public class Main {
    public static void main(String[] args) {
        Box mybox = new Box();
        mybox.height = 10;
        mybox.weight = 2;
        mybox.depth = 1;
        Box mybox1 = mybox;
//        mybox = null;
        System.out.println(mybox1.height);
        mybox1.volume();

        BoxDemo boxDemo = new BoxDemo(2,2,2);
        System.out.println(boxDemo.volume());

    }
}
