package com.company;

import java.util.List;
import java.util.stream.Collectors;

public class Triangle {

    private  Point pointA;
    private  Point pointB;
    private  Point pointC;



    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void Draw(){
//        System.out.printf( "%n pointA = %d , pointB = %d pointC = %d %n",getPointA(),getPointB(),getPointC());
        System.out.println("PontA = ("+getPointA().getX()+", "+getPointA().getY()+" )");
        System.out.println("PontA = ("+getPointB().getX()+", "+getPointB().getY()+" )");
        System.out.println("PontA = ("+getPointC().getX()+", "+getPointC().getY()+" )");


    }



}
