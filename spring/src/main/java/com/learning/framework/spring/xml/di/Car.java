package com.learning.framework.spring.xml.di;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class Car implements Automobile, ApplicationEventPublisherAware{
	private ApplicationEventPublisher applicationEventPublisher;
	public void print() {
		System.out.println(" This is a car from "+Car.class);
		MyCustomEvent myCustomEvent = new MyCustomEvent(this);
		System.out.println("Car Event publish Start....");
		applicationEventPublisher.publishEvent(myCustomEvent);
		System.out.println("Car Event publish Done....");
	}

	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;
	}
}
