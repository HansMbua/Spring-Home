package com.Love.ToCode;

import com.luv2code.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class readStudentDemo {

    public static void main(String[] args) {
//        7. Querying Objects with Hibernate - Overview

        //create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
        //create session
        //creating a session each time you want to use a session
        Session session = factory.getCurrentSession();

        try{
            //use the session object to save the java object
            System.out.println("Creating student object...");
            //create a student object

            Student tempStudent = new Student("Daffy","Duck","Daffy@yahoo.com");
            //start transaction
            session.beginTransaction();
            //save the student object
            System.out.println("saving the student...");
            System.out.println(tempStudent);
            session.save(tempStudent);
            //commit
            session.getTransaction().commit();

            //MY NEW CODE

            //find out the student's id: primary key
            System.out.println("save stundent. Generated id:"+tempStudent.getId());


            //new get a new session and start transaction
            session = factory.getCurrentSession();
            session.beginTransaction();
            // retrieve student base on the id: primary key
            System.out.println("\nGetting student with id: "+tempStudent.getId());
            Student myStudent = session.get(Student.class,tempStudent.getId());

            System.out.println("Get Complete:" +myStudent);

            // commit the transaction

            session.getTransaction().commit();

            System.out.println("done !!");

        }
        finally {
            factory.close();
        }




    }
}
