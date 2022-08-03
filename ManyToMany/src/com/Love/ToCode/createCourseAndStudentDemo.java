package com.Love.ToCode;

import com.Love.ToCode.Objects.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class createCourseAndStudentDemo {

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
            // creat the course
            Course theCourse = new Course("Java head first");
            // print the course
            System.out.println("saving the course");
            // print the course reviews
            session.save(theCourse);
            System.out.println("saved the course : " + theCourse);
            //create the student

            Student student1 = new Student("hans", "mbua", "hansmbua@yahoo.com");
            Student student2 = new Student("leticia", "njwei", "leticianjwei@yahoo.com");
            //add the student to the course
            theCourse.addStudent(student1);
            theCourse.addStudent(student2);
            //save the students
            session.save(student1);
            session.save(student2);
            System.out.println("saved students: "+theCourse.getStudents());
            //commit transaction
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
