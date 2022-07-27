package com.Love.ToCode;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class createIntructorDemo {

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
//            Instructor instructor  = new Instructor("susan","publica","susam.bublliec.com");
//
//            InstructorDetails instructorDetails = new InstructorDetails("http://www.youtube.com","video Games");
//            Course course = new Course("computer programming");
//                  instructor.setInstructorDetails(instructorDetails);
//                  instructor.addCourse(course);

            session.beginTransaction();
//            System.out.println("saving instuctor: "+instructor);
//
//            session.save(instructor);

            //get the instructor from the db

            Instructor instructor = session.get(Instructor.class,instrucotrId);
            //create some courses
            Course course = new Course("java design pattern");


            //add courses to the instructor
            instructor.addCourse(course);
            //save the courses
            session.save(course);
            session.getTransaction().commit();





        }finally {
            //add clean up code
            session.close();
            factory.close();
        }





    }


}
