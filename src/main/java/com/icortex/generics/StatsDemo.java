package com.icortex.generics;

class Stats<T extends  Number>{
    T []nums;

    Stats(T []o){
        this.nums = o;
    }

    double avg(){
        double sum = 0.0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i].doubleValue();
        }

        return sum/nums.length;
    }

    boolean sameAvg(Stats<?> ob){
        if(avg() == ob.avg()){
            return true;
        }
        return false;
    }
}

public class StatsDemo {
    public static void main(String[] args) {
        Integer []nums = {1,2,3,4,5};
        Stats<Integer> iob = new Stats<>(nums);
        double v = iob.avg();
        System.out.println("Iob avg value is : "+v);

        Double []num2 = {1.5,2.3,3.9,4.21,5.22};
        Stats<Double> dob = new Stats<>(num2);
        double v2 = dob.avg();
        System.out.println("Iob avg value is : "+v2);

        if(iob.sameAvg(dob)){
            System.out.println("Same avg");
        }else {
            System.out.println("Different");
        }


    }
}
