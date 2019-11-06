package com.lti.hib_ex.Hibernate_Project2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.lti.hib_ex.Hibernate_Project2.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration configuration = new Configuration().configure();
        StandardServiceRegistryBuilder builder =new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        SessionFactory factory=configuration.buildSessionFactory(builder.build());
        Session session=factory.openSession();
        Student student=new Student();
        student.setRollno(1);
        student.setName("A");
        student.setAddress("Africa");
        session.beginTransaction();
        session.update(student);
        session.getTransaction().commit();
    }
}
