package com.example.springmvcdemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class userData {
    @Id
    @Column(name = "id")
    private int id;

    @NotNull(message = "required")
    @Column(name = "first_name")
    private String firstName;

    @NotNull(message = "required")
    @Column(name = "last_name")
    private String lastName;

    @NotNull(message = "required")
    @Column(name = "user_name")
    private String userName;

    @Column(name = "email")
    private String email;

    @NotNull(message = "required")
    @Column(name = "password")
    private String password;

    @Min(message = "18 and above", value = 18)
    @Column(name = "age", nullable = false)
    private int age;


    private ArrayList company;

    public userData(String firstName, String lastName, String userName, String email, String password, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.age = age;
        company = new ArrayList();
        company.add("microsoft");
        company.add("ktn");



    }

    public userData() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List getCompany() {
        return company;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
