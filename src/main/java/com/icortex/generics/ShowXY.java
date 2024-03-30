package com.icortex.generics;

class TwoD{
    int x,y;
    TwoD(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class ThreeD extends TwoD{
    int z;
    ThreeD(int x,int y,int z){
        super(x,y);
        this.z = z;
    }
}

class FourD extends ThreeD{

    int m;
    FourD(int x,int y,int z,int m){
        super(x,y,z);
        this.m = m;
    }
}

class Coords<T extends TwoD>{
    T [] coords;
    Coords(T []o){
        coords = o;
    }
}

public class ShowXY {
    static void showXY(Coords<?> c){
        System.out.println("XY coordinates");
        for(int i = 0; i < c.coords.length; i++){
            System.out.println(c.coords[i].x + " "+c.coords[i].y);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TwoD td[] = {
                new TwoD(0,0),
                new TwoD(7,8),
                new TwoD(18,4),
                new TwoD(-1,-23),
        };

        Coords<TwoD> twoDCoords = new Coords<>(td);
        showXY(twoDCoords);

    }
}


