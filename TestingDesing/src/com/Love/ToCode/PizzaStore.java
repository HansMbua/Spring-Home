package com.Love.ToCode;

public class PizzaStore extends Pizza{


    @Override
    public String create(String name) {
        String theName = "";
        if (name.equals("cheese")){
            theName = "in the Pizzastore()";
        }

        return theName;
    }
}
