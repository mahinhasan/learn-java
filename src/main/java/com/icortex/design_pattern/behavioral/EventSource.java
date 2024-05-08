package com.icortex.design_pattern.behavioral;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Observable;
import java.util.Observer;

class ResponseHandler implements Observer{
    private String resp;

    @Override
    public void update(Observable observable, Object o) {
        if(o instanceof String){
            resp = (String) o;
            System.out.println("\nReceived Response : "+resp);
        }
    }
}


public class EventSource extends Observable implements Runnable {

    @Override
    public void run() {
        try {
            final InputStreamReader isr =  new InputStreamReader(System.in);
            final BufferedReader br = new BufferedReader(isr);

            while (true){
                String response = br.readLine();
                setChanged();
                notifyObservers(response);

            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

    }
}
