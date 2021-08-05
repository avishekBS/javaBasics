package com.learn.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	@Column (name="home_pinCode")
	private int pincode;
	@Column (name="home_area")
	private String area;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(int pincode, String area) {
		this.pincode = pincode;
		this.area = area;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
}
