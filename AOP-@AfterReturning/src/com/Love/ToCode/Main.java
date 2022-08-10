package com.Love.ToCode;


import com.Love.ToCode.dao.AccountDAO;
import com.Love.ToCode.dao.MembershipDAO;
import com.Love.ToCode.Objacts.Account;
import com.Love.ToCode.Objacts.DemoConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {

    public static void main(String[] args) {

       AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

       //get the bean from spring container
        AccountDAO theAccountDAO = context.getBean("accountDAO",AccountDAO.class);

        //call method to find the accounts
        List<Account> theAccounts = null;

        try{
            boolean tripWire = false;
            theAccounts = theAccountDAO.findAccounts(tripWire);
        }catch (Exception exception){
            System.out.println("\n\nMain Program ... caught exception:"+exception);
        }


        //display the accounts
        System.out.println("\n\nMain Program: AfterReturningDemoApp");
        System.out.println("----");


        System.out.println(theAccounts);
        System.out.println("\n");

        // close the context
        context.close();


    }
}
