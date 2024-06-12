package com.icortex.design_pattern.structural;


interface Pizza{
    String getDescription();
    double getCost();
}


class PlainPizza implements Pizza{

    @Override
    public String getDescription() {
        return "Plain pizza!";
    }

    @Override
    public double getCost() {
        return 500.00;
    }
}

abstract class PizzaDecorator implements Pizza{
    protected Pizza decoratedPizza;
    public PizzaDecorator(Pizza pizza){
        this.decoratedPizza = pizza;
    }
}

class CheeseDecorator extends PizzaDecorator{

    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription()+", Cheese";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost()+1.5;
    }
}


public class DecoratorDesingPattern {
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();
        pizza = new CheeseDecorator(pizza);

        System.out.println(pizza.getDescription());
    }

}
