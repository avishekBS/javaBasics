package com.learn.hibernate.entity.many2many;

import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Many2Many{
	Session session = new Configuration()
			.configure()
			.buildSessionFactory().openSession();
	
	
	public static void main(String[] args) {
		Many2Many m2m = new Many2Many();
		m2m.inserto2m();
		//System.out.println("************************************************");
		//o2m.geto2m();
	}


	public void inserto2m() {
		RentalCar obj1 = new RentalCar("2 wheeler", "TB 350");
		RentalCar obj2 = new RentalCar("4 wheeler", "Chevrolet Beat");
		RentalCar obj3 = new RentalCar("8 wheeler", "Lorry");
		
		User user1 = new User();
		user1.setUsername("Avishek");
		user1.getListOfCarRented().add(obj1);
		user1.getListOfCarRented().add(obj2);

		
		User user2 = new User();
		user2.setUsername("Poushali");
		user2.getListOfCarRented().add(obj2);
		user2.getListOfCarRented().add(obj3);
		
		obj1.getListOfUsers().add(user1);
		obj2.getListOfUsers().add(user1);
		obj2.getListOfUsers().add(user2);
		obj3.getListOfUsers().add(user2);
		
		session.beginTransaction();
		session.persist(user1);
		session.persist(user2);
		//dont save vehicle obj..instead cascade them
		//session.save(obj1);
		//session.save(obj2);
		//session.save(obj3);
		session.getTransaction().commit();
	}
	public void geto2m() {
	}

}
