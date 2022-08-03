package com.Love.ToCode;

import com.Love.ToCode.Objects.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetCoursesForHansDemo {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetails.class)
                .addAnnotatedClass(Review.class)
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();
        try {

            int theId = 1;
            session.beginTransaction();
            //get the student
            Student theStudent = session.get(Student.class, theId);
            System.out.println("\nLoaded student: " + theStudent);
            System.out.println("Course: " + theStudent.getCourses());



            session.getTransaction().commit();
            System.out.println("Done!");

        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            session.close();
            factory.close();
        }


    }
}
