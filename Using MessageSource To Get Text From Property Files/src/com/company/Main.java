package com.company;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;


public class Main {

    public static void main(String[] args) {



        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        context.registerShutdownHook();
        Shaps shaps = (Shaps) context.getBean("circle");

        shaps.Draw();

        String message = context.getMessage("greetings", null, "message default", null);
        System.out.println(message);


    }
}
