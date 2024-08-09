package com.icortex.abstractexample;

abstract class Figure {
    double dim1 ;
    double dim2;

    Figure(double a,double b){
        this.dim1 = a;
        this.dim2 = b;
    }

    abstract double area();
}

class Rectangle extends Figure{

    Rectangle(double a,double b){
        super(a,b);
    }
    @java.lang.Override
    double area() {
        System.out.println("Inside area of Rectangle");
        return dim1 * dim2 / 2;
    }
}

class Triangle extends Figure{

    Triangle(double a, double b) {
        super(a, b);
    }

    @java.lang.Override
    double area() {
        System.out.println("Inside the Triangle");
        return dim1 * dim2 / 2;
    }
}

public class Areas {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(2.5,2);
        Triangle t = new Triangle(10,9);

        Figure f;
        f = r;
        System.out.println(f.area());
        f = t;
        System.out.println(f.area());
    }
}
