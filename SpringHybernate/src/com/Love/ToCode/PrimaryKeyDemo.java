package com.Love.ToCode;

import com.luv2code.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PrimaryKeyDemo {

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
            System.out.println("Creating 3 student object...");
            //create a student object

            Student theStudent = new Student("james","love","james@yahoo.com");
            Student theStudent1 = new Student("vikey","king","vikey@yahoo.com");
            Student theStudent2 = new Student("lovert","king","lovert@yahoo.com");
            //start transaction
            session.beginTransaction();
            //save the student object
            System.out.println("saving the student...");
            session.save(theStudent);
            session.save(theStudent1);
            session.save(theStudent2);
            //commit
            session.getTransaction().commit();
            System.out.println("done !!");

        }
        finally {
            factory.close();
        }




    }
}
