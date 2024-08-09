package com.icortex.introduction;


public class Test {
    int a,b;
    Test(int a,int b){
        this.a = a;
        this.b = b;
    }

    boolean isEqual(Test o){
        return o.a == a && o.b == b ? true : false;
    }

    public static void main(String[] args) {
        Test test1 = new Test(10,100);
        Test test2 = new Test(10,100);

        System.out.println("Ob1 == ob2 :"+test1.isEqual(test2));
    }
}

