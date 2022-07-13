package com.company;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.List;
import java.util.stream.Collectors;

public class Triangle implements ApplicationContextAware, BeanNameAware {

    private Point pointA;
    private Point pointB;
    private Point pointC;
    private ApplicationContext context = null;
    private String Name;


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

    public void Draw() {
//        System.out.printf( "%n pointA = %d , pointB = %d pointC = %d %n",getPointA(),getPointB(),getPointC());
        System.out.println("the Bean Name is : " + getName());
        System.out.println("PontA = (" + getPointA().getX() + ", " + getPointA().getY() + " )");
        System.out.println("PontA = (" + getPointB().getX() + ", " + getPointB().getY() + " )");
        System.out.println("PontA = (" + getPointC().getX() + ", " + getPointC().getY() + " )");


    }

    @Override
    public void setApplicationContext(ApplicationContext context)
            throws BeansException {
        this.context = context;
    }

    public ApplicationContext getContext() {
        return context;
    }

    @Override
    public void setBeanName(String name) {
        this.Name = name;
    }

    public String getName() {
        return Name;
    }
}

