package test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@Path("/startpoint")
public class Reststartpoint {
	@GET
	@Produces(MediaType.TEXT_XML)
	public String call0()
	{
		String resource = "<? xml version = '1.0' ?>" + "<startpoint> XML </startpoint>";
		return resource;
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String call2()
	{
		String resource = null ;
		return resource;
	}
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String call3()
	{
		String resource = "<h1> HTML </h1>";
		return resource;
	}
}
