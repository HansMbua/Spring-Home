package com.company;

public class Triangle {
    private String type;
    private int hight;

    public Triangle(String type) {
        this.type = type;

    }

    public Triangle(String type, int hight) {
        this.type = type;
        this.hight = hight;

    }

    public Triangle(int hight) {
        this.hight = hight;

    }

    public void Draw() {
        System.out.println(getType() + " triangle drawn with hight of " + getHight());


    }


    public String getType() {
        return type;
    }


    public int getHight() {
        return hight;
    }
}
