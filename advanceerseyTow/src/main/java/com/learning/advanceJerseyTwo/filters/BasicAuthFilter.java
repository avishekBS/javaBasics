package com.learning.advanceJerseyTwo.filters;

import java.io.IOException;
import java.util.List;
import java.util.StringTokenizer;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.Provider;

import org.glassfish.jersey.internal.util.Base64;

@Provider
public class BasicAuthFilter implements ContainerRequestFilter {

	@Override
	public void filter(ContainerRequestContext requestContext) throws IOException {
		if (requestContext.getUriInfo().getAbsolutePath().toString().contains("basicAuthSecurity")) {
			MultivaluedMap<String, String> requestHeaders = requestContext.getHeaders();
			List<String> list = requestHeaders.get("Authorization");
			String decodeAsString = null;
			if (list != null && list.size() > 0) {
				for (String encodedAuth : list) {
					decodeAsString = Base64.decodeAsString(encodedAuth.replace("Basic ", ""));
					break;
				}
			if (decodeAsString != null) {
				StringTokenizer token = new StringTokenizer(decodeAsString, ":");
				String Username = token.nextToken();
				String password = token.nextToken();
				if ("user".equals(Username) && "password".equals(password)) {
					return;
				}
			}
			}
			/*
			 * If authentication failure
			 */
			Response build = Response
				.status(Status.UNAUTHORIZED)
				.entity("User authentication failure")
				.build();
			requestContext.abortWith(build);
			
		}
		}
}
