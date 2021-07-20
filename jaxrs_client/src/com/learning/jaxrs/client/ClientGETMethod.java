package com.learning.jaxrs.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.learning.jersey.learningJerseyTwo.model.Message;

public class ClientGETMethod {
	static Client client = ClientBuilder.newClient();
	
	public static void main(String[] args) {
		WebTarget baseTarget = ClientGETMethod.client.target("http://localhost:8081/learningJerseyTwo/webapi/");
		WebTarget resourceTarget = baseTarget.path("messages");
		WebTarget target = resourceTarget.path("{messageId}");
		WebTarget resolveTemplate = target.resolveTemplate("messageId", 2);
		
		Builder request = resolveTemplate.request(MediaType.APPLICATION_JSON);
		Response response = request.get();
		
		Message message = response.readEntity(Message.class);
		System.out.println(message.toString());
		
	}
	
}
