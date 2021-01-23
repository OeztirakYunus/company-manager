package at.htl.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/api/address")
public class AddressResource {
    @GET
    @Path("/hello")
    public String sayHello(){
        return "Hello";
    }
}