package com.learning.jersey.learningJerseyTwo.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import com.learning.jersey.learningJerseyTwo.model.MessageError;

//@Provider  --> commented to check webApplicationEaxceptio
public class GenericExceptionMapper implements ExceptionMapper<Throwable> {

	@Override
	public Response toResponse(Throwable exception) {
		MessageError errorObj = new MessageError(Status.INTERNAL_SERVER_ERROR.getStatusCode(), exception.getMessage(), Status.INTERNAL_SERVER_ERROR);
		return Response.status(Status.INTERNAL_SERVER_ERROR)
				.entity(errorObj)
				.build();
	}

}
