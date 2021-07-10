package com.learnings.javax.ws.sei;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder = {"empName","age", "empId"})
public class Employee {
	
	private int empId;
	private String empName;
	private int age;
	
	public Employee() {
	}
	
	@XmlElement(name = "Employee_ID")
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@XmlElement(name = "Employee_Name")
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@XmlElement(name = "Employee_Age")
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
