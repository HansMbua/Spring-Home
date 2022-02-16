package com.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
@Component
/*
tells spring that this class is going to be a bean
this class is the same as this: <bean id="circle" class="com.company.Circle"/>

 */
public class Circle implements Shaps{
    private Point center;
    private MessageSource messageSource;

    @Override
    public void Draw() {
        System.out.println("Circle Point is : ( "+center.getX()+" ,"+ center.getY()+" )");

    }

    public Point getCenter() {
        return center;
    }

   @Resource(name="pointC")
    public void setCenter(Point center) {
        this.center = center;
    }
   @PostConstruct
    public void initializeCircle(){
        System.out.println("init of circle");
    }
    @PreDestroy
    public void destroyCircle(){
        System.out.println("destroy of circle");
    }
}
