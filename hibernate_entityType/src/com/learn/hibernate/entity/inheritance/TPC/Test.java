package com.learn.hibernate.entity.inheritance.TPC;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test {
	SessionFactory buildSessionFactory = new Configuration()
			.configure()
			.buildSessionFactory();

	Session session = buildSessionFactory.openSession();

	public static void main(String[] args) {
		Test us = new Test();
		us.insert();
		//us.fetch();
		
	}

	private void fetch() {
	}

	public void insert() {
		Employee emp1 = new Employee();
		emp1.setEmpName("Hope");
		
		TCSEmployee empTCS1 = new TCSEmployee();
		empTCS1.setEmpName("Avishek");
		empTCS1.setOrganisation("TCS");
		
		CovanceEmployee empCovance1 = new CovanceEmployee();
		empCovance1.setEmpName("Poushali");
		empCovance1.setOrganisation("COVANCE");
		
		session.beginTransaction();
		session.save(emp1);
		session.save(empTCS1);
		session.save(empCovance1);
		session.getTransaction().commit();
	}
}
