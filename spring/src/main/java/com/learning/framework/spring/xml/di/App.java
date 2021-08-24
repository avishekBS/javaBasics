package com.learning.framework.spring.xml.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		/*
		 * with application context registerShutdownHook() method not found.
		 * registerShutdownHook() method- helps to find the disposableBean interface class and also destroy-method in Bean
		 * 
		--> ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		*/
		System.out.println("Application context is creating....");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("Application context is created sucessfully....start registerShutdownHook() started...");
		context.registerShutdownHook();
		System.out.println("creating BIKE as getBean...");
		Automobile automobile = (Automobile) context.getBean("bike");
		automobile.print();
		System.out.println(automobile);
		for (Lamp lamp: ((Bike) automobile).getListOfLamps()) {
			System.out.println("Power:"+lamp.getPower()+ "  type:"+lamp.getType());
		}
		Automobile car = (Automobile) context.getBean("car");
		car.print();
	}
}
