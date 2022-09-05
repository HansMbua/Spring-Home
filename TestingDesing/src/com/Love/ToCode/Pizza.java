package com.Love.ToCode;

public class Pizza {
   public String Name;

    public void Prepare(){
        System.out.println("put in the oven");
    }
    public void box(){
        System.out.println("put on round box");
    }
    public void price(){
        System.out.println("23EUR");
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        System.out.println(name);;
    }
}
