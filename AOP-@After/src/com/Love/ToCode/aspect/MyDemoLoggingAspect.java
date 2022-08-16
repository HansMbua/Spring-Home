package com.Love.ToCode.aspect;

import com.Love.ToCode.Objacts.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;


@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {



    @After("execution(* com.Love.ToCode.dao.AccountDAO.findAccounts(..))")
    public void afterFinallyFindAccountsAdvice(JoinPoint theJoinPoint){
        // print out which method we are advising on
        String methodSignature = theJoinPoint.getSignature().toShortString();
        System.out.println("\n=====>>> Executing @After(finally) on method: "+methodSignature);
    }

    @AfterThrowing(pointcut = "execution(* com.Love.ToCode.dao.AccountDAO.findAccounts(..))",throwing = "theExc")
    public void afterThrowingFindAccountAdvice(JoinPoint theJointPoint, Throwable theExc){

        String method = theJointPoint.toShortString();
        System.out.println("\n=====>>> Executing @AfterThrowing on method: "+method);

        // log the exception
        System.out.println("\n=====>>> Executing @AfterThrowing on method: "+theExc);

    }



    //this is where we add all of our related advices for logging

    // let's start with a @Before advice

    // add new advice for @AfterReturning
    @AfterReturning(pointcut = "execution(* com.Love.ToCode.dao.AccountDAO.findAccounts(..))", returning = "result")
    public void afterReturningFindAccountsAdvice(JoinPoint theJoinPoint, List<Account> result){

        // print out which method we are advising on
        String methodSignature = theJoinPoint.getSignature().toShortString();
        System.out.println("\n=====>>> Executing @AfterReturning on method: "+methodSignature);


        // print out the results of the method
        System.out.println("\n=====>>> result is: "+result);

        //let me post-process the data -- lets modify it

        //convert the account name to uppercase
        convertAccountNamesToUpperCase(result);
        System.out.println("\n=====>>> result uppercase is : "+result);



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
        System.out.println("\n====>>> Executing @Before advice on addccount()");
    }






    /**
     * this methods will only apply to when the main calls the forDaoPagkage not for getters and setters
     */


}
