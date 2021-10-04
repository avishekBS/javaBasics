package com.learning.junit5;

public class Employee {

	public static void main(String[] args) {
		Employee employee = new Employee();
		System.out.println("Employee salary is -->"+employee.employeeTotalSalary(0));
	}
	public double employeeVariableSalary(int basics) {
		return (basics * 10)/100;
	}
	public double employeeTotalSalary(int basics) {
		return basics + employeeVariableSalary(basics);
	}
	
	public double simpleDivide(int input, int base) {
		return input/base;
	}

}
