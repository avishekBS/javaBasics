package com.learning.framework.spring.anno.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bike {
	
	@Value (value = "Bajaj")
	private String model;
	
	@Value (value = "23456")
	private int chasisNo;
	
	@Value (value="09876")
	private int engineNo;
	
	@Autowired 
	private Tyre fontTyre;
	
	@Autowired
	private Tyre rearTyre;
	
	public Bike() {
		System.out.println("Bike() default constructor");
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

	public void print() {
		System.out.println("This is a EV bike");
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

	
	  @Override public String toString() { return "Bike [model=" + model +
	  ", chasisNo=" + chasisNo + ", engineNo=" + engineNo +
	  ", fontTyre_Manufacture=" + fontTyre.getManufacture() + ", fontTyre_size=" +
	  fontTyre.getTyreSize() + ", rearTyre_Manufacture=" + rearTyre.getManufacture() + ", rearTyre_size=" +
			  rearTyre.getTyreSize() +" ]";
	  }
	 
	
}
