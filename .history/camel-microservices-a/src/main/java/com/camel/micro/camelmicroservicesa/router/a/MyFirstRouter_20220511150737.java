package com.camel.micro.camelmicroservicesa.router.a;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyFirstRouter extends RouteBuilder{

    @Override
    public void configure() throws Exception {
        from("timer:first-timer")
        .transform().constant("My message")
        .to("log:first-timer");
    }
    
}