package com.icortex.multithread;

public class ThreadDemo {

    public static void main(String[] args) {
        NewThread t = new NewThread();
        t.thread.start();
        try {
            for(int i = 5; i > 0; i--){
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");;
        }

        System.out.println("Main thread exiting");
    }
}
