package com.Love.ToCode.aspect;

import com.Love.ToCode.daoDemo.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {

    //this is where we add all of our related advices for logging

    // let's start with a @Before advice



    @Before("com.Love.ToCode.aspect.MyPointcutAOPExpressions.forDaoPackageNoGetterSetter()")
    public void beforeAddAccountAdvice(JoinPoint joinPoint) {
        System.out.println("\n====>>> Executing @Before advice on addAccount()");

        //get the method
        MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();

        //displaying the method signature that is passing via this method
        System.out.println("method: "+methodSignature);

        Object[] args = joinPoint.getArgs();

        for (Object temArg : args){
            System.out.println(temArg);
            if (temArg instanceof Account){
                //Downcast and print Account specifi stuff
                Account theAccount = (Account) temArg;
                System.out.println("Account name: "+theAccount.getName());
                System.out.println("Account level: "+theAccount.getLevel());
            }
        }

    }






    /**
     * this methods will only apply to when the main calls the forDaoPagkage not for getters and setters
     */


}
