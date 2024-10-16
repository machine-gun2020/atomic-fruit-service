package com.redhat.atomic.fruit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/fruit")
public class FruitResource {

    private static final Logger log = LoggerFactory.getLogger(FruitResource.class);

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String Hello() {
        return "hello";
    }
}
