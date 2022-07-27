package com.Love.ToCode;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {
     SessionFactory factory = new Configuration()
             .configure("hibernate.cfg.xml")
             .addAnnotatedClass(Instructor.class)
             .addAnnotatedClass(InstructorDetails.class)
             .buildSessionFactory();

        Session session = factory.getCurrentSession();
     try{





         session.beginTransaction();
       //get instructorDetail Object
         int theId = 7;

         InstructorDetails instructorDetails = session.get(InstructorDetails.class,theId);

         //print the instructor details
         if (instructorDetails != null){
             System.out.println("instructorDatails: "+instructorDetails);

             //print the associated instructor
             System.out.println(" the associated instructor :"+instructorDetails.getInstructor());
         }else{
             System.out.printf("instructor with id: %d not found ",theId);
         }




         session.getTransaction().commit();
         System.out.println("Done!");

     }catch(Exception exception){
         exception.printStackTrace();
     }
     finally{
         session.close();
         factory.close();
     }





    }
}
