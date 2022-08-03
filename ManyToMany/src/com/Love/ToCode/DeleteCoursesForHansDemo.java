package com.Love.ToCode;

import com.Love.ToCode.Objects.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteCoursesForHansDemo {

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

            int theId = 10;
            session.beginTransaction();
            Course theCourse = session.get(Course.class,theId);

            System.out.println("Deleting the course: "+theCourse);
            session.delete(theCourse);



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
