package com.learning.jersey.learningJerseyTwo.model;

import javax.ws.rs.core.Response;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MessageError {

	private int errorCode;
	private String errorDetails;
	private Response.Status response;

	public MessageError() {
		// TODO Auto-generated constructor stub
	}

	public MessageError(int errorCode, String errorDetails, Response.Status notFound) {
		this.errorCode = errorCode;
		this.errorDetails = errorDetails;
		this.response = notFound;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorDetails() {
		return errorDetails;
	}

	public void setErrorDetails(String errorDetails) {
		this.errorDetails = errorDetails;
	}

	public Response.Status getResponse() {
		return response;
	}

	public void setResponse(Response.Status response) {
		this.response = response;
	}
	
}
