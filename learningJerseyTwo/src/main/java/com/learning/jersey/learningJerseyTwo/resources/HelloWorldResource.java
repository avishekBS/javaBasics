package com.learning.jersey.learningJerseyTwo.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/welcome")
public class HelloWorldResource {
	static {
		System.out.println("1st: static block is called");
	}
	
	{
		System.out.println("2nd: initailaizer block is called");
	}

	public HelloWorldResource() {
		System.out.println("3rd: Constructor is called");
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessage() {
		System.out.println("4th: the method is called");
		return "Welcome to JAX-RS learning";
	}

}
