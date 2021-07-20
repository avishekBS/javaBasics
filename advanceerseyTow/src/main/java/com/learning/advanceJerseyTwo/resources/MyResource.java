package com.learning.advanceJerseyTwo.resources;

import java.util.Calendar;
import java.util.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.learning.advanceJerseyTwo.model.MyDate;

@Path("advanceJerseyLearning")
//@Singleton //--> by default with every request new obj of resource is created. but if we want
//resource class to be init once then use @singleton
public class MyResource {
	private int counter;
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getTestString() {
		return "test web.xml no configuration";
	}
	@GET
	@Path("count")
	@Produces(MediaType.TEXT_PLAIN)
	public String getCounter() {
		counter++;
		return "Is singleton? If yes counter will increase with every request:"+ counter;
	}

	@PathParam("pathParam") private String pathParam;
	@QueryParam("queryParam") private String queryParam;
	
	@GET
	@Path("memberVariable/{pathParam}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getmemberVariable() {
		return "Path Param:"+pathParam + " -Query Param:"+queryParam;
	}
	
	@GET
	@Path("paramConverter/{date}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getParamConvert(@PathParam("date") MyDate Date) {
		return Date.getDay()+"/"+Date.getMonth()+"/"+Date.getYear();
	}
	
	@GET
	@Path("msgBodyWriter")
	@Produces(MediaType.TEXT_PLAIN)
	public Date getmsgBodyWriter() {
		return Calendar.getInstance().getTime();
	}
	@POST
	@Path("msgBodyReader")
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.TEXT_PLAIN)
	public Date getmsgBodyReader(Date date) {
		System.out.println("msgBodyReader: return date");
		return date;
	}
	
	@GET
	@Path("CustomMediaType")
	@Produces("application/myCustomMediaType")
	public Date getCustomMediaType() {
		return Calendar.getInstance().getTime();
	}
}
