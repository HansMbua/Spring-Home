package com.Love.ToCode.dao;

import com.Love.ToCode.daoDemo.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    private String name;
    private String serviceCode;

    public void  addAccount(Account account){
        System.out.println(getClass()+":DOING MY DB WORK: ADDING ACCOUNT");
    }

    public void display(){
        System.out.println("hello this is accountDAO");
    }

    public String getName() {
        System.out.println(getClass()+":in getName()");
        return name;
    }

    public void setName(String name) {
        System.out.println(getClass()+":in setName()");
        this.name = name;
    }

    public String getServiceCode() {
        System.out.println(getClass()+":in getServiceCode()");
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        System.out.println(getClass()+":in setServiceCode()");
        this.serviceCode = serviceCode;
    }
}
