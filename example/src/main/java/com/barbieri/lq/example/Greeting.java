package com.barbieri.lq.example;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import jakarta.inject.Inject;

@Path("/greeting")
public class Greeting {

    GreetingConfig config;

    @Inject
    public Greeting(GreetingConfig config) {
        this.config = config;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getGreeting() {
        return "Hello " + config.getReceipient();
    }
}
