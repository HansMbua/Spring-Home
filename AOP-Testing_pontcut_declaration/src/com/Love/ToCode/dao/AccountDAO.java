package com.Love.ToCode.dao;

import com.Love.ToCode.daoDemo.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    public void  addAccount(Account account){
        System.out.println(getClass()+":DOING MY DB WORK: ADDING ACCOUNT");
    }

    public void display(){
        System.out.println("hello this is accountDAO");
    }


}
