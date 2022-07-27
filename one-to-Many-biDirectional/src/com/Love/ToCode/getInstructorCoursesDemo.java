package com.Love.ToCode;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class getInstructorCoursesDemo {

    public static void main(String[] args) {





    SessionFactory factory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(Instructor.class)
            .addAnnotatedClass(InstructorDetails.class)
            .addAnnotatedClass(Course.class)
            .buildSessionFactory();
    Session session = factory.getCurrentSession();

        try{
        int instrucotrId = 2;
        //creating the object

        session.beginTransaction();


        Instructor instructor = session.get(Instructor.class, instrucotrId);
            System.out.println("Instructor: "+instructor);
            //get courses for instructor
            System.out.println("courses: "+instructor.getCourses());



        session.getTransaction().commit();


    }finally{
        //add clean up code
        session.close();
        factory.close();
    }
    }
}




