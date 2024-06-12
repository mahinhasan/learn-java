package com.icortex.design_pattern.creational;

interface Dish{
    void prepare();
    void serve();
}


class Pizza implements Dish{

    @Override
    public void prepare() {
        System.out.println("Preparing Pizza");
    }

    @Override
    public void serve() {
        System.out.println("Serving Pizza");
    }
}

class Burger implements Dish{

    @Override
    public void prepare() {
        System.out.println("Preparing Burger!");
    }

    @Override
    public void serve() {
        System.out.println("Serving Burger!");
    }
}

interface DishFactory{
    Dish createDish();
}


class PizzaFactory implements  DishFactory{

    @Override
    public Dish createDish() {
        return new Pizza();
    }
}

class BurgerFactory implements DishFactory{

    @Override
    public Dish createDish() {
        return new Burger();
    }
}



public class AbstractFactoryDesing {
    public static void main(String[] args) {
        DishFactory pizzaFactory = new PizzaFactory();
        Dish pizza = pizzaFactory.createDish();

        pizza.prepare();
        pizza.serve();
    }

}
