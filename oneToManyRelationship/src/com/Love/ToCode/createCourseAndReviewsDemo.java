package com.Love.ToCode;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class createCourseAndReviewsDemo {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetails.class)
                .addAnnotatedClass(Review.class)
                .addAnnotatedClass(Course.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();
        try {


            session.beginTransaction();
            //create a course
            Course course = new Course("how to program in java");
            // add some reviews
            course.addReview(new Review("nice course to follow"));
            course.addReview(new Review("best of best"));
            course.addReview(new Review("this is the one i recommend for u guys"));
            //save the course .. and leverage the cascade all :-)

            System.out.println("saving the courses....");
            System.out.println(course);
            System.out.println(course.getReviews());
            session.save(course);
            System.out.println("done");

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
