package com.Love.ToCode.aspect;

import com.Love.ToCode.Objacts.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.logging.Logger;


@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {

    private Logger myLogger = Logger.getLogger(getClass().getName());

    @Around("execution(* com.Love.ToCode.Service.*.getFortune(..))")
    public Object aroundGetFortune(ProceedingJoinPoint theProceedingJoinPoint)throws Throwable {

        // print out method we are advising  on
        String theMethod = theProceedingJoinPoint.getSignature().toShortString();
        myLogger.info("\n====>>> Executing @Around on method: "+theMethod);
        // get begin timestamp
       long begin = System.currentTimeMillis();
        // now, lets"s execute the method
       Object results = null;

       //throwing the exception
//       try{
//           results = theProceedingJoinPoint.proceed();
//       }catch (Exception exception){
//           //log the exception
//          myLogger.warning(exception.getMessage());
//
//          //give the user a custom message
//           results = "Major accident! But no worries, your private AOP Helicopter is on the away ";
//
//       }

        //rethrowing the exception
        try{
            results = theProceedingJoinPoint.proceed();
        }catch (Exception exception){
            //log the exception
            myLogger.warning(exception.getMessage());

            //rethrow the exception
         throw exception;

        }

        // get end timestamp


         long end = System.currentTimeMillis();
        // compute duration and display it


        long duration = end - begin;

        myLogger.info("\n=====>> Duration "+duration / 1000.0+ "Milliseconds");

        // return the result to the calling program
        return  results;
    }







    @After("execution(* com.Love.ToCode.dao.AccountDAO.findAccounts(..))")
    public void afterFinallyFindAccountsAdvice(JoinPoint theJoinPoint){
        // print out which method we are advising on
        String methodSignature = theJoinPoint.getSignature().toShortString();
        myLogger.info("\n=====>>> Executing @After(finally) on method: "+methodSignature);
    }

    @AfterThrowing(pointcut = "execution(* com.Love.ToCode.dao.AccountDAO.findAccounts(..))",throwing = "theExc")
    public void afterThrowingFindAccountAdvice(JoinPoint theJointPoint, Throwable theExc){

        String method = theJointPoint.toShortString();
        myLogger.info("\n=====>>> Executing @AfterThrowing on method: "+method);

        // log the exception
        myLogger.info("\n=====>>> Executing @AfterThrowing on method: "+theExc);

    }



    //this is where we add all of our related advices for logging

    // let's start with a @Before advice

    // add a new advice for @AfterReturning
    @AfterReturning(pointcut = "execution(* com.Love.ToCode.dao.AccountDAO.findAccounts(..))", returning = "result")
    public void afterReturningFindAccountsAdvice(JoinPoint theJoinPoint, List<Account> result){

        // print out which method we are advising on
        String methodSignature = theJoinPoint.getSignature().toShortString();
        myLogger.info("\n=====>>> Executing @AfterReturning on method: "+methodSignature);


        // print out the results of the method
        myLogger.info("\n=====>>> result is: "+result);

        //let me post-process the data -- lets modify it

        //convert the account name to uppercase
        convertAccountNamesToUpperCase(result);
        myLogger.info("\n=====>>> result uppercase is : "+result);



    }

    private void convertAccountNamesToUpperCase(List<Account> result) {

        // loop through accounts

//        result.forEach(theAccount -> {
//            String thUpperName = theAccount.getName().toUpperCase();
//            theAccount.setName(thUpperName);
//        });

        for (Account theAccount : result){
            // get uppercase version of name
            String thUpperName = theAccount.getName().toUpperCase();
            // update the name on account
            theAccount.setName(thUpperName);
        }

    }


    @Before("com.Love.ToCode.aspect.MyPointcutAOPExpressions.forDaoPackageNoGetterSetter()")
    public void beforeAddAccountAdvice() {
        myLogger.info("\n====>>> Executing @Before advice on addAccount()");
    }






    /**
     * this methods will only apply to when the main calls the forDaoPagkage not for getters and setters
     */


}
