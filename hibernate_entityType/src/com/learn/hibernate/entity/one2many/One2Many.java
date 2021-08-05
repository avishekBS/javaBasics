package com.learn.hibernate.entity.one2many;

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
		//System.out.println("************************************************");
		//o2m.geto2m();
	}


	public void inserto2m() {
		Vehicle obj1 = new Vehicle("2 wheeler", "TB 350");
		Vehicle obj2 = new Vehicle("4 wheeler", "Chevrolet Beat");
		
		User user1 = new User();
		user1.setUsername("Avishek");
		user1.getListOfVehicle().add(obj1);
		user1.getListOfVehicle().add(obj2);
		
		session.beginTransaction();
		session.save(user1);
		session.save(obj1);
		session.save(obj2);
		session.getTransaction().commit();
	}
	public void geto2m() {
	}

}
