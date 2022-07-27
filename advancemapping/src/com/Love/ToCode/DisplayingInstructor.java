package com.Love.ToCode;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class DisplayingInstructor {


    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetails.class)
                .buildSessionFactory();


        try{


            Session session = factory.getCurrentSession();
            session.beginTransaction();

            //get and display the instructor

            List<Instructor> instructorsList = session.createQuery("from Instructor ").getResultList();
            Function<Instructor,String  > byFirstName = Instructor::getFirstName;
            Function<Instructor,String  > bylastName = Instructor::getFirstName;
            Function<Instructor,String  > byEmail = Instructor::getEmail;


           Comparator<Instructor> lastThenFirst = Comparator.comparing(bylastName).thenComparing(byFirstName);

           instructorsList.stream().sorted(lastThenFirst.reversed()).forEach(System.out::println);



            session.getTransaction().commit();
            System.out.println("Done!");

        }finally{
            factory.close();
        }





    }


}
