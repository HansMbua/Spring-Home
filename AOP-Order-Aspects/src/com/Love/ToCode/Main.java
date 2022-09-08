package com.Love.ToCode;


import com.Love.ToCode.dao.AccountDAO;
import com.Love.ToCode.dao.MembershipDAO;
import com.Love.ToCode.daoDemo.Account;
import com.Love.ToCode.daoDemo.DemoConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

       AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

       //get the bean from spring container
        AccountDAO theAccountDAO = context.getBean("accountDAO",AccountDAO.class);

        //get the membership component bean
        MembershipDAO theMembershipDAO = context.getBean("membershipDAO",MembershipDAO.class);

        Account account = new Account();

        // call the business method
        theAccountDAO.addAccount(account);
         theAccountDAO.display();

         //call the accountdao getter/setter methods
        theAccountDAO.setName("foobar");
        theAccountDAO.setServiceCode("silver");


        String name = theAccountDAO.getName();
        String code = theAccountDAO.getServiceCode();

        theMembershipDAO.addAccount(account);


        // close the context
        context.close();


    }
}
