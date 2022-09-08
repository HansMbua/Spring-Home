package com.Love.ToCode;

import com.luv2code.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

    public static void main(String[] args) {


        //create session factory
        SessionFactory factory = new Configuration()
                                   .configure("hibernate.cfg.xml")
                                   .addAnnotatedClass(Student.class)
                                   .buildSessionFactory();
        //create session
        Session session = factory.getCurrentSession();

        try{
            //use the session object to save the java object
            System.out.println("Creating student object...");
            //create a student object

            Student theStudent = new Student("Hans","mbua","hansbua@yahoo.com");
            //start transaction
            session.beginTransaction();
            //save the student object
            System.out.println("saving the student...");
            session.save(theStudent);
            //commit
            session.getTransaction().commit();
            System.out.println("done !!");

        }
        finally {
            factory.close();
        }




    }
}













//
//        String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
//        String user = "hbstudent";
//        String pass = "hbstudent";
//
//        try{
//
//            System.out.println("Connecting to database:"+jdbcUrl);
//            Connection connection = DriverManager.getConnection(jdbcUrl,user,pass);
//            System.out.println("connection successfully !!");
//
//        }catch (Exception exception){
//            exception.printStackTrace();
//        }