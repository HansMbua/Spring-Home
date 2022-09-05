package com.love2code.springsecurity.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {



    public static void main(String arg[]){

      String driverURL = "com.mysql.cj.jdbc.Driver";
      String Url = "jdbc:mysql://localhost:3306/spring_security_demo_plaintext?useSSL=false";
      String password = "hbstudent";
      String username = "hbstudent";
        try {
            Class.forName(driverURL);
            Connection connection = DriverManager.getConnection(Url,username,password);
            System.out.println("connected to database");

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }




    }




