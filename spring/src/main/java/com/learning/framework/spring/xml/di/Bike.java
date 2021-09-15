package com.learning.framework.spring.xml.di;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ResourceBundleMessageSource;

public class Bike implements Automobile, ApplicationContextAware, BeanNameAware, InitializingBean, DisposableBean{
	
	private String model;
	private int chasisNo;
	private int engineNo;
	private Tyre fontTyre;
	private Tyre rearTyre;
	private List<Lamp> listOfLamps;
	ApplicationContext applicationContext;
	private String beanName;
	@Autowired
	private ResourceBundleMessageSource messageSource;
	
	public Bike() {
		System.out.println("Bike() default constructor. Bean Name:"+beanName);
	}
	
	public Bike(String model, int chasisNo, int engineNo) {
		this.model = model;
		this.chasisNo = chasisNo;
		this.engineNo = engineNo;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getChasisNo() {
		return chasisNo;
	}

	public void setChasisNo(int chasisNo) {
		this.chasisNo = chasisNo;
	}

	public int getEngineNo() {
		return engineNo;
	}

	public void setEngineNo(int engineNo) {
		this.engineNo = engineNo;
	}

	public Tyre getFontTyre() {
		return fontTyre;
	}

	public void setFontTyre(Tyre fontTyre) {
		this.fontTyre = fontTyre;
	}

	public Tyre getRearTyre() {
		return rearTyre;
	}

	public void setRearTyre(Tyre rearTyre) {
		this.rearTyre = rearTyre;
	}
	
	public List<Lamp> getListOfLamps() {
		return listOfLamps;
	}

	public void setListOfLamps(List<Lamp> listOfLamps) {
		this.listOfLamps = listOfLamps;
	}

	public void setMessageSource(ResourceBundleMessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public ResourceBundleMessageSource getMessageSource() {
		return messageSource;
	}

	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	public String getBeanName() {
		return beanName;
	}

	@Override public String toString() {  
		String value = "Bike [model=" + model +
	  ", chasisNo=" + chasisNo + 
	  ", engineNo=" + engineNo +
	  ", fontTyre_Manufacture=" + fontTyre.getManufacture() + 
	  ", fontTyre_size=" + fontTyre.getTyreSize() + 
	  ", rearTyre_Manufacture=" + rearTyre.getManufacture() + 
	  ", rearTyre_size=" + rearTyre.getTyreSize() +
	  " ]";
	return value;
	  }

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean init method called from Bike class. Bean Name:"+beanName);
	}

	public void destroy() throws Exception {
		System.out.println("disposableBean destroy method called from Bike class. Bean Name:"+beanName);
	}
	public void myInit() throws Exception {
		System.out.println("custom init method called from Bike class. Bean Name:"+beanName);
	}

	public void myDispose() throws Exception {
		System.out.println("custom destroy method called from Bike class Bean Name:"+beanName);
	}
	public void globalBeansInit() throws Exception {
		System.out.println("global BeansInit method called from Bike class Bean Name:"+beanName);
	}

	public void globalBeansDispose() throws Exception {
		System.out.println("global Beansdestroy method called from Bike class Bean Name:"+beanName);
	}

	public void print() {
		System.out.println(" This is a bike from "+Bike.class);
	}
	
	public void getMessageSourceService() {
		getMessageSource().getMessage("message.source.example2", null, "defualt message source ",null);
	}
}
