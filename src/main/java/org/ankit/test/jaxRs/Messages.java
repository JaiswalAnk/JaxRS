package org.ankit.test.jaxRs;

import java.util.HashMap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("myresource/messages")
public class Messages {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessages(){
		
		HashMap<String, String> map =  new HashMap<>();
		map.put("A", "ABC");
		return " My Resource Handlers";
	}

}
