package com.icortex.multithread;

import com.icortex.exceptions.MyExceptions;

public class CurrentThreadDemo {

    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println("Current thread : "+thread);

        thread.setName("My Main thread");

        System.out.println("After change thread name : "+thread);

        try {
            for(int i = 5; i > 0; i--){
                System.out.println(i);
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");;
        }
    }
}
