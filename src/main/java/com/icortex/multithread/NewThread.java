package com.icortex.multithread;

public class NewThread implements Runnable{

    Thread thread ;
    NewThread(){
        thread = new Thread(this,"Demo Thread");
        System.out.println("Clhild thread "+thread);
    }
    @Override
    public void run() {
        try {
            for(int i = 5; i > 0; i--){
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Child thread interrupted");;
        }

        System.out.println("Child thread existing");
    }
}
