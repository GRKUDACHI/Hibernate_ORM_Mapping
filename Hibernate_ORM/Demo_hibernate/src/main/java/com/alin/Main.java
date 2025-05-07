package com.alin;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");

//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
        Student s1 = new Student();
        s1.getId(101);
        s1.getName("HAPPY");
        s1.getEdu("B.E");

        Configuration config = new Configuration();
        config.addAnnotatedClass(com.alin.Student.class);
        config.configure("hibernate.cfg.xml");

        SessionFactory fct = config.buildSessionFactory();

        Session session = fct.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(s1);

        transaction.commit();


    }
}