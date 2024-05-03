package com.icortex.design_pattern.creational;


interface Product{
    void product();
}


class ConcreteProductA implements Product{

    @Override
    public void product() {
        System.out.println("Producing product A");
    }
}

class ConcreteProductB implements Product{

    @Override
    public void product() {
        System.out.println("Producing product B!");
    }
}
class ProductFactory{
    public Product getProduct(String str){
        if(str.equalsIgnoreCase("A")){
            return new ConcreteProductA();
        }else{
            return new ConcreteProductB();
        }
    }
}

public class Factory{

    public static void main(String[] args) {
        ProductFactory p = new ProductFactory();
        Product pdt = p.getProduct("A");
        pdt.product();
    }

}
