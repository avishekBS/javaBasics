package com.learnings.javax.ws.handling.exception;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface CalculatorFunctions {
	
	@WebMethod(operationName = "add")
	@WebResult(name = "return_add")
	public int addition(int a, int b);
	
	@WebMethod(operationName = "multiply")
	@WebResult(name = "return_multiply")
	public int multiplication(int a, int b);
	
	@WebMethod(operationName = "subtract")
	@WebResult(name = "return_subtract")
	public int substraction(int a, int b);
	
	@WebMethod(operationName = "divide")
	@WebResult(name = "return_divide")
	public int division(int a, int b);
	
	@WebMethod(operationName = "power")
	@WebResult(name = "return_power")
	public String powerOf(double base, double pow) throws InvalidInputException;
}
