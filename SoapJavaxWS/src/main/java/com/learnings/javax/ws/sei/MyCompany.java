package com.learnings.javax.ws.sei;

import java.util.ArrayList;

import javax.jws.WebService;

@WebService(endpointInterface = "com.learnings.javax.ws.sei.Employable",serviceName = "EmployeeService",
portName = "EmployeePort", name = "Employee",
targetNamespace = "http://ServiceEndpointInterface.webservices.javax.learnings.com/")
public class MyCompany implements Employable {
	
	ArrayList<Employee> employees = new ArrayList<Employee>();
	
	@Override
	public Employee getEmployeeDetails(int empId){
		for (Employee employee : employees) {
			if(empId == employee.getEmpId()) {
				return employee;
			}
		}
		return null;
	}
	
	@Override
	public void addEmployeeDetails(Employee employee){
		employees.add(employee);
	}
}
