package com.learning.jersey.learningJerseyTwo.resources;

import java.net.URI;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.HttpMethod;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;

import com.learning.jersey.learningJerseyTwo.beans.QueryParamBeans;
import com.learning.jersey.learningJerseyTwo.exception.MessageNotFoundException;
import com.learning.jersey.learningJerseyTwo.model.Message;
import com.learning.jersey.learningJerseyTwo.model.MessageError;
import com.learning.jersey.learningJerseyTwo.model.MessageHATEOS;
import com.learning.jersey.learningJerseyTwo.service.MessageService;

@Path("/messages")
public class MessageResource {

	MessageService service = null;
	public MessageResource() throws ParseException {
		service = new MessageService();
	}
	
	/*
	 * This method takes year param as /messages?year=2015 as @QueryParam anotation
	 * Also with , separator we use start=2&size=1
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMesssages(
			@QueryParam("year") int searchByYear,
			@QueryParam("start") int startIndex,
			@QueryParam("size") int searchSize
			) throws ParseException{
		if (searchByYear > 0)
			return service.getMessageServiceForYearFilter(searchByYear);
		else if (startIndex >=0 && searchSize > 0) {
			return service.getMessageServiceForYearFilter(startIndex, searchSize);
		}
		return service.getMessagesService();
	}
	
	@GET  
	@Path("/{messageId}")  //{} for any input after /messages/hackh
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMesssage(@PathParam("messageId") int id) throws ParseException, MessageNotFoundException{
		return service.getMessageService(id);
	}
	
	@POST 
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message addMesssage(Message message) throws ParseException{
		return service.addMessageService(message);
	}
	
	@PUT 
	@Path("/{messageId}") 
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message updateMesssage(@PathParam("messageId") int id, Message message) throws ParseException{
		return service.updateMessageService(id, message);
	}

	@DELETE 
	@Path("/{messageId}") 
	public void deleteMesssage(@PathParam("messageId") int id) throws ParseException{
		service.deleteMessageService(id);
	}
	
	@GET
	@Path("moreAnnotations")
	@Produces(MediaType.TEXT_PLAIN)
	public String getMoreAnnotations(
			@QueryParam("queryParam") int id,
			@MatrixParam("Matrixparam") String value, //--> /messages/moreAnnotations;Matrixparam=value
			@HeaderParam("Username") String username, //--> Add Header as Username
			@CookieParam("Cookiepassword") String password, //--> to add cookie for a session
			@Context UriInfo uri, //--> toGet all context Parameters
			@Context HttpHeaders httpHeaders // --> httpHeader to get all headers info
			) {
 return "Matrix Param value : "+ value 
		 + "\nHeader Param Value : "+ username
		 + "\nCookie Param value : "+ password
		 + "\nContext UriInfo get path : "+ uri.getPath()
		 + "\nContext UriInfo get Absolute path : "+ uri.getAbsolutePath()
		 + "\nContext UriInfo get Matched URIs : "+ uri.getMatchedURIs().toString()
		 + "\nContext UriInfo get path segments : "+ uri.getPathSegments().toString()
		 + "\nContext UriInfo get Query Param : "+ uri.getQueryParameters().toString()
		 + "\nContext httpHeaders get All Request Headers : "+ httpHeaders.getRequestHeaders().toString()
		 ;
	}
	
	/*
	 * Instead of using so many Query param we can use Beans param to make the code more readable
	 * 
	 */
	@GET
	@Path("beansParamDemo")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getQueryParam(
			@BeanParam QueryParamBeans queryParam  // check Query Param Beans class.
			) throws ParseException{
		if ( queryParam.getSearchByYear()> 0)
			return service.getMessageServiceForYearFilter(queryParam.getSearchByYear());
		else if (queryParam.getStartIndex() >=0 && queryParam.getSearchSize() >= 0) {
			return service.getMessageServiceForYearFilter(queryParam.getStartIndex(), queryParam.getSearchSize());
		}
		return service.getMessagesService();
	}
	
	/*
	// messages/{messageId}/comments/  should be redirected to comment resource class
	 * since message URL has dependency on comments we should use comments as href / links
	 */
	
	
	@Path("/{messageId}/comments") //sun resource linking
	public CommentResource getComments(){
		System.out.println("inside getComments of message resource");
		return new CommentResource();
	}
	
	@POST
	@Path("responseHeaders")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response addMessageReturnHeader(
			@Context UriInfo info,
			Message message) {
		Message msgObj = service.addMessageService(message);
		String msgId = String.valueOf(msgObj.getId());
		URI postUri = info.getAbsolutePathBuilder().path(msgId).build();
		return Response
				.created(postUri)
				.status(Status.CREATED)
				.entity(msgObj)
				.build();
	}
	@GET
	@Path("genericException")
	public Response throwGenericException(@Context UriInfo info) {
		int x = 1/0;
		URI postUri = info.getAbsolutePath();
		return Response
				.created(postUri)
				.status(Status.INTERNAL_SERVER_ERROR)
				.build();
	}
	
	@GET
	@Path("webApplicationException")
	public void throwWebApplicationException() {
		int x = 1/1;
		MessageError errorObj = new MessageError(Status.INTERNAL_SERVER_ERROR.getStatusCode(), "Arithemetic exception for webApplicationException Demo", Status.INTERNAL_SERVER_ERROR);
		Response response = Response.status(Status.INTERNAL_SERVER_ERROR)
				.entity(errorObj)
				.build();
		throw new WebApplicationException(response);
	}
	
	@GET
	@Path("/hateos/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMesssageHATEOS(@PathParam("messageId") int id, @Context UriInfo info) throws ParseException{
		Message message = service.getMessageServiceHATEOS(id);
		String postUri = info.getAbsolutePathBuilder().build().toString();
		message.addLink(postUri, "self");
		return message;
	}
}
