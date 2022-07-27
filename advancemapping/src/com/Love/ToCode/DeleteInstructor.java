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
             .buildSessionFactory();


     try{

       int instructorId = 1;



         Session session = factory.getCurrentSession();
         session.beginTransaction();

          Instructor instructor = session.get(Instructor.class,instructorId);
         System.out.println("found instructor: "+instructor);
          //delete the instuctor
           if (instructor != null){
               System.out.println("Deleting: "+instructor);
               session.delete(instructor);
           }else
               System.out.println("instructor not Found");

         System.out.println("instructor deleted");
         session.getTransaction().commit();
         System.out.println("Done!");

     }finally{
         factory.close();
     }





    }
}
