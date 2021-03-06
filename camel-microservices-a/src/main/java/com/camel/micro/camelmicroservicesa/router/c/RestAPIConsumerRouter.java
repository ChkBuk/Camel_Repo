package com.camel.micro.camelmicroservicesa.router.c;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

//@Component
public class RestAPIConsumerRouter extends RouteBuilder{

    @Override
    public void configure() throws Exception {
    	restConfiguration().host("localhost").port(8001);
        from("timer:rest-api-consumer?period=1000")
        .setHeader("from", () -> "EUR")
        .setHeader("to", () -> "USD")
        .log("${body}")
        .to("rest:get:/currency-exchange/from/{from}/to/{to}")
        .log("${body}");

    }
    
}
