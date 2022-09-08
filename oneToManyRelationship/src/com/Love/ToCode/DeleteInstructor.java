package com.Love.ToCode;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteInstructor {

    public static void main(String[] args) {
     SessionFactory factory = new Configuration()
             .configure("hibernate.cfg.xml")
             .addAnnotatedClass(Instructor.class)
             .addAnnotatedClass(InstructorDetails.class)
             .addAnnotatedClass(Course.class)
             .buildSessionFactory();


     try{

       int theId = 12;



         Session session = factory.getCurrentSession();
         session.beginTransaction();
         //get course form the database
               Course theCourse = session.get(Course.class,theId);

         //delete the course

              session.delete(theCourse);

         session.getTransaction().commit();
         System.out.println("Done!");

     }finally{
         factory.close();
     }





    }
}
