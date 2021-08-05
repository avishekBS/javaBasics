package com.learn.hibernate.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Embeddable
public class EmployeeId implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int empId;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	

}
