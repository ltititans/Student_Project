package com.lti.hib_ex.Hibernate_Project2;

import java.util.Scanner;

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
        Scanner ob=new Scanner(System.in);
      System.out.println("Enter your choice:");
      int n=ob.nextInt();
      if(n==1)
      {
    	  student.setName("ABD");
          student.setAddress("Africa");
          session.beginTransaction();
          session.save(student);
          session.getTransaction().commit();
      }
      else
    	  if(n==2)
    	  {		
    		  student.setRollno(1);
    		  student.setName("MSD");
              student.setAddress("India");
              session.beginTransaction();
              session.update(student);
              session.getTransaction().commit();
    	  }
        
    }
}