package com.Love.ToCode;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.Query;

public class fetchJoinDemo {

    public static void main(String[] args) {





    SessionFactory factory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(Instructor.class)
            .addAnnotatedClass(InstructorDetails.class)
            .addAnnotatedClass(Course.class)
            .buildSessionFactory();
    Session session = factory.getCurrentSession();

        try{
        int instrucotrId = 1;
        //creating the object

        session.beginTransaction();


            Query query = session.createQuery("select  i from Instructor i JOIN FETCH i.courses where i.id=:theInstructorId",
                    Instructor.class);

            query.setParameter("theInstructorId",instrucotrId);
            // execute query and get instructor
            Instructor instructor = (Instructor) query.getSingleResult();

            System.out.println("Hans : Instructor: "+instructor);
            //get courses for instructor
            System.out.println("Hans: courses: "+instructor.getCourses());



        session.getTransaction().commit();
            System.out.println("done");


    }finally{
        //add clean up code
        session.close();
        factory.close();
    }
    }
}




