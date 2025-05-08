package org.orm_demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        Employee emp = new Employee();

        emp.setE_id(152);
        emp.setE_name("Happy");
        emp.setDept("Developer");

//        System.out.println(emp1.getDept());

        Configuration config = new Configuration();

        config.addAnnotatedClass(org.orm_demo.Employee.class);

        config.configure("hibernate.cfg.xml");

        SessionFactory fct = config.buildSessionFactory();

        Session session = fct.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(emp);

        transaction.commit();


    }
}