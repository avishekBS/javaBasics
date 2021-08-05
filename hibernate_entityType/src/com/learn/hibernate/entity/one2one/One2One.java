package com.learn.hibernate.entity.one2one;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.learn.hibernate.entity.one2one.User;

public class One2One {
	SessionFactory buildSessionFactory = new Configuration()
			.configure()
			.buildSessionFactory();

	Session session = buildSessionFactory.openSession();

	public static void main(String[] args) {
		One2One us = new One2One();
		us.insert();
		//us.fetch();
		
	}

	private void fetch() {
	}

	public void insert() {
		DrivingLicense dlObj1 = new DrivingLicense("Two Wheeler");
		User user1 = new User(839021, "Avishek", dlObj1);
		
		session.beginTransaction();
		session.save(user1);
		session.save(dlObj1);
		session.getTransaction().commit();
	}

}
