package com.company;

public class Circle implements Shaps {
    private Point center;


    @Override
    public void Draw() {
        System.out.println("Circle Point is : ( " + center.getX() + " ," + center.getY() + " )");
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }
}
