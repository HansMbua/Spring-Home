package com.Love.ToCode;

public abstract class PizzaStore{

    public Pizza orderPizza(String Type){
        Pizza pizza = getPizza(Type);

        pizza.Prepare();
        pizza.box();
        pizza.price();
        pizza.getName();



        return pizza;
    }

    public abstract Pizza getPizza(String Type);
}
