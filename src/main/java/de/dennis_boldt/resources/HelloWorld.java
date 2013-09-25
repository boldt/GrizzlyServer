package de.dennis_boldt.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/helloworld")
public class HelloWorld {

	@GET
	@Produces("text/plain")
	public Response getTextPlain() {
		return Response.ok().entity("Hello World").build();
	}

	@GET
	@Produces("text/html")
	public Response getTextHtml() {
		return Response.ok().entity("<strong>Hello World</strong>").build();
	}



}
