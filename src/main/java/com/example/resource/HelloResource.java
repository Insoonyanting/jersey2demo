package com.example.resource;

import javax.ws.rs.GET;  
import javax.ws.rs.Path;  
import javax.ws.rs.Produces;  
import javax.ws.rs.PathParam;  
import javax.ws.rs.core.MediaType;

import com.example.model.User;  
  
@Path("/hello")  
public class HelloResource {  
    @GET  
    @Produces(MediaType.TEXT_PLAIN)  
    public String sayHello() {  
        return "hello jersey , first demo" ;  
    }  
   
      
    @GET  
    @Path("/{username}")    
    @Produces("text/plain;charset=UTF-8")  
    public String sayHelloToUTF8(@PathParam("username") String username) {  
        return "Hello " + username;  
    }  
    
    @GET  
    @Path("/getuser")  
    @Produces(MediaType.APPLICATION_JSON)  
    public User getUserJson() {  
     User user  = new User();  
     user.setAge(27);  
     user.setUserid("005");  
     user.setUsername("Fmand");  
     return user;  
    }
      
}  