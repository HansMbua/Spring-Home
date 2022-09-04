package com.Love.ToCode;

public class CamStore extends PizzaStore{

    @Override
    public Pizza getPizza(String Type) {
      Pizza pizza = null;

      if (Type.equals("cheese")){
          pizza = new CheesePizza();
          pizza.setName("cameroon deleterious pizza");
      }

      return pizza;
    }
}
