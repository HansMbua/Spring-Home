package com.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class Circle implements Shaps {
    private Point center;


    @Override
    public void Draw() {
        System.out.println("Circle Point is : ( " + center.getX() + " ," + center.getY() + " )");
    }

    public Point getCenter() {
        return center;
    }

    @Resource(name = "pointC")
    public void setCenter(Point center) {
        this.center = center;
    }

    @PostConstruct
    public void initializeCircle() {
        System.out.println("init of circle");
    }

    @PreDestroy
    public void destroyCircle() {
        System.out.println("destroy of circle");
    }
}
