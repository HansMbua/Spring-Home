package com.Love.ToCode;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class EmployeeGet {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();


        try {
            int employeesID = 1;
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            //get user with id from the datebase
            System.out.println("deleting user from the database...");
//getting object by primary key
//            Employee employee = session.get(Employee.class, employeesID);
            //finding employees for a given company

//            Query query = session.createQuery("from Employee e where  e.company ='amazon' ");
//
//            List<Employee> employeeList = query.getResultList();
//
//            System.out.println("list of all employees are ");
//           employeeList.forEach(System.out::println);

            Employee employee = session.get(Employee.class, employeesID);

            session.delete(employee);
            System.out.println("employee deleted");

            session.getTransaction().commit();

        } finally {
            factory.close();
        }

    }

}


