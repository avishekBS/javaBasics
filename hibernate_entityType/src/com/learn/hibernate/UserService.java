package com.learn.hibernate;

import java.util.Date;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

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
		us.fetchAll();
		us.fetchByIdNamedQuery();
		us.fetchByIdCriteriaAPI();
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
		session.getTransaction().commit();
	}
	
	private void update(User user) {
		session.beginTransaction();
		user.setUserName("updated");
		session.update(user);
		session.getTransaction().commit();
		System.out.println(user.toString());
	}
	
	private void fetchAll() {
		session.beginTransaction();
		Query createQuery = session.createQuery("from details");
		List<User> list = createQuery.list();
		session.getTransaction().commit();
		for (Object user : list) {
			System.out.println(user.toString());
		}
	}
	private void fetchByIdNamedQuery() {
		session.beginTransaction();
		Query createQuery = session.getNamedQuery("findUserById");
		createQuery.setParameter(1, 8);
		List<User> list = createQuery.getResultList();
		session.getTransaction().commit();
		for (Object user : list) {
			System.out.println(user.toString());
		}
	}
	private void fetchByIdCriteriaAPI() {
		session.beginTransaction();
		Criteria createCriteria = session.createCriteria(User.class);
		createCriteria.add(Restrictions.ilike("userName", "% 1%"));
		List<User> list = createCriteria.list();
		session.getTransaction().commit();
		for (Object user : list) {
			System.out.println(user.toString());
		}
	}

}
