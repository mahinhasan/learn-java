package com.icortex.enumeration;

enum AppleStore{
    Jonathon(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);
    private int price;
    AppleStore(int p){
        this.price = p;
    }

    int getPrice(){
        return price;
    }

}
public class EnumWithMethod {
    public static void main(String[] args) {
        AppleStore ap = null;
        System.out.println("Price of winesap :"+ap.Winesap.getPrice());

        System.out.println("Display all apple product price : ");

        for(AppleStore a : AppleStore.values()){
            System.out.println(a + " => "+a.getPrice());
        }
    }
}
