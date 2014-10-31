package com.hiber.save;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.user.UserDetails;

public class Save
{

	public static void main(String[] args)
	{
		UserDetails user = new UserDetails();
		user.setUserId(2);
		user.setUserName("Software Junkie");
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		session.save(user);
		
		session.getTransaction().commit();
		System.out.println("Data Added");
	}

}
