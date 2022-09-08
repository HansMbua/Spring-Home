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

            List<Student> theStudents = session.createQuery("from Student").getResultList();
            theStudents.stream().forEach(System.out::println);
            System.out.println();

             theStudents = session.createQuery("from Student s where s.lastName='king'").list();
            //display the students
             theStudents.stream().forEach(System.out::println);
            System.out.println();

            //i can use this to check if user email matches the one in the database
            theStudents = session.createQuery("from Student s where s.email like '%gmail.com'").getResultList();
            theStudents.stream().forEach(System.out::println);


            //query students where email like "

            session.getTransaction().commit();
            System.out.println("done !!");

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