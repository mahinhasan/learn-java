package com.icortex.multithread;


class NewThreadMultiThread implements Runnable{

    String name;
    Thread thread;

    NewThreadMultiThread(String name){
        this.name = name;
        thread = new Thread(this,name);
        System.out.println("New thread : "+thread);
    }


    public void run(){
        try {
            for(int i = 5; i > 0; i--){
                System.out.println(i);
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");;
        }
        System.out.println("Child thread exiting.....");
    }
}


public class MultiThreadDemo {
    public static void main(String[] args) {
        NewThreadMultiThread nt1 = new NewThreadMultiThread("One");
        NewThreadMultiThread nt2 = new NewThreadMultiThread("tow");
        NewThreadMultiThread nt3 = new NewThreadMultiThread("three");

        nt1.thread.start();
        nt2.thread.start();
        nt3.thread.start();


        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("Main thread exiting "+e);
        }

        System.out.println("Main thread exiting....");

    }

}

