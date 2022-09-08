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


     try{
        Instructor instructor = new Instructor("leticia","james","leticia@yahoo.com");
        InstructorDetails instructorDetails = new InstructorDetails("http://www.youtube.com/leticia","singing");
//         Instructor instructor = new Instructor("vladimir","mbua","hba@yahoo.com");
//         InstructorDetails instructorDetails = new InstructorDetails("http://www.youtube.com","music ");

           instructor.setInstructorDetails(instructorDetails);


         Session session = factory.getCurrentSession();
         session.beginTransaction();
         //transaction database login here
         //Note: this will  ALSO save the detail object
         // because of CascadeType.All
               session.save(instructor);
         System.out.println("saving instructor:"+instructor);
         session.getTransaction().commit();
         System.out.println("Done!");

     }finally{
         factory.close();
     }





    }
}
