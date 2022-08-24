package com.Love.ToCode;


import com.Love.ToCode.Service.TrafficFortuneService;

import com.Love.ToCode.Objacts.DemoConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class Main {
    private static Logger mylogger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {



       AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

       //get the bean from spring container
        TrafficFortuneService theTrafficFortuneService = context.getBean("trafficFortuneService", TrafficFortuneService.class);
       mylogger.info("\nMain Program: AroundDemoApp");
        mylogger.info("Calling getFortune....");
        boolean tripWrite = true;
        String data = theTrafficFortuneService.getFortune(tripWrite);
        mylogger.info("\nMy fortune is : "+data);
        System.out.println("finish");
        // close the context
        context.close();


    }
}
