package com.learnings.javax.ws.handling.exception;

public class InvalidInputException extends Exception {

	String exceptionDetails;

	public InvalidInputException(String reason, String exceptionDetails) {
		super(reason);
		this.exceptionDetails = exceptionDetails;
	}
	public String getFaultInput() {
		return exceptionDetails;
	}
	
}
