package com.Love.ToCode.Service;

import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class TrafficFortuneService {

    public String getFortune(){


//        simulate a daly
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "Expect heavy traffic this morning";
    }


    public String getFortune(boolean tripwire){

        if (tripwire){
            throw  new RuntimeException("Major accident! highway is closed!");
        }
        return getFortune();
    }
}
