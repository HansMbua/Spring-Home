package com.Love.ToCode.dao;

import com.Love.ToCode.Objacts.Account;
import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {


    public void addAccount(Account account){
        System.out.println("membership: am doing my database stuffs");
    }
}
