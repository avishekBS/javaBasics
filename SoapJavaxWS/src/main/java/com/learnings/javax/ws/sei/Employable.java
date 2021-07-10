package com.learnings.javax.ws.sei;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface Employable {
	
	@WebMethod(action = "action_fetchEmployeeDetails", operationName = "fetchEmployeeDetails")
	@WebResult(name = "Employee")
	Employee getEmployeeDetails(@WebParam(name = "EmployeeId")int empId);

	@WebMethod(action = "action_insertEmployeeDetails", operationName = "insertEmployeeDetails")
	@WebResult(name = "noReturn")
	void addEmployeeDetails(@WebParam(name = "Employee")Employee employee);

}