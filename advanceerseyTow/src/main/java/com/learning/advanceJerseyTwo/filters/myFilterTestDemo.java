package com.learning.advanceJerseyTwo.filters;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

@Provider
public class myFilterTestDemo implements ContainerRequestFilter, ContainerResponseFilter{

	@Override
	public void filter(ContainerRequestContext requestContext) throws IOException {
		System.out.println("from COINTAINER FILTER REQUEST.....");
	}

	@Override
	public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext)
			throws IOException {
		responseContext.getHeaders().add("api-powered-by", "Avishek's");
		System.out.println("from COINTAINER FILTER RESPONSE.....");
		
	}

}
