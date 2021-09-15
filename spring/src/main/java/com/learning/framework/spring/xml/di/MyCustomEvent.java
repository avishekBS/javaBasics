package com.learning.framework.spring.xml.di;

import org.springframework.context.ApplicationEvent;

public class MyCustomEvent extends ApplicationEvent{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public MyCustomEvent(Object source) {
		super(source);
	}
	@Override
	public String toString() {
		return "From my custom Event";
	}

}
