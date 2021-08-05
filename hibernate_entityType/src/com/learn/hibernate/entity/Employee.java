package com.learn.hibernate.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name="Employee_Details")
public class Employee {
	
	@EmbeddedId
	private EmployeeId empId;
	
	@Column (name = "emp_name")
	private String empName;
	
	@Embedded
	private Address homeAddress;
	
	@Embedded
	@AttributeOverrides ({
		@AttributeOverride(name = "pincode", column = @Column(name="office_pincode")),
		@AttributeOverride(name = "area", column = @Column(name="office_area"))
	})
	private Address officeAddress;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(EmployeeId empId, String empName, Address homeAddress, Address officeAddress) {
		this.empId = empId;
		this.empName = empName;
		this.homeAddress = homeAddress;
		this.officeAddress = officeAddress;
	}
	
	public EmployeeId getEmpId() {
		return empId;
	}
	public void setEmpId(EmployeeId empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	public Address getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}
}
