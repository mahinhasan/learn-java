package com.icortex.multithread.synchronization;

class Callme {

    // without synchronized
//     void call(String msg){
//        System.out.println("["+msg);
//        try {
//            Thread.sleep(1000);
//        }catch (InterruptedException e){
//            System.out.println("Interrupted");
//        }
//        System.out.println("]");
//    }

    synchronized void call(String msg){
        System.out.println("["+msg);
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}

class Caller implements Runnable{
    String msg;
    Callme target;
    Thread thread;

    public Caller(Callme targ,String s){
        target = targ;
        msg = s;
        thread = new Thread(this);
    }
    public void run(){
        target.call(msg);
    }
}


public class Synch {
    public static void main(String[] args) {
        Callme target = new Callme();
        Caller ob1 = new Caller(target,"Hello");
        Caller ob2 = new Caller(target,"Synch");
        Caller ob3 = new Caller(target,"world");

        ob1.thread.start();
        ob2.thread.start();
        ob3.thread.start();


        try {
            ob1.thread.join();
            ob2.thread.join();
            ob3.thread.join();
        }catch (InterruptedException e){
            System.out.println("Interrupted!");
        }
    }
}