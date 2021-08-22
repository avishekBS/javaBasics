package com.learning.framework.spring.xml.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Bike bike = (Bike) context.getBean("bike");
		bike.print();
		System.out.println(bike);
		for (Lamp lamp: bike.getListOfLamps()) {
			System.out.println("Power:"+lamp.getPower()+ "  type:"+lamp.getType());
		}
	}
}
