package com.vikram;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;


@Path("/expense")
public class Expense {

	@GET
	@Path("/{param}")
	public Response add(@PathParam("param") String id) {
 
		String output = "Deploying from eclipse The expense details for id " + id+" is Test expense";
 
		return Response.status(200).entity(output).build();
 
	}
	
	
}