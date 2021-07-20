package com.learning.jaxrs.client;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

import com.learning.jersey.learningJerseyTwo.model.Message;

public class ClientGETInvocation {
	static Client client = ClientBuilder.newClient();
	
	public static void main(String[] args) {
		ClientGETInvocation invocationObj = new ClientGETInvocation();
		int year = 2021;
		Invocation prepareRequest = invocationObj.prepareRequest(year);
		
		//When return type is List of Messges....Convert to Generic types
		List<Message> response = prepareRequest.invoke(new GenericType<List<Message>>() {});
		System.out.println(response.toString());
		
	}

	public Invocation prepareRequest(int year) {
		WebTarget baseTarget = ClientGETMethod.client.target("http://localhost:8081/learningJerseyTwo/webapi/");
		WebTarget resourceTarget = baseTarget.path("messages");
		WebTarget queryParam = resourceTarget.queryParam("year", year);
		
		Invocation buildGet = queryParam
			.request(MediaType.APPLICATION_JSON)
			.buildGet();
		return buildGet;
	}
	
}
