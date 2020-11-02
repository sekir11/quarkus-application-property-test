package org.acme.applicationpropertytest.controller;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/hello")
public class ApplicationPropertyTestController {

  @ConfigProperty(name = "test")
  private String test;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public void hello() {
      System.out.println(test);
    }
}








