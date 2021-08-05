package com.learn.hibernate.entity.one2many.embedded;

import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class One2Many {
	Session session = new Configuration()
			.configure()
			.buildSessionFactory().openSession();
	
	
	public static void main(String[] args) {
		One2Many o2m = new One2Many();
		o2m.inserto2m();
		System.out.println("************************************************");
		o2m.geto2m();
	}


	public void inserto2m() {
		Address addr1 = new Address(799001, "Agartala");
		Address addr2 = new Address(560049, "Bangalore");
		
		User user1 = new User();
		User user2 = new User();
		
		user1.setUsername("Avishek");
		user1.getListOfAddress().add(addr1);
		user1.getListOfAddress().add(addr2);
		
		user2.setUsername("Poushali");
		user2.getListOfAddress().add(addr1);
		user2.getListOfAddress().add(addr2);
		
		session.beginTransaction();
		session.save(user1);
		session.save(user2);
		session.getTransaction().commit();
	}
	public void geto2m() {
		User user1 = new User();
		user1 = null;
		session.beginTransaction();
		user1  = session.get(User.class, 1);
		System.out.println(user1.toString());
		Collection<Address> listOfAddress = user1.getListOfAddress();
		for (Address address : listOfAddress) {
			System.out.println(address.toString());
		}
		session.getTransaction().commit();
	}

}
