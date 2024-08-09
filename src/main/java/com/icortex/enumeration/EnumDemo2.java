package com.icortex.enumeration;

enum AppleOrdinal{
    Jonathon, GoldenDel, RedDel, Winesap, Cortland
}
public class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap,ap1,ap2;
        System.out.println("Print ordinal value of enum : ");
        for(AppleOrdinal a : AppleOrdinal.values()){
            System.out.println(a + " -> "+a.ordinal());
        }
    }
}
