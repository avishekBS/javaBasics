package com.learning.jaxrs.client;

import java.util.Date;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.learning.jersey.learningJerseyTwo.model.Message;

public class ClientPostMethod {
	static Client client = ClientBuilder.newClient();
	
	public static void main(String[] args) {
		WebTarget baseTarget = ClientPostMethod.client.target("http://localhost:8081/learningJerseyTwo/webapi/");
		WebTarget resourceTarget = baseTarget.path("messages");
		
		Message message = new Message(3, "test from client", "Abbey", new Date());
		
		Builder request = resourceTarget.request();
		Response response = request.post(Entity.json(message));
		
		Message responseMessage = response.readEntity(Message.class);
		System.out.println(responseMessage);
		
	}
	
}
