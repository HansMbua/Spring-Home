package com.Love.ToCode;

public abstract class Pizza {

    public void preparing(String type){
        String theName = create(type);

        displayMessage(theName);



    }

    private void displayMessage(String theName) {
        System.out.println(theName);
    }

    public abstract String create(String Name);

}
