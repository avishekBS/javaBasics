package com.learn.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.learn.hibernate.entity.User;

public class UserService {
	SessionFactory buildSessionFactory = new Configuration()
			.configure()
			.buildSessionFactory();

	Session session = buildSessionFactory.openSession();

	public static void main(String[] args) {
		UserService us = new UserService();
		us.insert();
		User user = us.fetch();
		us.update(user);
		user = us.fetch();
		us.delete(user);
		us.session.close();
	}

	private User fetch() {
		User user = new User();
		user = session.get(User.class, 2);
		System.out.println(user.toString());
		return user;
	}

	public void insert() {
		session.beginTransaction();
		for (int i = 0; i < 10; i++) {
			User user = new User("user "+i, new Date(), "description "+i, "others "+i);
			session.save(user);
		}
		session.getTransaction().commit();
	}
	
	private void delete(User user) {
		session.beginTransaction();
		session.delete(user);
		System.out.println(user.toString());
		session.getTransaction().commit();
	}
	
	private void update(User user) {
		System.out.println("*************");
		session.beginTransaction();
		user.setUserName("updated");
		session.update(user);
		session.getTransaction().commit();
		System.out.println(user.toString());
		System.out.println("*************");
	}

}
