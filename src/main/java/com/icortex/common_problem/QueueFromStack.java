package com.icortex.common_problem;


import java.util.Stack;

public class QueueFromStack {

    static Stack<Integer> st;
    static Stack<Integer> st1;

    public QueueFromStack(){
        st = new Stack<>();
        st1 = new Stack<>();
    }

    public static void enQueue(int x){
        while (!st.isEmpty()){
            st1.push(st.pop());
        }
        st.push(x);

        while (!st1.isEmpty()){
            st.push(st1.pop());
        }
    }

    public static int deQueue(){
        if (st.isEmpty()){
            return -1;
        }
        return st.pop();
    }

    public static boolean empty(){
        return st.isEmpty();
    }

    public static void main(String[] args) {
        QueueFromStack q = new QueueFromStack();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);

        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
    }
}
