package com.icortex.basic;


class Animal{
    String name ;
    String says;
}
public class Dog {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal1 = new Animal();

        animal.name = "Dog";
        animal1.says = "Ghueu";

        System.out.println(animal.name);
        System.out.println(animal1.says);

    }
}
