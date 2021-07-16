package com.learning.jersey.learningJerseyTwo.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.learning.jersey.learningJerseyTwo.model.MessageError;

@Provider
public class MessageNotFoundExceptionMapper implements ExceptionMapper<MessageNotFoundException> {

	@Override
	public Response toResponse(MessageNotFoundException exception) {
		MessageError errorObj = new MessageError(Status.NOT_FOUND.getStatusCode(), exception.getMessage(), Status.NOT_FOUND);
		return Response.status(Status.NOT_FOUND)
				.entity(errorObj)
				.build();
	}

}
