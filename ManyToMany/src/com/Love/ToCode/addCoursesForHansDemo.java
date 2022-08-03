package com.Love.ToCode;

import com.Love.ToCode.Objects.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class addCoursesForHansDemo {

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
//
//            System.out.println("adding new course....");
//            //create courses
//            Course course1 = new Course("how to program");
//            Course course2 = new Course("better coding");
//            Course course3 = new Course("code with me");
//
//            //add the new course to the student
//            course1.addStudent(theStudent);
//            course2.addStudent(theStudent);
//            course3.addStudent(theStudent);
//
//
//            //save the student
//            session.save(course1);
//            session.save(course2);
//            session.save(course3);
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
