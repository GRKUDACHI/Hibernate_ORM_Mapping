package org.bank_deatils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Bankdeatisl b1 = new Bankdeatisl(101, "SBI", "Mumbai", "SBI000MUM001");
        Bankdeatisl b2 = new Bankdeatisl(102, "HDFC", "Delhi", "HDFC000DEL002");
        Bankdeatisl b3 = new Bankdeatisl(103, "ICICI", "Chennai", "ICICI000CHE003");
        Bankdeatisl b4 = new Bankdeatisl(104, "PNB", "Kolkata", "PNB000KOL004");
        Bankdeatisl b5 = new Bankdeatisl(105, "Axis", "Hyderabad", "AXIS000HYD005");

        // Load Hibernate Configuration
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        config.addAnnotatedClass(Bankdeatisl.class);

        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();

        // Begin Transaction
        Transaction tx = session.beginTransaction();

        // Save data
        session.persist(b1);
        session.persist(b2);
        session.persist(b3);
        session.persist(b4);
        session.persist(b5);

        // Commit transaction
        tx.commit();

        // View all bank data
        System.out.println("Fetching all bank records:");
        List<Bankdeatisl> bankList = session.createQuery("FROM Bankdeatisl", Bankdeatisl.class).getResultList();

        for (Bankdeatisl bank : bankList) {
            System.out.println("ID: " + bank.getBnk_id() +
                    ", Name: " + bank.getBnk_name() +
                    ", City: " + bank.getBnk_city() +
                    ", IFSC: " + bank.getBnk_ifc());
        }

        // Close session
        session.close();
        factory.close();
    }
}