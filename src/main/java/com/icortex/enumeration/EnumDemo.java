package com.icortex.enumeration;

enum Apple{
    Jonathon, GoldenDel, RedDel, Winesap, Cortland
}
public class EnumDemo {

    public static void main(String[] args) {
        Apple ap;
        ap = Apple.Winesap;

        System.out.println("Value of ap : "+ap);
        ap = Apple.GoldenDel;
        if(ap == Apple.GoldenDel){
            System.out.println("Ap contains GoldenDen");
        }

        switch (ap){
            case Jonathon :
                System.out.println("Jonathon is Red");
                break;
            case RedDel:
                System.out.println("Red Delicious is Red");
                break;
            case Winesap:
                System.out.println("Winesap is Blue");
                break;
            case GoldenDel:
                System.out.println("Golden is Yellow");
                break;
        }

        System.out.println("All apple are constant : \n");

        Apple allApples[] = Apple.values();

        for(Apple a:allApples){
            System.out.println(a);
        }
        System.out.println();

        ap = Apple.valueOf("Winesap");
        System.out.println("Value of Ap : "+ap);
    }
}
