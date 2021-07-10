package com.learnings.javax.ws.handling.exception;

import javax.jws.WebService;

@WebService(endpointInterface = "com.learnings.javax.ws.handling.exception.CalculatorFunctions")
public class CalculatorImpl implements CalculatorFunctions{
	
	@Override
	public int addition(int a, int b) {
		return a + b;
	}

	@Override
	public int multiplication(int a, int b) {
		return a * b;
	}

	@Override
	public int substraction(int a, int b) {
		return a - b;
	}

	@Override
	public int division(int a, int b) {
		int c =0;
		try {
			c = a/b;
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		return 0;
	}
	@Override
	public String powerOf(double base, double pow) throws InvalidInputException {
		if (pow >= 0) {
			return String.valueOf(Math.pow(base, pow));
		}
		else {
			throw new InvalidInputException("Power number is less than zero","power num "+pow+" is not allowed.");
		}
	}

}
