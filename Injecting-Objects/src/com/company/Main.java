package com.company;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;


public class Main {

    public static void main(String[] args) {

        //beanFactory and get the xml configuration file
//        Resource resource;
//        BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("Spring.xml"));
        // beanfactory.getBean

        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        Triangle triangle = (Triangle) context.getBean("triangle");
        System.out.printf("%n Triangle %n");
        triangle.Draw();

//        Rectangle rectangle = (Rectangle) context.getBean("rectangle");
//        System.out.printf("%n rectangle %n");
//        rectangle.DrawNow();


    }
}
