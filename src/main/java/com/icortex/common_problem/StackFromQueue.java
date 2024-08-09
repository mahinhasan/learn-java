package com.icortex.common_problem;

import java.util.LinkedList;
import java.util.Queue;

public class StackFromQueue {

    Queue<Integer> queue1;
    Queue<Integer> queue2;

    public StackFromQueue() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x){
        queue1.add(x);
    }

    public int pop(){
        if(!queue1.isEmpty()){
            while(queue1.size() > 1){
                queue2.add(queue1.poll());
            }
        }


        int data = queue1.poll();

        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return data;
    }
}
