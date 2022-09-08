package com.Love.ToCode;

import com.luv2code.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        //create session factory
        SessionFactory factory = new Configuration()
                                   .configure("hibernate.cfg.xml")
                                   .addAnnotatedClass(Student.class)
                                   .buildSessionFactory();
        //create session
        Session session = factory.getCurrentSession();

        try{
            //use the session object to save the java object
            System.out.println("Creating student object...");
            //create a student object

            session.beginTransaction();
            //save the student object
            //query students


            int studentId = 1;
            //geting student from the database
            Student myStudent = session.get(Student.class,studentId);
            //updating the firstname of the student
            System.out.println("updating student...");
            myStudent.setFirstName("Hans");
            myStudent.setEmail("hans@yahoo.com");
            session.getTransaction().commit();

            //NEW CODE
            session = factory.getCurrentSession();
            session.beginTransaction();
            // update email for all students
            System.out.println("update email for all students");

            session.createQuery("update Student set email='hans@gmail.com'").executeUpdate();


            session.getTransaction().commit();


            //  NEW CODE


            System.out.println("student name updated !!");


        }
        finally {
            factory.close();
        }




    }
}













//
//        String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
//        String user = "hbstudent";
//        String pass = "hbstudent";
//
//        try{
//
//            System.out.println("Connecting to database:"+jdbcUrl);
//            Connection connection = DriverManager.getConnection(jdbcUrl,user,pass);
//            System.out.println("connection successfully !!");
//
//        }catch (Exception exception){
//            exception.printStackTrace();
//        }