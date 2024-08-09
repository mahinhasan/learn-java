package com.icortex.enumeration;

import java.util.Random;

enum Answers{
    NO,YES,MAYBE,LATER,SOON,NEVER
}


class Questions{
    Random random = new Random();
    Answers ask(){
        int prob = (int) (100 * random.nextDouble());
        if(prob < 15){
            return Answers.MAYBE;
        }else if(prob < 30){
            return Answers.LATER;
        } else if (prob < 60) {
            return Answers.YES;
        }else
            return Answers.NO;
    }

}
public class AnotherEnum {

    static void answer(Answers result){
        switch (result){
            case YES:
                System.out.println("Yes");
                break;
            case NO :
                System.out.println("Yes");
                break;
            case LATER:
                System.out.println("LATER");
                break;
            case MAYBE:
                System.out.println("Maybe");
                break;
            case SOON:
                System.out.println("Soon");
                break;
            case NEVER:
                System.out.println("never");
                break;

        }
    }
    public static void main(String[] args) {
        Questions q = new Questions();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}
