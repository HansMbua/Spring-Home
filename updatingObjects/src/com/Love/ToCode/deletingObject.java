package com.Love.ToCode;

import com.luv2code.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class deletingObject {

    public static void main(String[] args) {


        //create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
        //create session
        Session session = factory.getCurrentSession();

        try {
            int studentId = 1;

            //NEW CODE
            session = factory.getCurrentSession();
            session.beginTransaction();
            // retrieve student base on id:
            System.out.println("Getting student with id : " + studentId);
            Student myStudent = session.get(Student.class, studentId);
//            System.out.println("deleting: "+myStudent);
//            session.delete(myStudent);
            System.out.println("deleting student with id = 2");
             session.createQuery("delete from Student where id = 2").executeUpdate();

            session.getTransaction().commit();

            System.out.println("DONE!!");
            //  NEW CODE





        } finally {
            factory.close();
        }


    }
}
