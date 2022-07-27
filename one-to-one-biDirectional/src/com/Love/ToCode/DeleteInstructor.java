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

       int instructorId = 7;



         Session session = factory.getCurrentSession();
         session.beginTransaction();

        //get instructor datail by id
         InstructorDetails instructorDetails = session.get(InstructorDetails.class,instructorId);

          //delete the instuctor
           if (instructorDetails != null){
               System.out.println("Deleting: "+instructorDetails);

               //breaking the link
               instructorDetails.getInstructor().setInstructorDetails(null);
               session.delete(instructorDetails);
           }else{
               System.out.println("instructorDetails not Found");

               System.out.println("instructorDetails not deleted");
           }

         session.getTransaction().commit();
         System.out.println("Done!");

     }finally{
         factory.close();
     }





    }
}
