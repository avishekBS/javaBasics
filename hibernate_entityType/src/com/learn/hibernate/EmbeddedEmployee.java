package com.learn.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.learn.hibernate.entity.Address;
import com.learn.hibernate.entity.Employee;
import com.learn.hibernate.entity.EmployeeId;

public class EmbeddedEmployee {
	public static void main(String[] args) {
		EmployeeId eId = new EmployeeId();
		Address homeAddr = new Address(799001, "Agartala");
		Address officeAddr = new Address(560049, "Bangalore");
		Employee e1 = new Employee(eId, "Avishek", homeAddr, officeAddr);
		
		SessionFactory buildSessionFactory = new Configuration()
				.configure()
				.buildSessionFactory();

		Session session = buildSessionFactory.openSession();
		session.beginTransaction();
		session.save(e1);
		session.getTransaction().commit();
	}
}
