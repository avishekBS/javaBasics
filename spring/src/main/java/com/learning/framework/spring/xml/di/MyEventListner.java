package com.learning.framework.spring.xml.di;

import org.springframework.context.ApplicationListener;

public class MyEventListner implements ApplicationListener<MyCustomEvent> {

	public void onApplicationEvent(MyCustomEvent event) {
		System.out.println("from Event Listner: :"+event.toString());
	}

}
