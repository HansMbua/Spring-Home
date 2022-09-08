package com.Love.ToCode;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {
	/*
	Create the database table.
    Set up the Hibernate configuration file.
    Create a Java class (entity) with Hibernate annotations.
    Develop a main application.
    Develop code to save objects.
    Develop code to retrieve an object by primary key.
    Develop code to query objects to find employees for a given company.
    Develop code to delete an object by primary key.


	 */
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try{

            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            //create object
            System.out.println("adding object to database...");

            Employee employee1 = new Employee("Leticia","love","AP");

            //add object to database
            System.out.println("saving object to database....");

            session.save(employee1);
            //get a confirmation when its added

            session.getTransaction().commit();
            System.out.println("done");


        }finally {

            sessionFactory.close();

        }




    }
}
