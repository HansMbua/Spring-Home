package com.Love.ToCode.dao;

import com.Love.ToCode.Objacts.Account;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountDAO {

    private String name;
    private String serviceCode;

    // add a new method: findAccounts()

    public List<Account> findAccounts(boolean tripAccout) {

        if (tripAccout){
            throw new RuntimeException("no soup for you!!!");
        }


        List<Account> myAccounts = new ArrayList<>();
        //create sample accounts
        Account temp1 = new Account("John", "silver");
        Account temp2 = new Account("madhu", "platinum");
        Account temp3 = new Account("Luca", "Gold");

        myAccounts.add(temp1);
        myAccounts.add(temp1);
        myAccounts.add(temp1);


        return myAccounts;
    }


    public void addAccount(Account account) {
        System.out.println(getClass() + ":DOING MY DB WORK: ADDING ACCOUNT");
    }

    public void display() {
        System.out.println("hello this is accountDAO");
    }

    public String getName() {
        System.out.println(getClass() + ":in getName()");
        return name;
    }

    public void setName(String name) {
        System.out.println(getClass() + ":in setName()");
        this.name = name;
    }

    public String getServiceCode() {
        System.out.println(getClass() + ":in getServiceCode()");
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        System.out.println(getClass() + ":in setServiceCode()");
        this.serviceCode = serviceCode;
    }
}
